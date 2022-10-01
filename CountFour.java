import java.util.Scanner;

public class CountFour {
	int count=0,remainder=0,number,n;
	public void getInput() {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=scanner.nextInt();
		System.out.println("Enter the number to count");
		n=scanner.nextInt();
		if(number<0) {//if number negative convert to postive value 
			number*=-1;
		}
		System.out.println(count(number,n));
		scanner.close();
	}
	//count the number using recursion
	public int count(int number,int n) {
		if(number==0) {
			return count;
		}
		remainder=number%10;
		number=number/10;
		if(remainder==n) {
			count+=1;
		}
		count(number,n);//recursion calling
	return count;
	}
	public static void main(String[] args) {
		CountFour ob=new CountFour();
		ob.getInput();
		
	}

}
