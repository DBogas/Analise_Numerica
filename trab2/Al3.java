import java.util.*;

public class Al3 {
	
	static double F(double x){
		return (1/x)-Math.sin(x)+1;
	}
	
	static double F_linha(double x){
		return -(1/Math.pow(x,2)) - Math.cos(x);
	}
	
	
	
	public static void main(String args[]){
		double x0 = -0.652, difToLast = 1 ,prevVal = x0, allowedError = 5e-7,currError = Math.abs(x0);
		
		int n = 0;
		while(true){
			n++;
			double currVal =  prevVal- F(prevVal)/F_linha(prevVal);
			currError = Math.abs(currVal - prevVal);
			System.out.println("Ao fim de "+n+" iterações obteve-se "+currVal+" com erro "+currError);
			if (currError < allowedError){
				System.out.println("Ao fim de "+n+" iterações obteve-se "+currVal+" com erro "+currError);
				break;
			}
			prevVal = currVal;
		}
	
	
	}//main 
}
