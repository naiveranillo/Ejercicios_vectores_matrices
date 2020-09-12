/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contar_pares_impares;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Contar_pares_impares {
    
    public static void main(String[] args) {
       Scanner ent = new Scanner (System.in);
  	
  	int [] Vect = new int [10];
  	int cont1=0, cont2=0;
  		
  	for (int i=0; i<10; i++){
  			
            System.out.println("Digite un numero en la posicion ["+(i+1)+"]");
            Vect[i]=ent.nextInt();
            
            if(Vect[i]%2==0) {
  				
  		cont1=cont1+1;
            } else {
  		cont2=cont2+1;
            }
        }
  		
  	System.out.println("Cantidad de numeros pares: "+cont1);
  	System.out.println("Cantidad de numeros impares: "+cont2);
        
    }
    
}
