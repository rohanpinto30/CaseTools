
import java.util.Scanner;
/**
 * <h2>Interest Calculator Class Level Javadoc</h2>
 * The purpose of <b>Interest Class</b> is to generate Simple interest, Compound interest and Average
 * @author Rohan Pinto, Sudhanshu Lolyekar, Delwyn Fernandes
 * @version 1.0
 * @since 2022-05-05
 *         
 *
 */
public class InterestCalculator {
	/**<h3>Simple Interest</h3>*/
	private double SimpleInterest;
	/**principal amount*/
	private double S_principal;
	/**Rate of Interest*/
	private double S_rateinterest;
	/**time period*/
	private double S_time;
	/**Scanner to store in value from user*/
	private Scanner sc;
	
	/**<h3>Compound Interest</h3>*/
	private double CompoundInterest;
	/**principal amount*/
	private double C_principal;
	/**Rate of Interest*/
	private double C_rateInterest;
	/**time period*/
	private double C_time;
	/**number of times interest is compounded per time period*/
	private double C_number;
	
	/**Average: to find average of a given number by adding the numbers and dividing by how many numbers were added*/
	private int average;
	private int num1,num2,num3,num4,num5;
	
	/**
	 * Constructor without parameters
	 */
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
	/**to return the value of Simple interest
	 * @return SimpleInterest*/
	public double getSimpleInterest() {
		return SimpleInterest;
	}
	/**to return the value of Compound interest
	 * @return CompoundInterest*/
	public double getCompoundInterest() {
		return CompoundInterest;
	}
	/**to return the value of Average
	 * @return Average*/
	public int getAverage() {
		return average;
	}
	/**to return the value of the 1st number
	 * @return num1*/
	public int getNum1() {
		return num1;
	}
	/**to return the value of the 2nd number
	 * @return num2*/
	public int getNum2() {
		return num2;
	}
	/**to return the value of the 3rd number
	 * @return num3*/
	public int getNum3() {
		return num3;
	}
	/**to return the value of the 4th number
	 * @return num4*/
	public int getNum4() {
		return num4;
	}
	/**to return the value of the 5th number
	 * @return num5*/
	public int getNum5() {
		return num5;
	}
	/**calculates simple interest
	 * @param S_principal is the principal amount
	 * @param S_time is the time period
	 * @param S_rateinterest is the rate of interest
	 */
	public void CalculateSimpleInterest() {
		SimpleInterest= (S_principal * S_time * S_rateinterest) / 100;
		System.out.println("SimpleInterest:" + this.SimpleInterest);
		
	}
	/**calculates compound interest
	 * @param C_principal is the principal amount
	 * @param C_time is the time period
	 * @param C_rateinterest is the rate of interest
	 * @param C_number is the number of times interest is compounded per time period
	 */
	public void CalculateCompoundInterest() {
		CompoundInterest= C_principal * (Math.pow((1 + C_rateInterest/100), ( C_time* C_number))) - C_principal;
		System.out.println("CompoundInterest: " +this.CompoundInterest);
				
	}
	/**Reads Numbers
	 * @param num1 : 1st number
	 * @param num2 : 2nd number
	 * @param num3 : 3rd number
	 * @param num4 : 4th number
	 * @param num5 : 5th number
	 */
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
	/**
	 * Calculates Average
	 * @param average : add 5 numbers and then divide it by 5
	 */
	public void FindAvg() {
		average=(num1+num2+num3+num4+num5)/5;
		System.out.println("Average: " +this.average);
	}
	
	

}
