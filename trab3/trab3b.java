import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class trab3b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Valor de n");   
        int n = in.nextInt();

        /* n+1 pontos da função */
        float pontos[][] = new float[n+1][2];
        for(int i=0; i<n+1; i++) {
            System.out.println("Para i = " +i+ ": inserir ni f(ni)");
            pontos[i][0] = in.nextFloat();
            pontos[i][1] = in.nextFloat();
        }

        /* sistema que define o spline | valores de M | spline */
        float[][] system = makeSystem(n,pontos);
        //float[]   m      = calcSystem(n, pontos);
        //float[][] spline = makeSpline(n, pontos, m);

        System.out.println("Deseja:\n1. Constuir spline cúbico natural\n2. Calcular para x dado");
        int flag = in.nextInt();

        /* imprimir sistema e spline */
        if(flag == 1) {
            System.out.println("\nSistema que determina o spline:");           
            printSystem(n, system);
            
            System.out.println("\nS(x):");
           // printSpline(n, spline);
        }
        /* calcular sistema e spline */
        else { 
            List<Float> mX = new ArrayList<>();
            List<Float> mY = new ArrayList<>();

            for(int i=0; i<n+1; i++) {
                mX.add(pontos[i][0]);
                mY.add(pontos[i][1]);
            }   
            System.out.println("Indicar o valor de X");
            float x = in.nextFloat();

            SplineInterpolator s = SplineInterpolator.createMonotoneCubicSpline(mX, mY);
            System.out.println("Resultado: "+s.interpolate(x));

            /* TODO
             check interval
             calcular sistema
             calcular spline
             calcular equação com o valor de x
            */
        }   
    }

    /**
     * Construir o sistema que determina o spline.
     * 
     * h_i/6 * M_i-1 + (h_i+h_i+1)/3 * M_i + h_i+1/6 * M_i+1 = 
     * = (f_i+1 - f_i)/h_i+1 - (f_i - f_i-1)/h_i  
     * 
     * Para i=1 até n-1
     */
    static float[][] makeSystem(int n, float t[][]) {
        float s[][] = new float[n][n+2];
        
        /* M0 = 0 --> a linha 0 fica a 0.
         Mn = 0 --> a linha n fica a 0.
         M_1 a M_n-1
        */
        for(int i=1; i<n; i++) {
            float hi  = t[i][0]-t[i-1][0];
            float hi1 = t[i+1][0]-t[i][0];

            /* parte direita da equação */
            float right = ( (t[i+1][1]-t[i][1]) / hi1 ) - ( (t[i][1]-t[i-1][1]) / hi );

            for(int j=0; j<n+2; j++)              
                if(j == i-1)
                    s[i][j] = hi/6;
                else if(j == i)
                    s[i][j] = (hi+hi1)/3;
                else if(j == i+1)
                    s[i][j] = hi1/6;
                else if(j == n+1)
                    s[i][j] = right;
        }
        return s;
    }

    static void printSystem(int n, float s[][]) {
        for(int i=1; i<n; i++){
            System.out.print(i-1+": ");
            
            for(int j=0; j<n+2; j++)
                if(j == n+1)
                    System.out.println(s[i][j]);
                else if(j==n)
                    System.out.print(s[i][j]+"*M"+(j)+" = ");
                else
                    System.out.print(s[i][j]+"*M"+(j)+" + ");
        }
        System.out.println(n-1+": M0 = 0");
        System.out.println(n+": M"+n+" = 0");
    }
}