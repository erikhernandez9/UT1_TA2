/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Erik Hernandez
 */
public class Factorial {
    
    public static int calcularFactorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado *= i;
        }
        return resultado;
    }
}
