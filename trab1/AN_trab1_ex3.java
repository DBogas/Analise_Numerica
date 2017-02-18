
public class AN_trab1_ex3 {

	public static void main(String[] args){
		
		int inf = 92; //para 93 ja nao funciona (INF/INF)
		double pi=0, num, denum, primeiro_exp, primeiro_elemento, segundo_elemento, fact=1;
		
		for(int i=1; i<inf; i++){
			primeiro_exp = (double)i+1;
			primeiro_elemento = Math.pow((double)2, (double)primeiro_exp);
			fact*=i;
			segundo_elemento = Math.pow((double)fact, (double)2);
			num = (double)primeiro_elemento*segundo_elemento;
			denum = (double)factorial(2*i+1);
			//System.out.println("1elemt: "+primeiro_elemento+" 2elemt: "+segundo_elemento+" NUM:"+num+" DENUM:"+denum);
			pi+=(double)num/denum;
			//System.out.println(i+ " " +pi);
		}
		
		double error = Math.PI-pi;
		
		System.out.println("O numero n de termos usados na serie: " + inf);
		System.out.println("Sn, o valor aproximado de Pi: " + pi);
		System.out.println("O erro absoluto efetivamente cometido no calculo de Pi, En = |Pi-Sn|: " + error);
		
	}
	
	public static double factorial(int n){
			
		double result=n;
		for(int i=n-1; i>0; i--)
			result*=i;
			
		return result;
	}
	
}
