//Criar métodos para executar as 4 operções básicas
package Metodos;
import java.util.*;
public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, resultado;
        System.out.println("Valor de X: ");
        x = sc.nextInt();
        System.out.println("Valor de Y: ");
        y = sc.nextInt();
        resultado = soma(x, y);
        resultado = subtracao(x, y);
        resultado = multiplicacao(x, y);
        resultado = divisao(x, y);
       sc.close();
    }
    public static int soma(int x, int y){
        int resultado;
        resultado = x + y;
        System.out.println("O resultado da soma é: " + resultado);
        return resultado;
    }
    public static int subtracao(int x, int y){
        int resultado;
        resultado = x - y;
        System.out.println("O resultado da subtração é: " + resultado);
        return resultado;
      }
      public static int multiplicacao(int x, int y){
        int resultado;
        resultado = x * y;
        System.out.println("O resultado da multiplicação é: " + resultado);
        return resultado;
      }
      public static int divisao(int x, int y){
        int resultado;
        resultado = x / y;
        if(x > y){
        System.out.println("O resultado divisão é: " + resultado);
        }else{
        System.out.println("ERRO");
        }
        return resultado;
      }


}