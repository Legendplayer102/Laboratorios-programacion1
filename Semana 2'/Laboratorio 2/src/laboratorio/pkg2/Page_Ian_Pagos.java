/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg2;

import java.util.Scanner;
public class Page_Ian_Pagos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***Informacion de Categorias***");
        System.out.println("Categoria 1 - $40 por hora extra");
        System.out.println("Categoria 2 - $50 por hora extra");
        System.out.println("Categoria 3 - $85 por hora extra");
        System.out.println("Categoria 4 - $0 no aplican horas extra");
        
        System.out.println("Ingrese el codigo del empleado: ");
        int codigoEmpleado = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del empleado");
        String nombre = scanner.nextLine();
                
        System.out.println("Ingrese el apellido del empleado");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese cantidad de horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese la categoria del trabajador");
        int categoria = scanner.nextInt();
        
        double horasNormales = 40;
        double pagoNormal = 35.99;
        double maxHorasExtra = 15;
        
        horasNormales = (horasTrabajadas > horasNormales) ? horasNormales : horasTrabajadas;
        double horasExtra = 0;
        
        if (horasTrabajadas > horasNormales && categoria != 4){
            horasExtra = horasTrabajadas - horasNormales;
            horasExtra = (horasExtra > maxHorasExtra) ? maxHorasExtra : horasExtra;
        }
        
        double cantPagoNormal = horasNormales * pagoNormal;
        double pagoExtra = 0;
        
        switch (categoria){
            case 1:
                pagoExtra = horasExtra * 40;
                break;
            case 2:
                pagoExtra = horasExtra * 50;
                break;
            case 3:
                pagoExtra = horasExtra * 85;
                break;
            case 4:
                pagoExtra = 0;
                break;
            default:
                System.out.println("Categoria invalida. No habran horas extra");
                pagoExtra = 0;
        }
        
        double pagoTotal = pagoNormal + pagoExtra;
        
        System.out.println("\n *** Resumen de Pago ***");
        System.out.println("Empleado: " + nombre + " " + apellido + " (" + codigoEmpleado + ")");
        System.out.println("Categoria: " + categoria);
        System.out.println("Horas normales: " + horasNormales);
        System.out.println("Pago por horas normales: " + pagoNormal);
        
        if (categoria != 4 && horasExtra > 0) {
            System.out.println("Horas extra: " + horasExtra);
            System.out.println("Pago por horas extra: " + pagoExtra);
        } else {
            System.out.println("No aplican horas extra");
        }
        System.out.println("Total a Pagar: " + pagoTotal);

    }
}
