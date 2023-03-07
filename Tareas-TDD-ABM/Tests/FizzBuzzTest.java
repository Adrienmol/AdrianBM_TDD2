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

    @Test
    void testAlPasarle4Devuelve4() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(4);
        assertEquals("4", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle5DevuelveBuzz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(5);
        assertEquals("Buzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle6DevuelveFizz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(6);
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }
}