/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;
import java.util.Scanner;
public class Page_Ian_Tiempo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de segundos:");
        int cantSegundos = scanner.nextInt();
        
        if (cantSegundos <= 0){
            System.out.println("No se premite ese valor");
        }
        
        int horas = cantSegundos / 3600;
        int segundosRestantes = cantSegundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundosRestantes2 = segundosRestantes % 60;
        
        System.out.println( horas + "horas, " + minutos + "minutos y " + segundosRestantes2 + "segundos");
        
        
    }
}
