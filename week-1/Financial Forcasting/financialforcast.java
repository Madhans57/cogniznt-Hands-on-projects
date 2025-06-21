package financialforcast;
import java.util.*;
public class forcast {
	public static double method(double pv,double gr,int y) {
		double res= pv;
		for(int i=0;i<y;i++) {
			res*=(1+gr);
		}
		return res;
	}
	public static void main(String[] args) {
		double pv=100000.00;   //Present Value
		double gr=0.08;        //Growth Rate
		int y=5;               //Number of years
		double fv=method(pv,gr,y);   // Future Value
		System.out.println("Financial Forcast");
		System.out.println("=================");
		System.out.printf("Present Value = $%.2f\n", pv);
		System.out.printf("Growth Rate per year = %.2f%%\n",(gr*100));
		System.out.println("Number of years = "+y);
		System.out.printf("Future Value = $%.2f\n", fv);
	}
}
