/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

import java.util.Scanner;
public class Page_Ian_Fecha {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Formato de fecha: Dia/Mes/Año");
        
        System.out.println("Ingrese la Primera fecha: ");
        String fecha1 = scanner.nextLine();
        
        System.out.println("Ingres las segunda fecha: ");
        String fecha2 = scanner.nextLine();
        
        int pleca11 = fecha1.indexOf('/');
        int pleca21 = fecha1.indexOf('/', pleca11);
        
        
        
        
        
    }
}
