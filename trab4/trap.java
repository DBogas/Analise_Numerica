import java.util.Scanner;


class trap {
    public static void main(String[] args) {
        
        System.out.println("Calcular o integral de sin(sin(sin(sin(x)))), entre 0 e 2:");
        System.out.println();

        int a = 0;
        int b = 2;

        double i = (b-a);
        double t = i/2;
        double e = 5*Math.pow(10, -8);
        double m = 1.088549352507347;
        
        int n = definirN(i, e, m);
        double h = i/n;

        System.out.println("N = "+n+"\tH = "+h);
    }

    static int definirN(double i, double e, double m) {
        int n = 1;
        while(true) {
            double h = i/n;
            double err = -1 * (Math.pow(h,2)/12) * i * m;
            if(Math.abs(err) < e)
                return n;
            n++;
        }
    }
}
