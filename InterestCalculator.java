
import java.util.Scanner;
public class InterestCalculator {
	
	private double SimpleInterest;
	private double S_principal;
	private double S_rateinterest;
	private double S_time;
	private Scanner sc;
	
	private double CompoundInterest;
	private double C_principal;
	private double C_rateInterest;
	private double C_time;
	private double C_number;
	
	private int average;
	private int num1,num2,num3,num4,num5;
	
	
	public InterestCalculator() {
		SimpleInterest=0.0;
		S_principal=10000;
	    S_rateinterest=5;
	    S_time=6;

	CompoundInterest=0.0;
     C_principal=5000;
		 C_rateInterest=5;
		 C_time=2;
		 C_number=1;
		 
		 average=0;
		 num1=0;
		 num2=0;
		 num3=0;
		 num4=0;
		 num5=0;
		  
		 sc=new Scanner(System.in);
		
	}
	
	public double getSimpleInterest() {
		return SimpleInterest;
	}

	public double getCompoundInterest() {
		return CompoundInterest;
	}

	public int getAverage() {
		return average;
	}
	
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}

	public int getNum4() {
		return num4;
	}

	public int getNum5() {
		return num5;
	}

	public void CalculateSimpleInterest() {
		SimpleInterest= (S_principal * S_time * S_rateinterest) / 100;
		System.out.println("SimpleInterest:" + this.SimpleInterest);
		
	}
	
	public void CalculateCompoundInterest() {
		CompoundInterest= C_principal * (Math.pow((1 + C_rateInterest/100), ( C_time* C_number))) - C_principal;
		System.out.println("CompoundInterest: " +this.CompoundInterest);
				
	}
	
	public void ReadNumbers() {
		System.out.println("enter first number: ");
		num1=sc.nextInt();
		System.out.println("enter second number: ");
		num2=sc.nextInt();
		System.out.println("enter third number: ");
		num3=sc.nextInt();
		System.out.println("enter fourth number: ");
		num4=sc.nextInt();
		System.out.println("enter fifth number: ");
		num5=sc.nextInt();
	}
	
	public void FindAvg() {
		average=(num1+num2+num3+num4+num5)/5;
		System.out.println("Average: " +this.average);
	}
	
	

}
