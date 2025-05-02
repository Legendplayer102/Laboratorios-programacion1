/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.pkg2;


import java.util.Scanner;
public class Laboratorio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pedir datos iniciales
        
        System.out.println("Ingrese la fecha actual en formato 'dia, DD/MM': ");
        String fechaActual = scanner.nextLine().toLowerCase();
        
        int afterComa = fechaActual.indexOf (',');
        if (afterComa == -1) {
            System.out.println("Le falto la coma despues de el dia actual");
           
            return;
        }
        
            
        String diaSemana = fechaActual.substring(0, afterComa).trim();
        
        String fecha = fechaActual.substring(afterComa + 1).trim();
        
        int plecaSeparacion = fecha.indexOf('/');
        
        if (plecaSeparacion == -1) {
            System.out.println("Falta la pleca en la fecha");
        
            scanner.close();
            return;
        }
        
        String dia = fecha.substring(0, plecaSeparacion).trim();
        String mes = fecha.substring(plecaSeparacion + 1).trim();
        
        if(!isNumeric(dia) || !esNumerico(mes))
        
        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        
        if (diaInt > 31 || diaInt < 1 || mesInt >12 || mesInt <1) {
            System.out.println("Dia o Mes Invalido");
            return;
        }

        if (!diaSemana.equals("lunes") && !diaSemana.equals("martes") && !diaSemana.equals("miercoles") && !diaSemana.equals("jueves") && !diaSemana.equals("viernes")) {
            System.out.println("Dia invalido");
            
            return;
        }
        
        if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles")){
            procesarExamenes(scanner);
        }
        
        
    
            
      
        
        
        
                
    }
    
    
}