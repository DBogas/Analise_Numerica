import java.util.*;
import java.math.*;
import java.lang.*;

public class trabalho1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolhe o exercício:\n1 - Calcular o valor de eps máquina\n2 - Calcular o valor de Euler\n3 - Calcular o valor de Pi\n4 - Calcular a soma da série\n");

        int flag = sc.nextInt();

        switch (flag) {
            case 1: eps();
                break;
            case 2: euler();
                break;
            case 3: pi();
                break;
            case 4: serie();
        }
    }

    public static void eps() {

        double eps = 1; 
        while(eps+1 > 1) {
            eps /= 2;
        }
        System.out.println("eps1: " + eps);
        System.out.println("eps2: " + eps*2);
    }

    public static void euler() {
        
        System.out.println("Formula 1:\nFormula 2: \n");
    }

    public static void pi() {

        System.out.println("Nr de termos: \n Valor aproximado de Pi:\n Erro absoluto:\n" );        
    }

    public static void serie() {

        System.out.println("Soma: ");       
    }
}