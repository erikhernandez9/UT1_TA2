
public class UT1_TA2_Eje_1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado *= i;
        } 
        
        return resultado;
    }
}
