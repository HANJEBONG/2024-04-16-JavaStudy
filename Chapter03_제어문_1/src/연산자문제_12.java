import java.util.Scanner;
public class 연산자문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("세개의 정수 입력(10 20 30):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		System.out.println("====결과값====");
		System.out.printf("%d * %d + %d = %d",num1,num2,num3,num1*num2+num3);

	}

}
