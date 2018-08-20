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
                            System.out.println("debe ingresar primero los numeros");
                            break;
                            case 3:
                            default:
                                System.out.println("opcion erronia");
                            break;  
                    }
            break;       
                    
            
            ///////////             MENU CALCULAR PROMEDIO
            
            
         case 4://Menu Calcular promedio(4 notas de 6 estudiantes)
                System.out.println("1.Ingresar notas");
                System.out.println("2.Mostrar notas");
                System.out.println("0.Menu Principal");
                opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                                int id=0, id_2=0, id_3=0, id_4=0, id_5=0, id_6=0, contador = 1;
                                int n1 = 0,   n2 = 0,   n3 = 0,   n4 = 0;
                                int n1_2 = 0, n2_2 = 0, n3_2 =0, n4_2 = 0;
                                int n1_3 = 0, n2_3 = 0, n3_3 =0, n4_3 = 0;
                                int n1_4 = 0, n2_4 = 0, n3_4 =0, n4_4 = 0;
                                int n1_5 = 0, n2_5 = 0, n3_5 =0, n4_5 = 0;
                                int n1_6 = 0, n2_6 = 0, n3_6 =0, n4_6 = 0;
                                int p1 = 0, p2=0, p3=0, p4=0, p5=0, p6=0;

                                    ////////////primer promedio
                                        System.out.println("Ingrese el id");
                                        id = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4 = entrada.nextInt();
                                    ////////////segundo promedio    
                                        System.out.println("Ingrese el segundo id");
                                        id_2 = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1_2 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2_2 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3_2 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4_2 = entrada.nextInt();
                                    ////////////tercer promedio    
                                        System.out.println("Ingrese el tercer id");
                                        id_3 = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1_3 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2_3 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3_3 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4_3 = entrada.nextInt();
                                    ////////////cuarto promedio    
                                        System.out.println("Ingrese el tercer id");
                                        id_4 = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1_4 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2_4 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3_4 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4_4 = entrada.nextInt();
                                    ////////////quinto promedio    
                                        System.out.println("Ingrese el tercer id");
                                        id_5 = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1_5 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2_5 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3_5 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4_5 = entrada.nextInt();
                                    ////////////secto promedio    
                                        System.out.println("Ingrese el tercer id");
                                        id_6 = entrada.nextInt();
                                        System.out.println("Ingrese la primera nota");
                                        n1_6 = entrada.nextInt();
                                        System.out.println("Ingrese la segunda nota");
                                        n2_6 = entrada.nextInt();
                                        System.out.println("Ingrese la tercer nota");
                                        n3_6 = entrada.nextInt();
                                        System.out.println("Ingrese la cuarta nota");
                                        n4_6 = entrada.nextInt();
                                        
                                            int matriz[][]= new int[6][6];  // matriz[filas j]x[columnas i] 

                                            for(int j=0; j < 6; j++){               //llena de izquierda a derecha de fila en fila
                                            for(int i=0; i < 6; i++){
                                                matriz[0][0] = id;
                                                matriz[0][1] = n1;
                                                matriz[0][2] = n2;
                                                matriz[0][3] = n3;
                                                matriz[0][4] = n4;
                                                p1 = (n1 + n2 + n3 + n4)/4;
                                                matriz[0][5] = p1;
                                                
                                                matriz[1][0] = id_2;
                                                matriz[1][1] = n1_2;
                                                matriz[1][2] = n2_2;
                                                matriz[1][3] = n3_2;
                                                matriz[1][4] = n4_2;
                                                p2 = (n1_2 + n2_2 + n3_2 + n4_2)/4;
                                                matriz[1][5] = p2;
                                                
                                                matriz[2][0] = id_3;
                                                matriz[2][1] = n1_3;
                                                matriz[2][2] = n2_3;
                                                matriz[2][3] = n3_3;
                                                matriz[2][4] = n4_3;
                                                p3 = (n1_3 + n2_3 + n3_3 + n4_3)/4;
                                                matriz[2][5] = p3;
                                                
                                                contador++;
                                            System.out.print("["+ matriz[j][i]+"]");
                                            }
                                            System.out.println("");

                                        }
                                break;
                        }
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
