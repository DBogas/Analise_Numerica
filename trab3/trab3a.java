import java.util.Scanner;

public class trab3a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        System.out.println("Inserir o valor de n");
        int n = in.nextInt();

        float table[][] = new float[n+1][2];
        
        /* ler os dados */
        for(int i=0; i<n+1; i++) {
            System.out.println("Para i = " +i+ ": inserir ni f(ni)");
            table[i][0] = in.nextFloat();
            table[i][1] = in.nextFloat();
        }
   
        System.out.println("Deseja:\n1. Constuir polinómio interpolador\n2. Calcular para x dado");
        int flag = in.nextInt();

        /* imprimir polinómio */ 
        if(flag == 1) {
            System.out.print("p"+n+"(x) = ");
            for(int i=0;i<n+1;i++) {
                printPol(n, i, table);
                if(i==n)
                    System.out.println(" * "+table[i][1]);
                else
                    System.out.print(" * "+table[i][1]+" + ");
            }    
        }
        /* calcular polinómio */ 
        else {
            System.out.println("Indicar o valor de X");
            float x = in.nextFloat();
            float res = 0;
            for(int i=0; i<n+1;i++)
                res += calcPol(n, i, table, x) * table[i][1];
            System.out.println(res);
        }
    }

    /* imprimir o polinómio Lk */
    static void printPol(int n, int k, float [][] table) {
        System.out.print("(");
        for(int i=0; i<n+1;i++)
            if(i!=k)
                System.out.print("(x-"+table[i][0]+")");
        System.out.print(")/(");
      
        for(int i=0; i<n+1;i++)
            if(i!=k)
                System.out.print("("+table[k][0]+"-"+table[i][0]+")");
        System.out.print(")");
    }

    /* calcular o valor de Lk */
    static float calcPol(int n, int k, float [][] table, float x) {
        float num = 1, den = 1;

        for(int i=0;i<n+1;i++)
            if(i!=k) {
                num *= (x-table[i][0]); 
                den *= (table[k][0]-table[i][0]);
            }
        return num/den;
    }
}