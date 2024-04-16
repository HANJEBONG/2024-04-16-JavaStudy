import java.util.Scanner;
public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("세개의 정수를 입력하시오");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println("======결과======");
        System.out.println("곱과 합:"+(a*b+c));


	}

}
