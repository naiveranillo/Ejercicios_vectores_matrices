/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negativos.a.positivos;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class NegativosAPositivos {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
   	int n;
	System.out.println("Tamaño del vector");
   	n=ent.nextInt();
   	int [] Vect = new int [n];
   	
   	for (int i=0; i<n; i++){
            System.out.println("Digite un numero en la posicion ["+(i+1)+"]");
            Vect[i]=ent.nextInt();
            if (Vect[i]<0){
   		Vect[i]=Vect[i]*(-1);
            }
   	}
   	System.out.println("------- NUMEROS NEGATIVOS CONVERTIDOS EN POSITIVOS -------");
        for (int i=0; i<n; i++){
            System.out.println(Vect[i]);
   	
   	}
    }
    
}
