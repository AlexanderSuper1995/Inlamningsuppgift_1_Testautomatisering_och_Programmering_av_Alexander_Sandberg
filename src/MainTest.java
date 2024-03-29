import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
        logikklass x = new logikklass();
        String actual = x.gettext(".-");
        String expected = "A";
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        logikklass x = new logikklass();
        String actual = x.gettext("-...");
        String expected = "B";
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        logikklass x = new logikklass();
        String actual = x.gettext("-.-.");
        String expected = "C";
        assertEquals(expected, actual);
    }
    @Test
    void test4_when_it_doesnt_exist() {
        logikklass x = new logikklass();
        String actual = x.gettext("CC");
        String expected = "Det finns inte CC";
        assertEquals(expected, actual);
    }


    }
