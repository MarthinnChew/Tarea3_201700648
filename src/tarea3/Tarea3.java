/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;
import java.util.Scanner;
/**
 *
 * @author Marthinn Chew
 */
public class Tarea3 {//link GitHub:https://github.com/MarthinnChew/Tarea3_201700648.git

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        
                                                                  //menu principal
        System.out.println("[IPC]Tarea3_201700648");
        System.out.println("");
        System.out.println("1.Usuario");
        System.out.println("2.Contador de digitos repetidos");
        System.out.println("3.Tres números de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");                              //Aqui termina el menu principal
        opcion = entrada.nextInt();
        
        switch(opcion){
        case 1:// Menu Usuario
            System.out.println("1.Ingresar Usuario");
            System.out.println("2.Mostrar Usuarios ascendente");
            System.out.println("3.Mostrar Usuarios descendentes");
            System.out.println("4.Menu principal"); 
                    opcion = entrada.nextInt();
            break;
        case 2://Menu Contador de digitos repetidos
            System.out.println("1.Ingresar numero");
            System.out.println("2.Ingresar numero a buscar");
            System.out.println("3.Mostrar numero de digitos");
            System.out.println("4.Menu principal");
                    opcion = entrada.nextInt();
            break;        
        case 3://Menu Tres numeros de mayor a menor
            System.out.println("1.Ingresar numero");
            System.out.println("2.Mostrar ordenados");
            System.out.println("3.Menu principal");
                    opcion = entrada.nextInt();
            break;       
         case 4://Menu Calcular promedio(4notas de 6 estudiantes)
                System.out.println("1.opcion");
                System.out.println("2.opcion");
            break;    
         case 5://5.Salir
                System.out.println("finalizado");
         case 6:
         default:
                System.out.println("opcion erronia debe ser de 1 - 5");
            break;
            }//fin switch menu principal
          
    }//Finn Tarea3
}
