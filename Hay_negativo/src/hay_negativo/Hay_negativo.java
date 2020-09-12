/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hay_negativo;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Hay_negativo {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
	
	boolean sw=true;
	int n=0,i;
	
	System.out.println("Digite el tamaño del vector: ");
	n=ent.nextInt();
	
	int [] V = new int [n+1];
	
	for (i=1;i<=n;i++)
	{
            System.out.println("Digite un numero ["+i+"]");
            V[i]=ent.nextInt();	
        }
    
        i=1;
        while(sw==true && i<=n)
        {
            if(V[i]<0)
            {
    		sw=false;
            }
            i++;
        }
    
        System.out.println(" ");
    
        if(sw==true)
        {
            System.out.println("[NO HAY NUMEROS NEGATIVOS]");
        }else{
            System.out.println("[SI HAY NUMERO NEGATIVO]");
        }
    
        System.out.println(" ");	
        System.out.print("V=[");
    
        for (i=1;i<=n;i++)
        {
             System.out.print(V[i]+",");	
        }
	
	System.out.println("]");
        System.out.println(" ");
    }
    
}
