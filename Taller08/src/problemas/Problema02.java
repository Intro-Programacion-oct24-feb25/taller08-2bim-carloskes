/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double faren;
        double celc;
        
        int contador = 0;
        
        String cadenaFinal = "";

        
        
        for (faren = 20; faren <= 100; faren+=4) {
            
            celc = (5.0/9.0)*(faren - 32);
            

            cadenaFinal = String.format("%s(Operación)(%d)Fahrenheit:%.2f ==> "
                    + "Celcius:%.2f\n",
                    cadenaFinal,contador,faren,celc);
            contador=contador+1;
            

        }
        System.out.printf("%s\n", cadenaFinal);
    }
}
