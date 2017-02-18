
public class AN_trab1_ex1 {

	public static void main(String[] args){
		
		int N=100000; //para N=100000    => 1.1102230246251568E-16
					  //para N=999999999 => 1.1102230246251568E-16
		
		double max=1.0, min=0.0, eps;
	   
		for(int i=0; i<N; i++){
			eps = (max+min)/((double)2.0);
			double temp = ((double)1.0)+eps;
			if(temp==((double)1.0))
				min=eps;
			else
				max=eps;
		}
		
		System.out.println("O epsilon maquina e: " + max);
	}
}
