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
        
        do{                                                          //menu principal
        System.out.println("[IPC]Tarea3_201700648");
        System.out.println("");
        System.out.println("1.Usuario");
        System.out.println("2.Contador de digitos repetidos");
        System.out.println("3.Tres números de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");                              //Aqui termina el menu principal
        opcion = entrada.nextInt();
        
        switch(opcion){
        
            ///////////                   MENU USUARIOS
            case 1:
            System.out.println("1.Ingresar Usuario");
            System.out.println("2.Mostrar Usuarios ascendente");
            System.out.println("3.Mostrar Usuarios descendentes");
            System.out.println("0.Menu principal"); 
                    opcion = entrada.nextInt();
                    
                    switch(opcion){
                        case 1://Ingresar Usuario
                            String usuario = "";
                            Scanner usur = new Scanner(System.in);
                            System.out.println("");
                            

                            
                            String usuarios[] = new String[5]; //define el numero de casillas del vector dinamico con[]
        
        for(int i=0; i<5; i++){
        System.out.println("Ingresar usuario #" + (i+1));
        usuarios[i] = usur.nextLine(); //define el valor(usuarios) del vector dinamico
        }
        System.out.println("2. Mostrar Usuarios Ascendentes");
        System.out.println("3. Mostrar Usuarios Descendentes");
        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 2:
                                    for(int i=0; i<5; i++){
                                        System.out.println("["+ (i+1) +"." +  usuarios[i] +"]"); //salida a pantalla vector
                                    }
                                            break;

                                            case 3:
                                    for(int i=0; i<5; i++){
                                        System.out.println("["+ (5-i) +"." +  usuarios[i] +"]"); //salida a pantalla vector
                                    }
                                            break;
                                        }
                            
                     break; 
                        case 2:
                            System.out.println("debe de ingresar usuarios primero");
                            break;
                        case 3:
                            System.out.println("debe de ingresar usuarios primero");
                            break;
                        case 4:
                        default:
                            System.out.println("opcion erronia debe ser de 0 - 2");
                            break;
                    }
                   
            break;
            
            
            
            
            /////////          MENU CONTADOR DE DIGITOS
            
            
            
            
        case 2://Menu Contador de digitos repetidos
            System.out.println("1.Ingresar numero");
            System.out.println("2.Ingresar numero a buscar");
            System.out.println("3.Mostrar numero de digitos");
            System.out.println("0.Menu principal");
                    opcion = entrada.nextInt();
                    
                    switch(opcion){
                        case 1:
 
                            String cadena = "", cadenacorta = "";
                                                int num_caracteres = 0, desde = 0, hasta = 0;
                                                Scanner in = new Scanner(System.in);

                                                System.out.print("Ingresa su numero:");
                                                cadena = in.nextLine();

                                                num_caracteres = cadena.length();       //vuelve el string en int

                                                System.out.println("numero " + cadena + " posee " + num_caracteres + " numeros" );

                                                System.out.println("Qué numero desea?:");
                                                desde = in.nextInt();
                                               
                                                hasta = desde;

                                                cadenacorta = cadena.substring(desde-1,(hasta+1)-1);         //substring acorta los caracteres
                                                System.out.println("su numero es: "+ cadenacorta);
                               break;
                         case 2: 
                                       
                            System.out.println("Debe ingresar primero un numero");
                                        
                            break;
                        case 3:
                            
                            System.out.println("Debe ingresar primero un numero");
                            
                         break;
                    }
            break;//case 2 
            
            
            ////////////////        MENU TRES NUMEROS DE MAYOR A MENOR
            
            
        case 3://Menu Tres numeros de mayor a menor
            System.out.println("1.Ingresar numero");
            System.out.println("2.Mostrar ordenados");
            System.out.println("0.Menu principal");
                    opcion = entrada.nextInt();
                    
                    switch(opcion){
                        case 1:
                            int a = 0, b = 0, c =0;
                            System.out.println("ingrese el primer número:");
                            a = entrada.nextInt();
                            System.out.println("ingrese el segundo número:");
                            b = entrada.nextInt();
                            System.out.println("ingrese el tercer número:");
                            c = entrada.nextInt();
                            
                            if(a>b){
                                if(b>c){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ a + "," + b + "," + c);
                                }else if(c>b){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ a + "," + c + "," +  b);
                                }
                                
                            }else if(b>a){
                                if(a>c){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ b + "," + a + ","+ c);
                                }else if(c>a){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ b + "," + c + ","+ a);
                                }
                            }else if(c>a){
                                if(a>b){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ c + "," + a + ","  + b);
                                }else if(b>a){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ c + "," + b +  "," + a);
                                }
                            }else if(a>c){
                                if(c>b){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ a + "," + c + ","  + b);
                                }else if(b>c){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ a + "," + b + ","  + c);
                                }
                            }else if(b>c){
                                if(c>a){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ b + "," + c + ","  + a);
                                }else if(a>c){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ b + "," + a + ","  + c);
                                }
                            }else if(c>b){
                                if(b>a){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ c + "," + b+ ","  + a);
                                }else if(a>b){
                                    System.out.println("sus numeros en orden de mayor a menor: "+ c + "," + a + ","  + b);
                                }
                                    
                            }
                            break;
                        case 2:
                            
                            break;
                        
                    }
         
            break;       
            
            
            ///////////             MENU CALCULAR PROMEDIO
            
            
         case 4://Menu Calcular promedio(4notas de 6 estudiantes)
                System.out.println("1.opcion");
                System.out.println("2.opcion");
            break;    
            
            
            /////////////////                   SALIR
            
         case 5://5.Salir
                System.out.println("finalizado");
         case 6:
         default:
                System.out.println("opcion erronia debe ser de 1 - 5");
            break;
            }//fin switch menu principal
        }while(opcion==0);
          
    }//Fin Tarea3-----------------------------------------------------------.
}
