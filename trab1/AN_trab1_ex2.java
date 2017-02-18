import java.util.*;

public class AN_trab1_ex2 {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Insira 1 para calcular An ou 2 para Bn");
		int flag = scn.nextInt();
			
		if(flag==1)
			firstMethod();
		else if(flag==2)
			secondMethod();
		else{
			System.out.println("Insira 1 para calcular An ou 2 para Bn");
		}
	}
	
	public static void firstMethod(){
		
		double result=0;
		for(int i=1; i<=15; i++){
			double k = (double)i;
			double base = (1+((double)(1/k)));
			result = Math.pow((double)base, (double)k);
			System.out.println("a("+i+") = "+result);
		}

		double error = Math.exp(1)-result;
		System.out.println("Constante de Euler = " + Math.exp(1));
		System.out.println("Constante de Euler - Resultado = " + error);
	}
	
	public static void secondMethod(){
	
		double result=0;
		double fact;
		for(int m=0; m<=25; m++){
			result=0;
			fact=1;
			for(int k=0; k<=m; k++){
				if(k!=0)
					fact*=k;
				result+=(1/fact);
			}
			System.out.println("b("+m+") = "+result);
		}
		
		double error = Math.exp(1)-result;
		System.out.println("Constante de Euler = " + Math.exp(1));
		System.out.println("Constante de Euler - Resultado = " + error);
	}
}
