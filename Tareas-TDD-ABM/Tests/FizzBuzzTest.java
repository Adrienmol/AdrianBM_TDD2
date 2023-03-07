import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testAlPasarle1Devuleve1() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(1);
        assertEquals("1", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle2Devuelve2() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(2);
        assertEquals("2", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle3DevuelveFizz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(3);
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }
}