package financialforcast;
import java.util.*;
public class forcast {
	public static double iterativemethod(double pv,double gr,int y) {
		double res= pv;
		for(int i=0;i<y;i++) {
			res*=(1+gr);
		}
		return res;
	}
	public static double recursivemethod(double pv,double gr,int y) {
		if(y==0) return pv;
		return recursivemethod(pv,gr,(y-1))*(1+gr);
	}
	public static void main(String[] args) {
		double pv=100000.00;   //Present Value
		double gr=0.08;        //Growth Rate
		int y=5;               //Number of years
		double fv=iterativemethod(pv,gr,y);   // Future Value
		System.out.println("Financial Forcast");
		System.out.println("=================");
		System.out.printf("Present Value = $%.2f\n", pv);
		System.out.printf("Growth Rate per year = %.2f%%\n",(gr*100));
		System.out.println("Number of years = "+y);
		System.out.println("=================");
		System.out.printf("Future Value using Iterative Approach = $%.2f\n", fv);
		
		double rv=recursivemethod(pv,gr,y); // recursive method
		System.out.println("=================");
		System.out.printf("Future Value using Recursive Approach = $%.2f\n", fv);
	}
}
