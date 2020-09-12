/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp_secuencia;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Imp_secuencia {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);

   	int cont=1,i,j,n=0;

   	System.out.println("Digite el tamaño del vector");
   	n=ent.nextInt();
   	
   	int [] V = new int [n+1];
   	for(i=1;i<=n;i++){
            System.out.println("Digite un numero ["+i+"]");
            V[i]=ent.nextInt();
   	}
        
   	System.out.println("");
   	System.out.print("V=[");
   			
   	for(i=1;i<=n;i++){
            if(i != n){
                System.out.print(V[i]+",");
            }else{
                System.out.print(V[i]);
            }	
   	}
   	  
        System.out.print("]");
   	System.out.println("");
   	   
   	System.out.println("");
        System.out.print("V=[");
   			
        for(i=1;i<=n;i++){
            if(i != n){
                if(cont%2 != 0){
                    System.out.print(V[i]+",");
                }
            }else{
   		if(cont%2 != 0){
                    System.out.print(V[i]);
   		}
            }
            cont=cont+1;	
   	}
   	     
   	System.out.print("]");
        System.out.println("");
     
    }
    
}
