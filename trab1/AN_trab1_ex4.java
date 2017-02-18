
public class AN_trab1_ex4 {

	public static void main(String[] args){
		
		int inf=999999999; 	//para inf=9999999999 => 0.6931471800606472
							//para inf=1000000000 => 0.6931471810606472
					 		//para inf=100000     => 0.6931521805849815
		//como o enunciado pede um erro inferior a 5x10^-8 e 5x10^-10, eu penso que 
		//a solução deverá ter 8 casas decimais e 10 casas decimais com uma margem de 5 
		//unidades.

		double res = 0,first,second;
		
		for(int i=1; i<inf; i++){
			first=Math.pow((double)(-1), (double)(i+1));
			second=(double)1/i;
			res+=(double)first*second;
			//System.out.println("First: "+first+" Second: "+second+" Res:"+res);
		}
		
		System.out.println(res);
		
	}
}