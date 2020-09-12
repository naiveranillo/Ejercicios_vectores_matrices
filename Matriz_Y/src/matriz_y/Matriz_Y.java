/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_y;

/**
 *
 * @author Naiver Anillo
 */
import java.util.*;
public class Matriz_Y {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        int n=0,mitad=0,i,j,mul=1;
        
        //Tamaño valido desde 5x5 y que sea impar
        do{
            
            System.out.print("Ingrese tamaño de la Matriz: ");
            n=sc.nextInt();
            
        }while(n < 5 || n%2==0);
        
        int matriz[][] = new int[n+1][n+1];
        
        mitad = (n/2)+1;
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("Ingrese un numero ["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        
        System.out.println("\n");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        
        int aux=mitad+1;
        int aux2=n;
        //Multiplicar los numeros pares que se encuentren la figura Y de la matriz
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if (i==j && matriz[i][j]%2==0 && i<=mitad && j<=mitad) {
                    mul=mul*matriz[i][j];
                }
                
                if (i>=aux && j==mitad && matriz[i][j]%2==0) {
                   mul=mul*matriz[i][j]; 
                }
                
                if (i < mitad && j == aux2 && matriz[i][j]%2==0) {
                    mul=mul*matriz[i][j];
                    aux2=aux2-1;
                }
                
            }
            
        }
        
        System.out.println("\nSolucion: "+mul);
        
    }
    
}
