/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_vector_estudiante;

/**
 *Ejercicio: Llenar 3 vectores, 1 de nombre de estudiantes, 2 notas, 3 carrera, y hacer un menu que tenga
 *            opcion 1, busqueda de estudiante, opcion 2 mostrar todos los estudiantes, opcion 3 salir, validar que
 *            el usuario no digite una opcion que no existe.
 * 
 * @author NaiAnillo
 */
import java.util.*;
public class Ejercicio_vector_estudiante {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
   	int t=0,i,opc=0,sw=0;
   	
   	String b;
   	System.out.println("Digite el tamaño del Vector");
   	t=ent.nextInt();
   	
        float [] N = new float [t+1];
        String [] E = new String [t+1];
        String [] C = new String [t+1];
        ent.nextLine();
   
        for (i=1;i<=t;i++)
        {
   	
            System.out.println("Nombre del estudiante ["+i+"]");
            E[i]=ent.nextLine();
            System.out.println("Nota del estudiante ["+i+"]");
            N[i]=ent.nextFloat();
            ent.nextLine();
            System.out.println("Carrera del estudiante ["+i+"]");
            C[i]=ent.nextLine();
        }
   
        while (opc != 3) {		
            System.out.println(" ");
            System.out.println("[MENU]");
            System.out.println("1. Hacer Busqueda\n2. Mostrar todos los Estudiantes\n3. Salir del Programa");
            opc=ent.nextInt();
   	
            if(opc==1){
                ent.nextLine();
                System.out.println(" ");
                System.out.println("[BUSQUEDA]");
                
                while(sw==0){
   	
                    System.out.println("Digite el nombre del estudiante");
                    b=ent.nextLine();
                    sw=2;
                    i=1;
                    System.out.println(" ");
                    while(i<=t && sw==2)
                    {
                        if(E[i].equals(b))
                        {   
                            System.out.println("[ESTUDIANTE ENCONTRADO]");
                            System.out.println("Nombre: "+E[i]);
                            System.out.println("Nota: "+N[i]);
                            System.out.println("Carrera: "+C[i]);
                            sw=3;
                        }else{
                            sw=2;
                        }
                        i=i+1;
                    }
   	 
                    if(sw==2){
                        System.out.println("EL ESTUDIANTE NO EXISTE");
                    }
   	 	
                    sw=0;
                    System.out.println(" ");
                    System.out.println("Quieres seguir buscando? SI[0] NO[1]");
                    sw=ent.nextInt();
                    ent.nextLine();
   	 	
                    System.out.println(" ");
                }
            }else{
                
   		if(opc==2){
                    for (i=1;i<=t;i++)
                    {
   	        
                        System.out.println("[ESTUDIANTE "+i+"]");
                        System.out.println("Nombre: "+E[i]);
                        System.out.println("Nota: "+N[i]);
                        System.out.println("Carrera: "+C[i]);
                        System.out.println(" ");
                    }
   		}else{
                    if(opc>3){
   		  	System.out.println(" ");
   		  	System.out.println("ESTA OPCION NO EXISTE");
                    }	
   		 	
                }
            }
  
   	}
  
        System.out.println("PROGRAMA FINALIZADO");
    }    
}
