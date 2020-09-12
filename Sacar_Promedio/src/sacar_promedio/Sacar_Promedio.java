/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacar_promedio;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Sacar_Promedio {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
 	int n=10, sum=0;
 	double prom;
        int [] Vector1 = new int [n];
    
        for (int i=0; i<n; i++) {
            System.out.println("Digite un numero en la posicion ["+(i+1)+"]");
            Vector1[i]=ent.nextInt();
            sum=sum+Vector1[i];
        }
 
        prom=sum/n;
        System.out.println("La suma es: "+sum+" y el promedio es: "+prom);   
    }
    
}
