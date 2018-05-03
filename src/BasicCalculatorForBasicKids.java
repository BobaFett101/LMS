import java.util.Scanner;
public class BasicCalculatorForBasicKids {

	public static void main(String[] args) {
	
		double firstNum, secondNum, answer;
		String operator;
		Scanner zoinks = new Scanner(System.in);
		System.out.println("Enter first num:");
		firstNum = zoinks.nextDouble();
		System.out.println("Enter second num:");
		secondNum = zoinks.nextDouble();
		System.out.println("Enter operation:");
		operator = zoinks.next();
		if( operator.equals("+"))
		{
			answer = firstNum + secondNum;
		}
		else if( operator.equals("-"))
		{
			answer = firstNum - secondNum;

		}
		else if( operator.equals("*"))
		{
			answer = firstNum * secondNum;

		}
		else if( operator.equals("/"))
		{
			answer = firstNum / secondNum;
		}
		
		else
		{
			answer = 666;
			System.out.println("riperoni");
		}
		System.out.println(answer);
	}

}
