public class AN_trab1_ex4 {

	public static void main(String[] args){
		
		int max=Integer.MAX_VALUE;
		double res=0, first, second, first_error=0.00000005, second_error=0.0000000005,exact_value = Math.log(2), error;
		int i;
		boolean check = false;
		
		for(i=1; i<max; i++){
			if(i%2!=0)
				first=1;
			else
				first=-1;
			second=(double)1/i;
			res+=(double)first*second;
			error = Math.abs(exact_value-res);
			if(error<first_error && !check){
				System.out.println("Para um erro absoluto de 5.0x10^-8:");
				System.out.println("A pesquisa correu "+i+" iterações (N="+i+")");
				System.out.println("A pesquisa obteve um resuldado de " + res);
				System.out.println();
				check=true;
			}
			if(error<second_error){
				System.out.println("Para um erro absoluto de 5.0x10^-10:");
				System.out.println("A pesquisa correu "+i+" iterações (N="+i+")");
				System.out.println("A pesquisa obteve um resuldado de " + res);
				break;
			}
			//System.out.println("Error:"+(error)+" Res:"+res);
		}
	}
}
