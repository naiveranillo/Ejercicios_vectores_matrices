/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_vector;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Ejercicio_vector {
    
    public static void main(String[] args) {
       
        Scanner ent = new Scanner (System.in);
        int n,cont1=0,cont2=0,sum1=0,sum2=0;
        double prom,prom2;
        System.out.println("Tamaño del vector");
        n=ent.nextInt();
        int [] Vect = new int [n];
  
        for (int i=0; i<n; i++){
  	
            System.out.println("Digite un numero en la posicion ["+(i+1)+"]");
            Vect[i]=ent.nextInt();
            if (Vect[i]<0){
  		cont1=cont1+1;
  		sum1=sum1+Vect[i];
            } else {
  		cont2=cont2+1;
  		sum2=sum2+Vect[i];
            }
  
        }
  
        prom=sum1/cont1;
        prom2=sum2/cont2;
 
        System.out.println("Cantidad de numeros negativos :"+cont1);
        System.out.println("Cantidad de numeros positivos :"+cont2);
        System.out.println("Promedio de los numeros negativos :"+prom); 
   	System.out.println("Promedio de los numeros positivos :"+prom2); 
    }    
}
