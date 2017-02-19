
public class AN_trab1_ex1 {

	public static void main(String[] args){
		
		double eps = 1;
		
		while(eps+1>1)
			eps/=2;
		
		System.out.println("O Epsilon máquina (1) é: " + eps);
		System.out.println("O Epsilon máquina (2) é: " + eps*2);
		
		/*
		{
			System.out.println("*Precisao simples*");
			float eps = 1f;
			int it=0;
			while(eps+1f>1f){
				eps/=2f;
				it++;
			}
			System.out.println("("+(it-1)+" iteraçoes): O Epsilon máquina é: " + eps*2);
		}
		
		{
			System.out.println("*Precisao dupla*");
			double eps = 1;
			int it=0;
			while(eps+1>1){
				eps/=2;
				it++;
			}
			System.out.println("("+(it-1)+"iteraçoes): O Epsilon máquina é: " + eps*2);
		}*/
	}
}
