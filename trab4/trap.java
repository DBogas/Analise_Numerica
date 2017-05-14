import java.util.Scanner;


class trap {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Calcular o integral de sin(sin(sin(sin(x)))), entre 0 e 2:");
        System.out.println();
        
        int a = 0;
        int b = 2;

        double t = (b-a)/2;
        double e = 5*Math.pow(10, -8);
        double m = 1.088549352507347;

        int n = definirN(a, b, e, m);
        System.out.println(n);
        double h = (b-a)/n;
    }

    static int definirN(int a, int b, double e, double m) {
        int n = 1;
        while(true) {
            double h = (b-a)/n;
            double err = (Math.pow(h,2)/12) *(b-a) * m;
            if(err < e)
                return n;
            n++;
        }
    }
}
