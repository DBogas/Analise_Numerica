import java.text.DecimalFormat;
import java.util.Scanner;

/*
calcular integral de Math.sin(Math.sin(Math.sin(Math.sin(x)))) dx pela regra dos trapézios


o valor "a" representa o limite inferior do integral, e b representa o superior
*/
class ex1 {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("The expression is: sin(sin(sin(sin(x))))");
        System.out.println("Enter, in order, values of a and b.");
        
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 10;
        double size = ((double)(b - a) / n);
        
        System.out.println("size of interval:"+size);
        System.out.println("a:"+a+"\t b:"+b);
        
        calcIntegral(a, b, size, n);
    }

    static void calcIntegral(int a, int b, double h, int n) {
        // calc val here
        double parcel1 = (h/2)*(f(a)+f(b));
        double parcel2 = 0;
        double h2 = h;
        
        for(int i=1; i<n; i++){
            parcel2 += f(h2);
            h2 += h;
        }
        
        parcel2 *= h;
        
        double result = parcel1+parcel2;
        
        System.out.println("Result: "+result);
        
        // calc error here
        // inventei um t aqui
        double t = (b-a)/2;
        double error = -1 * ((double)Math.pow(h,2)/12) * (b-a) * f2(t);
        System.out.println("error: "+ Math.abs(error));
    }

    // returns the value of function f described above in a given x
    static double f(double x) {
        return Math.sin(Math.sin(Math.sin(Math.sin(x))));
    }

    // returns the value of the 2nd derivate of the f function described above (calculated with wolfram alpha)
    // which gave us this: cos(x) cos(sin(x)) cos(sin(sin(x))) cos(sin(sin(sin(x))))
    static double f2(double x) {
        return Math.cos(x) * Math.cos(Math.sin(x)) * Math.cos(Math.sin(Math.sin(x))) * Math.cos(Math.sin(Math.sin(Math.sin(x))));
    }


    // auxiliary method so we keep the intervals similar in size
    static double roundToOneDecimalPlace(double d) {
        DecimalFormat df = new DecimalFormat("#.#");
       // df.setRoundingMode(RoundingMode.CEILING);
        return Double.parseDouble(df.format(d));
    }
    
   

}