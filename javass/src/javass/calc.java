package javass;
import java.util.*;

public class calc {

public calc() {
		
	}
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	public static int sub(int n1,int n2) {
		return n1-n2;
	}
	
	public static int mul(int n1,int n2) {
		return n1*n2;
	}
	
	
	void print_menu() {
		System.out.println("[ ID: 1772424 ]");
		System.out.println("[ NAME: JunYeong Kim ]");
		System.out.println("=======MENU=======");
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3.Multiply two numbers");
		System.out.println("4. Quit");			
	}
	
	int getNum() {
		int input=0;
		System.out.print("> : ");	
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		return input;
	}
	
	public static void main(String [] args) {
		calc a1 = new calc();
		int result =0;
		int num1=0;
		int num2=0;
		a1.print_menu();
		int a = a1.getNum();
		if (a == 4) {
			System.out.println("===========================");
			System.out.println("===========================");
			System.out.println("======== system end =======");
			System.out.println("===========================");
			System.out.println("===========================");
			System.exit(0);
		}
		
		else if(a == 1 || a ==2 || a==3) {
			num1 = a1.getNum();
			num2 = a1.getNum();		
			
			if (a == 1) {
				result = add(num1,num2);	
			}	
			
			else if (a == 2) {
				result = sub(num1,num2);		
			}
			
			else {
				result = mul(num1,num2);
			}
			System.out.println("result: "+result);	
			
		}
		else {
			System.out.println("===========================");
			System.out.println("!!!!error!!!!");
			System.out.println("wrong input");
			System.out.println("===========================");
		}
		
		
		
		
	}
	
}
