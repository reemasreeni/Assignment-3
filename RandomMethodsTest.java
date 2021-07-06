public class RandomMethodsTest(
    RandomMethods randomTest = new RandomMethods();

    public void daysInMonthTest(){
        assertEquals("January 2002 has 31 days", randomTest.daysInMonth(1, 2002));
        assertEquals("February 2002 has 28 days", randomTest.daysInMonth(2, 2002));
        assertEquals("March 2002 has 31 days", randomTest.daysInMonth(3, 2002));
        assertEquals("April 2002 has 30 days", randomTest.daysInMonth(4, 2002));
        assertEquals("May 2002 has 31 days", randomTest.daysInMonth(5, 2002));
        assertEquals("June 2002 has 30 days", randomTest.daysInMonth(6, 2002));
        assertEquals("July 2002 has 31 days", randomTest.daysInMonth(7, 2002));
        assertEquals("August 2002 has 31 days", randomTest.daysInMonth(8, 2002));
        assertEquals("September 2002 has 30 days", randomTest.daysInMonth(9, 2002));
        assertEquals("October 2002 has 31 days", randomTest.daysInMonth(10, 2002));
        assertEquals("November 2002 has 30 days", randomTest.daysInMonth(11, 2002));
        assertEquals("December 2002 has 31 days", randomTest.daysInMonth(12, 2002));
        assertEquals("Unknown month number", randomTest.daysInMonth(13, 2002));
    }

    public void testLargestNumber(){
        assertFalse(randomTest.largestNumber(0, 3, 1));
        assertFalse(randomTest.largestNumber(100, 4, 7));
    }

    public void testisNegative(){
        assertFalse(randomTest.isNegative(5));
        assertFalse(randomTest.isNegative(-5));
        assertFalse(randomTest.isNegative(0));
    }

    public void testStringLength(){
        assertEquals(0, randomTest.stringLength(""));
        assertEquals(1, randomTest.stringLength("library"));
        assertEquals(2, randomTest.stringLength("javascript"));
        assertEquals(3, randomTest.stringLength("aeiou"));
        assertEquals(4, randomTest.stringLength("spy"));
        assertEquals(5, randomTest.stringLength("fdrkl"));
        assertEquals(0, randomTest.stringLength("can"));
    }
)