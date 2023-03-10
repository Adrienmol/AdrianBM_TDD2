public class OpearcionesTDD {
    public int suma (String cadena) {
        if (cadena.equals("")) {
            return 0;
        }
        String acabaencoma="";
        for (int i = 0; i <cadena.length() ; i++) { //
            acabaencoma = cadena.substring(i);
        }
        if (acabaencoma.equals(",")) {
            return -1;
        }
        String numeros[] = cadena.split(","); //Método que separa los números de las comas.
        int total=0;
        int actual;
        for (int i = 0; i < numeros.length; i++) { //Recorro el array de nuestros números.
            actual = Integer.valueOf(numeros[i]); //Convierto el valor de cada posición del array a int.
            if (actual < 0) {
                System.out.println("Número negativo no permitido");
                return -1;
            }
            if (actual <= 1000) {
                total += actual; //Aumento el valor de total para devolverlo después.
            } else {
                System.out.println("Numero superior a 1000 ignorado");
                return total;
            }
        }
        return total;
    }
}
