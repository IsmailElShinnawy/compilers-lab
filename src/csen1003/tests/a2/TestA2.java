package csen1003.tests.a2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1003.main.a2.A2Lexer;
import csen1003.main.a2.A2Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class TestA2 {

    /**
     * Parses a provided string using Task 9's grammar
     * and gets the value of the attribute "check" of the variable "s"
     *
     * @param input a string to parse
     * @return the value of the attribute "check" of the variable "s"
     */
    public static int sCheckValue(String input) {
        A2Lexer lexer = new A2Lexer(CharStreams.fromString(input));
        A2Parser parser = new A2Parser(new CommonTokenStream(lexer));
        return parser.s().check;
    }

    @Test
    public void testString0() {
        assertEquals(1, sCheckValue("2"));
    }

    @Test
    public void testString1() {
        assertEquals(0, sCheckValue("23#321"));
    }

    @Test
    public void testString2() {
        assertEquals(1, sCheckValue("512#399#099"));
    }

    @Test
    public void testString3() {
        assertEquals(0, sCheckValue("1#1"));
    }

    @Test
    public void testString4() {
        assertEquals(0, sCheckValue("12#34#56"));
    }

    @Test
    public void testString5() {
        assertEquals(0, sCheckValue("987#654#321"));
    }

    @Test
    public void testString6() {
        assertEquals(0, sCheckValue("2#4#6#8#10"));
    }

    @Test
    public void testString7() {
        assertEquals(0, sCheckValue("999#888#777#666#555"));
    }

    @Test
    public void testString8() {
        assertEquals(0, sCheckValue("1#1#1#1#11#1#1"));
    }

    @Test
    public void testString9() {
        assertEquals(1, sCheckValue("12345#23456#34567#12345#2345612345#33456#34567"));
    }

    @Test
    public void testString10() {
        assertEquals(0, sCheckValue("111#222#333#111#222111#222#333"));
    }

    @Test
    public void testString11() {
        assertEquals(0, sCheckValue("1234#5678#12341234#56781"));
    }

    @Test
    public void testString12() {
        assertEquals(1, sCheckValue("222#246#135#146"));
    }

    @Test
    public void testString13() {
        assertEquals(0, sCheckValue("24680#13579#13579#13579"));
    }

    @Test
    public void testString14() {
        assertEquals(0, sCheckValue(
                "1234554321#2345543212#345543213#455432134#554321345#543213455#432124354#321235543#212343542#1234554321"));
    }

    @Test
    public void testString15() {
        assertEquals(0, sCheckValue(
                "1111111111#1111111111#1111111111#1111111111#1111111111#1111111111#1111111111#1111111111#1111111111#1111111111#"));
    }

    @Test
    public void testString16() {
        assertEquals(1, sCheckValue(
                "1234567890#2345678901#3456789012#4567890123#5678901234#6789012345#7890123456#8901234567#9012345678#0123456789"));
    }

    @Test
    public void testString17() {
        assertEquals(0, sCheckValue(
                "1111111111#1111111111#1111111111#1111111111#3333333333#1111111111#1111111111#1111111111#1111111111#1111111111"));
    }

    @Test
    public void testString18() {
        assertEquals(0, sCheckValue(
                "11111111111111111111#22222222222222222222#33333333333333333333#44444444444444444444#55555555555555555555#66666666666666666666#77777777777777777777#88888888888888888888#99999999999999999999#00000000000000000000#11111111111111111111#22222222222222222222#33333333333333333333#44444444444444444444#55555555555555555555#66666666666666666666#77777777777777777777#88888888888888888888#99999999999999999999#00000000000000000000"));
    }

    @Test
    public void testString19() {
        assertEquals(1, sCheckValue(
                "12345678901234567890#23456789012345678901#34567890123456789012#45678901234567890123#56789012345678901234#67890123456789012345#78901234567890123456#89012345678901234567#90123456789012345678#01234567890123456789#12345678901234567890#23456789012345678901#34567890123456789012#45678901234567890123#56789012345678901234#67890123456789012345#78901234567890123456#89012345678901234567#90123456789012345678#01234567890123456789"));
    }

    @Test
    public void testString20() {
        assertEquals(0, sCheckValue(
                "#"));
    }

    @Test
    public void testString21() {
        assertEquals(0, sCheckValue(
                "#1"));
    }

    @Test
    public void testString22() {
        assertEquals(1, sCheckValue(
                ""));
    }

}