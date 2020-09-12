/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar_filascolumnas_elegidas;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Sumar_filasColumnas_elegidas {

    public static void main(String[] args) {
       
       Scanner ent = new Scanner (System.in);
       
       int F=0,C=0,SUM=0,k=1,aux=0;
       boolean sw=false;
       
       while(C<2 || F<2){
           System.out.println("[DIGITE 2 O MAS FILAS Y COLUMNAS EN LA MATRIZ]");
           System.out.println("Digite cantidad de filas: ");
           F=ent.nextInt();
           
           System.out.println("Digite cantidad de columnas: ");
           C=ent.nextInt();
       }
       
       int [][] M = new int [F+1][C+1];
       System.out.println("\n[COMENZAR A LLENAR LA MATRIZ]");
       for (int i=1;i<=F;i++){
           for(int j=1;j<=C;j++){
               System.out.println("Digite un numero en la posicion ["+i+"]["+j+"]: ");
               M[i][j]=ent.nextInt();
           }
       }
       
       int CFS=F+1,CCS=C+1;
       while (CFS>F || CCS>C){
           System.out.println("[DIGITE CUANTAS FILAS Y COLUMNAS QUIERE SUMAR SIN PASARSE");
           System.out.println("DE LAS FILAS Y COLUMNAS EXISTENTES]");
           System.out.println("Filas existentes: "+F+" | Columnas existentes: "+C);
           
           System.out.println("Digite cantidad de filas que va a elegir: ");
           CFS=ent.nextInt();
           
           System.out.println("Digite cantidad de columnas que va a elegir: ");
           CCS=ent.nextInt();
       }
       
       int [] VF = new int [CFS+1];
       int [] VC = new int [CCS+1];
       int [] VSF = new int [CFS+1];
       int [] VSC = new int [CCS+1];
       
       sw=true;
       while (sw==true){ //FILAS 
           sw=false;
           System.out.println("[DIGITE LA POSICION DE LAS FILAS QUE QUIERAS SUMAR, SIN REPETIRLAS]");
           
           for(int i=1;i<=CFS;i++){
               System.out.println("Digite la posicion["+i+"]: ");
               VF[i]=ent.nextInt();
           }
           
           for (int i=1;i<=CFS;i++){
               for (int j=i+1;j<=CFS;j++){
                   if(VF[i]==VF[j]){
                       sw=true;
                   }
               }
           }
           
           for (int i=1; i<=CFS; i++){
               for (int j=i+1;j<=CFS;j++){
                   if (VF[i]>VF[j]){
                       aux=VF[i];
                       VF[i]=VF[j];
                       VF[j]=aux;
                   }
               }
           } 
       }
       
       sw=true;
       while (sw==true){ //COLUMNAS
           sw=false;
           System.out.println("[DIGITE LA POSICION DE LAS COLUMNAS QUE QUIERAS SUMAR, SIN REPETIRLAS]");
           
           for(int i=1;i<=CCS;i++){
               System.out.println("Digite la posicion["+i+"]: ");
               VC[i]=ent.nextInt();
           }
           
           for (int i=1;i<=CCS;i++){
               for (int j=i+1;j<=CCS;j++){
                   if(VC[i]==VC[j]){
                       sw=true;
                   }
               }
           }
           
           for (int i=1; i<=CCS; i++){
               for (int j=i+1;j<=CCS;j++){
                   if (VC[i]>VC[j]){
                       aux=VC[i];
                       VC[i]=VC[j];
                       VC[j]=aux;
                   }
               }
           } 
       }
       
       for (int i=1;i<=F;i++){
           SUM=0;
           sw=false;
           for (int j=1;j<=C;j++){
               if(i==VF[k]){
                   SUM=SUM+M[i][j];
                   sw=true;
               }
           }
           
           if(sw==true){
               VSF[k]=SUM;
               if(k<CFS){
                   k=k+1;
               }
           }    
       }
       
       k=1;
       
       for (int j=1; j<=C; j++){
           SUM=0;
           sw=false;
           for (int i=1;i<=F;i++){
               if(j==VC[k]){
                   SUM=SUM+M[i][j];
                   sw=true;
               }
           }
           
           if (sw==true){
               VSC[k]=SUM;
               if (k<CCS){
                   k=k+1;
               }
           }
       }
       
       System.out.println("[MATRIZ CREADA]");
        
        for (int i=1;i<=F;i++){
            for (int j=1;j<=C;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
       
       System.out.println("RESULTADOS LA SUMA DE FILAS");
       for (int i=1; i<=CFS;i++){
           System.out.print("F"+VF[i]+": "+VSF[i]+" | ");
       }
       System.out.println("  ");
       
       System.out.println("RESULTADOS LA SUMA DE COLUMNAS");
       for (int i=1;i<=CCS;i++){
           System.out.print("C"+VC[i]+": "+VSC[i]+" | ");
       }
      
    }
    
}
