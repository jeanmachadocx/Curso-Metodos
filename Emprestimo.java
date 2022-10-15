//Utiliza metodos e defina valor final de um emprestimo.
package Metodos;
import java.util.*;
public class Emprestimo{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int parcelas; double valor, valorFinal;
    System.out.println("Digite o vaalor do empréstimo: ");
    valor = sc.nextDouble();
    System.out.println("Digite a quantidade de parcelas: ");
    parcelas = sc.nextInt();
    valorFinal = calculaParcelas(valor, parcelas);
}
public static double calculaParcelas(double valor, int parcelas ){
    // double  valorFinal;
    if(parcelas == 2){
    double valorFinal = valor *(getDuasParcelas()) + valor;
       System.out.println("O valor final é de: " + valorFinal);
       return valorFinal;
    }else if(parcelas == 3){
     double valorFinal = valor *(getTresParcelas()) + valor;
       System.out.println("O valor final é de: " + valorFinal);
       return valorFinal;
    }else if(parcelas == 1){
    System.out.println("Pagamento à vista não têm acréscimo, valor final: " + valor);
    return valor;
    }else{
        System.out.println("Quantidade de parcela indiponível! ");
        return 0;
    }
}
    public static double getDuasParcelas(){
        return 0.25;
    }
    public static double getTresParcelas(){
        return 0.5;
    }

}