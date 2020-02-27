package lecture.excurs.UnitTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static private Calculator testCalculatore;

    @BeforeAll
    static void initialSetup() {
        testCalculatore = new Calculator();

    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void add() {
        int erg = testCalculatore.add(5, 10);
        assertEquals(15, erg);
    }

    @DisplayName(value = "Substract one - negative result")
    @Test
    void substract() {
        int erg = testCalculatore.substract(5, 10);
        assertEquals(-5, erg);
    }

    @Test
    void multiply() {
        int erg = testCalculatore.multiply(5, 10);
        assertEquals(50, erg);
    }


    @Test
    void divide() {
        int erg = testCalculatore.divide(10, 5);
        assertEquals(2, erg);
    }

    @DisplayName("Divide by Zero")
    @Test
    void divideByZero() {

        assertThrows(ArithmeticException.class, () -> {
            int erg = testCalculatore.divide(100, 0);
        });

        /*try {
            int erg = testCalculatore.divide(100, 0);
        } catch (Exception e) {
            assertEquals("/ by zero", e.getMessage());
        }*/
    }
}