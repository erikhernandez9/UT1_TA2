/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Erik Hernandez
 */
public class UtilMath {
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static Long numberSumatory(long n){
        long countPar = 0;
        long countImpar = 0;
        long i = 0;
        if(isPrime(n)){
            while(i!=n){
                if(i%2==0){
                    countPar+=n;
                }else{
                    countImpar+=n;
                }
                i++;
            }
        }
        else{
           return countImpar;
        }
        return countPar;
    }
    
    public static int calcularFactorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado *= i;
        }
        return resultado;
    }
}
