/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utn.ejercicio3;
import com.utn.ejercicio3.operaciones.*;
import java.util.Scanner;

/**
 *
 * @author ViZuni1
 */
public class Ejercicio31 {
    
    public static Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {
        Operaciones.contadorOperaciones =0;
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        
        System.out.println("Inicial IVAN");
        int opcion = 0;
        try {
            
            while (true){
                if (opcion == 0 || opcion ==5){
                    Operaciones.menu();
                    opcion = leer.nextInt();
                }
                System.out.print("Digite el valor del primer número:");
                int primerValor = leer.nextInt();
                System.out.print("Digite el valor del segundo número:");
                int segundoValor = leer.nextInt();
                int resultado = 0;
                String operacionRealizada = "";
                
                switch (opcion) {
                    case 1:   
                        operacionRealizada = "SUMA";
                        resultado = Operaciones.suma(primerValor, segundoValor);
                        break;
                    case 2:
                        operacionRealizada = "RESTA";
                        resultado = Operaciones.resta(primerValor, segundoValor);
                        break;
                    case 3:
                        operacionRealizada = "MULTIPLICACION";
                        resultado = Operaciones.multiplicacion(primerValor, segundoValor);
                        break;
                    case 4:
                        operacionRealizada = "DIVISION";
                        resultado = Operaciones.division(primerValor, segundoValor);
                        break;
                    case 5:
                        operacionRealizada = "SALIR";
                        System.out.println("\n\n\nLa cantidad de operaciones realizadas efectivas fue de "+Operaciones.contadorOperaciones);
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Analizar las opciones del menu disponibles");;
                }
                
                System.out.println("\nEl resultado de la operación "
                        +operacionRealizada+" es igual a "+ resultado);
                
                opcion = segundoMenu(opcion);
                
            } //cierra while
        } catch (Exception e) {
            System.out.println("Error en el método principal!");
        }
    }
    
    
    public static int segundoMenu(int opcion){
        try {
            System.out.println("\n\n\nDigite un 1 para volver a realizar "
                        + "la misma operación, o digite 0 para ver el menú principal");
            int valor = leer.nextInt();
            
            if (valor == 1){
                return opcion;
            }else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }        
    }
}


