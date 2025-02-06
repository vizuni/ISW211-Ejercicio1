/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.ejercicio3.operaciones;

/**
 *
 * @author ViZuni1
 */
public class Operaciones {
    
    public static int contadorOperaciones;
    
    public static void menu(){
        System.out.println("\n\n\n\n\n****************************************************");
        System.out.println("PROGRAMA QUE REALIZA OPERACIONES DE DOS NUMEROS ENTEROS");
        
        System.out.println("Favor presione 1, para la Suma ");
        System.out.println("Favor presione 2, para la Resta ");
        System.out.println("Favor presione 3, para la Multiplicación ");
        System.out.println("Favor presione 4, para la División ");
        System.out.println("Favor presione 5, para Salir ");
        System.out.println("****************************************************");        
    }
    
    
    public static int suma(int primerNumero, int segundoNumero ){
        try {
            System.out.println("************ REALIZANDO LA SUMA ******************");
            int resultadoOperacion = primerNumero + segundoNumero;
            contadorOperaciones++;
            return resultadoOperacion;
        } catch (Exception e) {
            System.out.println("Error al realizar una suma.");
        }
        return 0;
    }
    
    public static int resta(int primerNumero, int segundoNumero ){
        try {
            System.out.println("************ REALIZANDO LA RESTA ******************");
            int resultadoOperacion = primerNumero - segundoNumero;
            contadorOperaciones++;
            return resultadoOperacion;
        } catch (Exception e) {
            System.out.println("Error al realizar una suma.");
        }
        return 0;
    }
    
    public static int multiplicacion(int primerNumero, int segundoNumero ){
        try {
            System.out.println("************ REALIZANDO LA MULTIPLICACION ******************");
            int resultadoOperacion = primerNumero * segundoNumero;
            contadorOperaciones++;
            return resultadoOperacion;
        } catch (Exception e) {
            System.out.println("Error al realizar una suma.");
        }
        return 0;
    }
    
    public static int division(int primerNumero, int segundoNumero ){
        try {
            int resultadoOperacion = 0;
            
            if (segundoNumero != 0){    
                System.out.println("************ REALIZANDO LA DIVISION ******************");
                resultadoOperacion = primerNumero / segundoNumero;
                contadorOperaciones++;
            }
            return resultadoOperacion;
        } catch (Exception e) {
            System.out.println("Error al realizar una división.");
        }
        return 0;
    }
}
