/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int num;
        int num2 = 60;
        int num3 = 90;
        int num4 = 120;
        String cadenaFinal = "";

        for (num = 30; num >= 10; num--) {

            cadenaFinal = String.format("%s%d-%d-%d-%d\n",
                    cadenaFinal, num, num2, num3, num4);

            num2 = num2 - 2;
            num3 = num3 - 3;
            num4 = num4 - 4;

        }
        System.out.printf("%s\n", cadenaFinal);
    }
}
