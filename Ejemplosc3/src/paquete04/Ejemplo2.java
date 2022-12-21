/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double operacion;
        int f;
        int c;

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = new double[2][3];
        /*
            1   4   3
            36  64  9
         */

        for (f = 0; f < dato1.length; f++) {
            for (c = 0; c < dato1[f].length; c++) {

                if (dato1[f][c] % 2 == 0) {
                    dato2[f][c] = dato1[f][c] * dato1[f][c];
                } else {
                    dato2[f][c] = dato1[f][c];
                }
                }
            }

            for (f = 0; f < dato1.length; f++) {
                for (c = 0; c < dato1[f].length; c++) {
                    System.out.printf("%.0f\t", dato2[f][c]);
                }
                System.out.println();
            }
            
          
        

    }

}
