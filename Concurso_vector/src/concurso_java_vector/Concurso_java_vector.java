/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso_java_vector;

/**
 *
 * @author Naiver Anillo
 */
 import java.util.*;
public class Concurso_java_vector {

    public static void main(String[] args) {
	
	Scanner ent = new Scanner (System.in);
        
	int i,n=16,j=1,t=4,my=0,sum2=0;
	float sum=0,prom=0;
	int [] V = new int[n+1];
	int [] V2= new int[n+1];
	int [] V3 = new int[5];
	int [][] M = new int [t+1][t+1];
 	
	//Digitar 16 numeros del 1 al 20
	for (i=1;i<=n;i++)
	{
            do{
                System.out.println("Digite un numero del 1 al 20 ["+i+"]");
                V[i]=ent.nextInt();	
            }while(V[i]>20);
		
            sum=sum+V[i];	
	}
        
        //Imprimo los numeros del vector asi: V=[x,x,x,x,x,]
	System.out.println(" ");
	System.out.print("Vector = [");
        
	for (i=1;i<=n;i++)
	{
            System.out.print(V[i]+",");
		
	}
	
	System.out.println("]");
	System.out.println(" ");
	
        
        //Saco promedio de la suma de los numeros del vector
	prom=sum/(n);
	
	System.out.println(" ");
	System.out.println("El promedio de los elementos del vector es: "+prom);
	
        //Aqui lo que hago que, los numeros de la posicion 9 para adelante se copien a otro vector (V2)
	for (i=1;i<=n;i++)
	{
            if(i>=9)
            {
		V2[j]=V[i];
		j=j+1;
            }	
	}
        
	System.out.println(" ");
	sum=0;
	System.out.print("Vector1 = [");
        
        //Aqui lo que hago es imprimir asi: V=[x,x,x,x,], pero los numeros que este en la posicion 8 para atras, voy sumando sus numeros
	for (i=1;i<=(n-8);i++)
	{
            System.out.print(V[i]+",");
            sum=sum+V[i];
		
	}
	
	System.out.println("]");
	
	System.out.print("Vector2= [");
        
        //Aqui imprimo el V2, pero los numeros que este del 8 para adelante, al mismo tiempo voy sumando lo que contiene desde la misma 
        // variable que hice la suma del vector1 "V"
	for (i=1;i<=(n-8);i++)
	{
            System.out.print(V2[i]+",");
            sum=sum+V2[i];
	}
	
	System.out.println("]");
	
	System.out.println(" ");
	System.out.println("La suma de ambos vectores es:"+sum);
	System.out.println(" ");
	
        //Aqui agregar numeros a una matriz de 4x4, del 1 al 30
	for (i=1;i<=t;i++)
	{
            for (j=1;j<=t;j++)
            {
		do{
                    System.out.print("Digite un numero del 1 al 30["+i+"]["+j+"]: ");
		    M[i][j]=ent.nextInt();
		}while(M[i][j]>30 || M[i][j]<1);		
            }	
	}
        
	System.out.println(" ");
	
	System.out.println("[MATRIZ]");
	
	System.out.println(" ");
	
        //Aqui imprimo la matriz
	for (i=1;i<=t;i++)
	{
            for (j=1;j<=t;j++)
            {
		System.out.print("["+M[i][j]+"]");
            }
            System.out.println("");	
	}
	
        //Aqui voy sumando cada columna de la matriz y lo voy agregando a un tercer vector "V3"
	for (i=1;i<=t;i++)
	{
            sum2=0;
            for (j=1;j<=t;j++)
            {
                sum2=sum2+M[j][i];
            }
            V3[i]=sum2;
        }
	
	System.out.println("");	
	
        //Aqui lo imprimo y al mismo tiempo voy buscando el numero mayor del vector3
	my=V3[1];
	System.out.print("Vector3= [");
	for (i=1;i<5;i++)
	{
            System.out.print(V3[i]+",");	
            if(V3[i]>my)
            {
		my=V3[i];
            }
	}
	
	System.out.println("]");
	System.out.println("");	
	
        //Aqui imprimo el numero mayor del vector3
	System.out.println("El numero maximo del Vector3 es: "+my);	
    }
    
}
