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
        
        int n = 1;
        double h;
        double err;

        while(true) {
            h = i/n;
            err = -1 * (Math.pow(h,2)/12) * i * m;
            if(Math.abs(err) < e)
                break;
            n++;
        }

        double p1 = (h/2) * (f(a) + f(b));
        double p2 = 0;
        double hh = h;

        for(int k=1; k<n; k++){
            p2 += f(hh);
            hh += h;
        }
        p2 *= h;
        
        double res = p1+p2;
        double real = 1.0548418772491;

        System.out.println("N = "+n+"\tH = "+h);
        System.out.println("Valor real: "+real+"\tResultado = "+res+"\tMajorante = "+Math.abs(err)+"\tErro = "+Math.abs(real - res));
        
    }

    static double f(double x) {
        return Math.sin(Math.sin(Math.sin(Math.sin(x))));
    }
}
