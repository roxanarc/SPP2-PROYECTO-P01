/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.proyectoparcial2;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2PROYECTOPARCIAL2 {

    /**
     * @param args the command line arguments
     */
    
    //Roxan Reyes Cordoba
    //Maximiliano Turrubiates
    //Ana Silvia Aldape
    //Juan Pablo Castillo
    public static void main(String[] args) {
        // TODO code application logic here
 
mostrarMenu();
    }
 public static void mostrarMenu(){
     int opcion;
     System.out.println(" Bienvenido");
     System.out.println("Introducción la opción que desee");
     System.out.println(" 1. Suma de matrices");
     System.out.println(" 2. Resta de matrices");
     System.out.println(" 3. Multiplicación de matrices");
     Scanner sc= new Scanner(System.in);
     opcion= sc.nextInt();
    
     switch(opcion){
         case 1:
             sumaMatrices();
        break;
         case 2:
             restaMatrices();
        break;
         case 3:
             multiMatrices();
        break;
     }
 }
     public static void sumaMatrices(){
     int Arreglo1[][]; 
     int Arreglo2[][];
     int numColumnas;
     int numFilas;
     int sumaArreglos;
     int datoCasilla1;
     int datoCasilla2;
     
         System.out.println(" Introduce número de filas:");
         Scanner sc= new Scanner(System.in);
         numColumnas= sc.nextInt();
         System.out.println(" Introduce número de columas:");
         Scanner kb = new Scanner(System.in);
         numFilas= kb.nextInt();
     
     Arreglo1= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + " y fila #"+ j + " de la matriz 01");
         Scanner dato= new Scanner(System.in);
         datoCasilla1= dato.nextInt();
         Arreglo1[i][j]= datoCasilla1;
     }
     }
         
     Arreglo2= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo2.length; i++){
         for (int j=0; j<Arreglo2.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + " y fila #"+ j + " de la matriz 02");
         Scanner dato= new Scanner(System.in);
         datoCasilla2= dato.nextInt();
         Arreglo2[i][j]= datoCasilla2;
     }
     }
     
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         sumaArreglos= Arreglo1[i][j]+ Arreglo2[i][j];
         System.out.println("La suma de los números: "+ Arreglo1[i][j] + " y " + Arreglo2[i][j] + " es " + sumaArreglos);
            
         }
         }
     }
     public static void restaMatrices(){
     int Arreglo1[][]; 
     int Arreglo2[][];
     int numColumnas;
     int numFilas;
     int restaArreglos;
     int datoCasilla1;
     int datoCasilla2;
     
         System.out.println(" Introduce número de filas:");
         Scanner sc= new Scanner(System.in);
         numColumnas= sc.nextInt();
         System.out.println(" Introduce número de columas:");
         Scanner kb = new Scanner(System.in);
         numFilas= kb.nextInt();
     
     Arreglo1= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + " y fila #"+ j + " de la matriz 01");
         Scanner dato= new Scanner(System.in);
         datoCasilla1= dato.nextInt();
         Arreglo1[i][j]= datoCasilla1;
     }
     }
         
     Arreglo2= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo2.length; i++){
         for (int j=0; j<Arreglo2.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + "y fila #"+ j + " de la matriz 02");
         Scanner dato= new Scanner(System.in);
         datoCasilla2= dato.nextInt();
         Arreglo2[i][j]= datoCasilla2;
     }
     }
     
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         restaArreglos= Arreglo1[i][j]- Arreglo2[i][j];
         System.out.println("La resta de los números: "+ Arreglo1[i][j] + " - " + Arreglo2[i][j] + " es " + restaArreglos);
         
     }    
     }
     }
     public static void multiMatrices(){
     int Arreglo1[][]; 
     int Arreglo2[][];
     int numColumnas;
     int numFilas;
     int multiArreglos;
     int datoCasilla1;
     int datoCasilla2;
     
         System.out.println(" Introduce número de filas:");
         Scanner sc= new Scanner(System.in);
         numColumnas= sc.nextInt();
         System.out.println(" Introduce número de columas:");
         Scanner kb = new Scanner(System.in);
         numFilas= kb.nextInt();
     
     Arreglo1= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + "y fila # "+ j + " de la matriz 01");
         Scanner dato= new Scanner(System.in);
         datoCasilla1= dato.nextInt();
         Arreglo1[i][j]= datoCasilla1;
     }
     }
         
     Arreglo2= new int [numFilas][numColumnas];
         for (int i=0; i<Arreglo2.length; i++){
         for (int j=0; j<Arreglo2.length; j++){
         System.out.println("Ingrese el número que desee guardar en la columna #"+ i + "y fila #"+ j + " de la matriz 02");
         Scanner dato= new Scanner(System.in);
         datoCasilla2= dato.nextInt();
         Arreglo2[i][j]= datoCasilla2;
     }
     }
     
         for (int i=0; i<Arreglo1.length; i++){
         for (int j=0; j<Arreglo1.length; j++){
         multiArreglos= Arreglo1[i][j]*Arreglo2[i][j];
         System.out.println("La multiplicación de los números: "+ Arreglo1[i][j] + " por " + Arreglo2[i][j] + " es " + multiArreglos);
             
         }
         }
     }   
     }