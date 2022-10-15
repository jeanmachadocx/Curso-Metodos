//Exibir mensagem após horário definido pelo usuário

package Metodos;
import java.util.*;
public class Mensagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas; 
      System.out.println("Informe as horas: ");
      horas = sc.nextInt(); 
      dia(horas);
      tarde(horas);
      noite(horas);
      erro(horas);
      sc.close();
     }
    public static void dia(int hora){
        if(hora >= 0 && hora < 12){
            System.out.println(" Bom dia! " );
        }
    }
    public static void tarde(int hora){
        if(hora >= 12 && hora < 18){
            System.out.println(" Boa Tarde! " );
        }
    }
    public static void noite(int hora){
        if(hora >= 18 && hora < 24){
            System.out.println(" Boa Noite! " );
        }
    }
    public static void erro(int hora){
        if(hora >= 24 || hora < 0){
            System.out.println(" Horário inválido " );
        }
    }
    
}

