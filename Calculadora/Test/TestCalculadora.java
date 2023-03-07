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


}