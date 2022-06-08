package TDD;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetsTestTest {

//    @Test
//    @Tag("测试字符串中是否有'.'")
//    void onlyTest1() {
//        //测试字符串中是否有 .
//        assertTrue(LetsTest.checkStringIsIPV4Address("111.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("1jvusdigh"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("1,1,1,1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("1*1,1p1"));
//        assertTrue(LetsTest.checkStringIsIPV4Address("168.001.001.009"));
//    }
//
//    @Test
//    @Tag("测试字符中是否只有数字和'.'")
//    void onlyTest2() {
//        assertTrue(LetsTest.checkStringIsIPV4Address("1498.6.52.1"));
//        assertTrue(LetsTest.checkStringIsIPV4Address("14.52.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("1.jv.usdigh.5646"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("....."));
//        assertFalse(LetsTest.checkStringIsIPV4Address("4987498498"));
//    }
//
//    @Test
//    @Tag("每个字符串有只有数字和三个.")
//    void onlyTest3() {
//        assertTrue(LetsTest.checkStringIsIPV4Address("148.6.52.1"));
//        assertTrue(LetsTest.checkStringIsIPV4Address("14..52.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("14.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address(".1.1.1.1."));
//        assertFalse(LetsTest.checkStringIsIPV4Address("49.874.98.49.8"));
//    }
//
//    @Test
//    @Tag("测试字符串中三个.分别隔开数字")
//    void onlyTest4() {
//        assertTrue(LetsTest.checkStringIsIPV4Address("1498.6.52.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("14..52.1"));
//        assertFalse(LetsTest.checkStringIsIPV4Address("1...5646"));
//        assertFalse(LetsTest.checkStringIsIPV4Address(".1.1.24"));
//        assertTrue(LetsTest.checkStringIsIPV4Address("49.87.498.498"));
//    }

    @Test
    @Tag("测试字符串中三个`.`分别隔开数字的数字在0-255")
    void onlyTest5() {
        assertTrue(LetsTest.checkStringIsIPV4Address("98.6.52.1"));
        assertTrue(LetsTest.checkStringIsIPV4Address("14.5.2.1"));
        assertFalse(LetsTest.checkStringIsIPV4Address("1.255.5.646"));
        assertFalse(LetsTest.checkStringIsIPV4Address("-1.-2.3.5"));
        assertTrue(LetsTest.checkStringIsIPV4Address("168.001.001.009"));
    }
}
