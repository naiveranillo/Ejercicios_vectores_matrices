import java.util.*;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naiver Anillo
 */
public class Menu_Matriz {

    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        int opc;
    do {
       System.out.println("\n[MENU]"
               + "\n1. ADIVINAR UN NUMERO DE 2 CIFRAS (DEL 10 AL 20)"
               + "\n2. EN UNA MATRIZ INTERCAMBIAR LOS ELEMENTOS DE LA PRIMERA COLUMNA CON LA ULTIMA COLUMNA"
               + "\n3. EN UNA MATRIZ SUMAR SUS COLUMNAS Y FILAS, ALMACENADAS EN UN VECTOR A Y B"
               + "\n4. SALIR"); 
       opc=lea.nextInt();
       
       switch (opc) {
           case 1:
               int cont=5,adiv=0,NAleatorio;
               boolean swc1=false;
               System.out.println("\n---------------------------------------------------");
               System.out.println("[ADIVINA UN NUMERO DE 2 CIFRAS, TIENES 5 INTENTOS]");
               System.out.println("---------------------------------------------------");
               
               Random GeneradorAleatorios = new Random(); // Generador de numeros aleatorios
               NAleatorio = 11+GeneradorAleatorios.nextInt(10); //Genera un numero aleatorio desde el 10 hasta el 20 y lo guarda en la variable NAleatorio
               while (cont>0 && swc1==false) {
                   
                System.out.println("DIGITE:");
                adiv=lea.nextInt(); 
               
                if (adiv==NAleatorio) {
                swc1=true;
                }else{
                   if (NAleatorio>adiv){
                       System.out.println("El numero a adivinar es mayor que "+adiv);
                       System.out.println("¡TIENES "+(cont=cont-1)+" INTENTO/S!\n");
                       System.out.println("-------------------------------");
                   }else{
                       System.out.println("El numero a adivinar es menor que "+adiv);
                       System.out.println("¡TIENES "+(cont=cont-1)+" INTENTO/S!\n");
                       System.out.println("-------------------------------");
                   }
                }
                }
             
                if (swc1==false){
                    System.out.println("[PERDISTES, EL NUMERO A ADIVINAR ES: "+NAleatorio+"]");
                    System.out.println("---------------[FIN DEL JUEGO]----------------");
                }else{
                    System.out.println("[¡¡GANASTES!!, EL NUMERO A ADIVINAR ES: "+NAleatorio+"]");
                    System.out.println("---------------[FIN DEL JUEGO]----------------");
                }
           break;
           
           case 2:
               int f=0,c=0,aux=0;  
               System.out.println("\n[CREACION DE LA MATRIZ]\n");
               System.out.println("Digite numero de filas: ");
               f=lea.nextInt();
               System.out.println("Digite numero de columnas: ");
               c=lea.nextInt();
               int matriz[][] = new int [f+1][c+1];
                   
               for (int i=1;i<=f;i++){
                  for (int j=1;j<=c;j++){
                       System.out.println("Digite un numero de la posicion ["+i+"]["+j+"]");
                       matriz[i][j]=lea.nextInt();
                  }
               }       
               System.out.println("------------------");
               System.out.println("[MATRIZ CREADA]");
             for (int i=1;i<=f;i++){
                  for (int j=1;j<=c;j++){
                       System.out.print("["+matriz[i][j]+"]");
                  }
                  System.out.print("\n");
              }  
             System.out.println("------------------");
                for (int i=1;i<2;i++){
                      for (int j=1;j<=f;j++){
                          aux=matriz[j][i];
                          matriz[j][i]=matriz[j][c];
                          matriz[j][c]=aux;
                      }
                }    
            System.out.println("[COLUMNAS INTERCAMBIADAS]");
            
             for (int i=1;i<=f;i++){
                  for (int j=1;j<=c;j++){
                        System.out.print("["+matriz[i][j]+"]");
                  }
                  System.out.print("\n");
             }  
              System.out.println("------------------");
           break;
       
           case 3:
               int F=0,C=0,sum=0;
               System.out.println("\n[CREACION DE LA MATRIZ]\n");
               System.out.println("Digite numero de filas: ");
               F=lea.nextInt();
               System.out.println("Digite numero de columnas: ");
               C=lea.nextInt();
               int Z[][] = new int [F+1][C+1];
               int VectorA[]=new int[C+1];
               int VectorB[]=new int[F+1];
               for (int i=1;i<=F;i++){
                  for (int j=1;j<=C;j++){
                       System.out.println("Digite un numero de la posicion ["+i+"]["+j+"]");
                       Z[i][j]=lea.nextInt();
                  }
               }       
               System.out.println("------------------");
               System.out.println("[MATRIZ CREADA]");
             for (int i=1;i<=F;i++){
                  for (int j=1;j<=C;j++){
                        System.out.print("["+Z[i][j]+"]");
                  }
                  System.out.print("\n");
             }
             System.out.println("------------------");
            for (int i=1;i<=F;i++){
                 sum=0;
                 for (int j=1;j<=C;j++){
                        sum=Z[i][j]+sum;
                 }
                 VectorB[i]=sum;
            }
            System.out.println("[SUMA DE FILAS] ");
            for (int i=1;i<=F;i++) {
                System.out.print(" | F"+i+": "+VectorB[i]);
            } 
            System.out.println("\n------------------");
            for (int i=1;i<=C;i++){
                sum=0;
                for (int j=1;j<=F;j++){
                    sum=Z[j][i]+sum;
                }
                VectorA[i]=sum;
            }
            System.out.println("[SUMA DE COLUMNAS] ");
            for (int i=1;i<=C;i++) {
                System.out.print(" | C"+i+": "+VectorA[i]);
            } 
            System.out.println("\n------------------");
         break;
      }
       
       
   }while(opc!=4);
 }
    
}
