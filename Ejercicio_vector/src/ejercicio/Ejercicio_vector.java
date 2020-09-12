/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Ejercicio_vector {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    	
    	int [] Vect = new int[11];
    	
    	for (int i=1; i<11 ; i++) {	
            if (i%2==0){
    			
    		Vect[i]=1;
    		System.out.println("Posicion "+i+": "+Vect[i]);
            } else {
    		Vect[i]=0;
    		System.out.println("Posicion "+i+": "+Vect[i]);
            }
    	}
        
    } 
}
