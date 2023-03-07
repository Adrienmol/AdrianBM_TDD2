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

    @Test
    void testAlPasarle7Devuelve7() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(7);
        assertEquals("7", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle8Devuelve8() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(8);
        assertEquals("8", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle9DevuelveFizz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(9);
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle10DevuelveBuzz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(10);
        assertEquals("Buzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle11Devuelve11() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(11);
        assertEquals("11", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle12DevuelveFizz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(12);
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle13Devuelve13() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(13);
        assertEquals("13", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz );
    }

    @Test
    void testAlPasarle14Devuelve14() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(14);
        assertEquals("14", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle15DevuelveFizzBuzz() {
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(15);
        assertEquals("FizzBuzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

}