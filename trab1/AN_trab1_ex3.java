
public class AN_trab1_ex3 {

	public static void main(String[] args){
		
		int inf = 200; 
		double pi=2, num, res=2, denum,  num1, denum1, denum2, checkError=0.00001, error;
		int conta=5;
		boolean check=false;
		
		for(int i=0; i<inf; i++){
			num1 = Math.pow((double)(i+1), (double)2);
			num = num1 * (double)2;
			denum1 = (double)(2*i)+(double)3;
			denum2 = (double)(2*i)+(double)2;
			denum = denum1*denum2;
			res=res*(num/denum);
			pi+=res;
			error = Math.PI-pi;
			if(error<checkError && !check){
				System.out.println("Para um erro absoluto de 10^-"+conta+":");
				System.out.println("O numero n de termos usados na série: " + i);
				System.out.println("Sn, o valor aproximado de Pi: " + pi);
				System.out.println("O erro absoluto efetivamente cometido no cálculo de Pi, En = |Pi-Sn|: " + error);
				System.out.println();
				conta++;
				checkError/=10;
				if(conta==13)
					check=true;
			}
			//System.out.println("I:"+i+" PI:"+pi+" ERRO:"+error);
		}
	}
}
