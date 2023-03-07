import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testAlPasarle1Devuleve1() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        String FizzBuzz = prueba.imprimirResultado(1);
        //Assert
        assertEquals("1", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle2Devuelve2() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(2);
        //Assert
        assertEquals("2", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle3DevuelveFizz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(3);
        //Assert
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle4Devuelve4() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(4);
        //Assert
        assertEquals("4", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle5DevuelveBuzz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(5);
        //Assert
        assertEquals("Buzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle6DevuelveFizz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(6);
        //Assert
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle7Devuelve7() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(7);
        //Assert
        assertEquals("7", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle8Devuelve8() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(8);
        //Assert
        assertEquals("8", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle9DevuelveFizz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(9);
        //Assert
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle10DevuelveBuzz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(10);
        //Assert
        assertEquals("Buzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle11Devuelve11() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(11);
        //Assert
        assertEquals("11", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle12DevuelveFizz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(12);
        //Assert
        assertEquals("Fizz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle13Devuelve13() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(13);
        //Assert
        assertEquals("13", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle14Devuelve14() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(14);
        //Assert
        assertEquals("14", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

    @Test
    void testAlPasarle15DevuelveFizzBuzz() {
        //Arrange
        FizzBuzz prueba = new FizzBuzz();
        //Act
        String FizzBuzz = prueba.imprimirResultado(15);
        //Assert
        assertEquals("FizzBuzz", FizzBuzz);
        System.out.println("Resultado:" + " " + FizzBuzz);
    }

}