
public class AN_trab1_ex1 {

	public static void main(String[] args){
		
		double eps = 1;
		
		while(eps+1>1)
			eps/=2;
		
		System.out.println("O Epsilon máquina (1) é: " + eps);
		System.out.println("O Epsilon máquina (2) é: " + eps*2);
	}
}
