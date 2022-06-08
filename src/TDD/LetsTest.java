package TDD;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetsTest {
    private static boolean IfHasPoint(String IPV4) {
        if (IPV4.contains(".") == true) {
            return true;
        }
        return false;
    }

    private static boolean IfOnlyPointNumber(String IPV4) {
        String pattern = "(.*)(\\d+)(.*)";      //匹配正则表达式
        boolean isMatch = Pattern.matches(pattern, IPV4);
        if (isMatch == true && IPV4.replaceAll("\\.", "").replaceAll("\\d", "").length() == 0) {
            return true;
        } else
            return false;
    }

    private static boolean IfHasThreePoint(String IPV4) {
        String pattern = "(\\.)";
        int patternNum = IPV4.split(pattern).length - 1;
        if (patternNum == 3) {
            return true;
        } else
            return false;
    }

    private static boolean IfPointPartNumber(String IPV4) {
        String pattern = "(\\.)";
        String partedString[] = IPV4.split(pattern);
        boolean flag = true;
        for (String ip : partedString) {
            String tempPattern = "(.*)(\\d)(.*)";
            boolean isMatch = Pattern.matches(tempPattern, ip);
            if (isMatch == true) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static boolean IfNumberFit(String IPV4) {
        String pattern = "(\\.)";
        String partedString[] = IPV4.split(pattern);
        boolean flag = true;
        for (String ip : partedString) {
            int num = Integer.parseInt(ip);
            if (num >= 0 && num <= 255) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean checkStringIsIPV4Address(String s) {
        boolean result = IfHasPoint(s);
        result = result && IfOnlyPointNumber(s);
        result = result && IfHasThreePoint(s);
        result = result && IfPointPartNumber(s);
        result = result && IfNumberFit(s);
        return result;
    }

    public static void main(String[] args) {
    }
}

