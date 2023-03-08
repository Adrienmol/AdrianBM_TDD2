import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestCalculadora {

    @Test
    void testPoner0Devuelve0() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("");
        //Assert
        assertEquals(0, resultado);
        System.out.println(resultado);
    }

    @Test
    void testAlPoner1Devuelve1() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("1");
        //Assert
        assertEquals(1, resultado);
        System.out.println(resultado);
    }

    @Test
    void testAlPoner1y2Devuelve3() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("1,2");
        //Assert
        assertEquals(3, resultado);
        System.out.println(resultado);
    }

    @Test
    void testAlPoner1y1y2Devuelve4() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("1,1,2");
        //Assert
        assertEquals(4, resultado);
        System.out.println(resultado);
    }

    @Test
    void testAlPasarComaDeMasDevuelveMenos1() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("1,2,");
        //Assert
        assertEquals(-1, resultado);
        System.out.println(resultado);
    }

    @Test
    void testAlPasarNegativoDevuelveMenos1YMensajeDeError() {
        //Arrange
        OpearcionesTDD calculadora = new OpearcionesTDD();
        //Act
        int resultado = calculadora.suma("1,2,-2");
        //Assert
        assertEquals(-1, resultado);
        System.out.println(resultado);
    }


}