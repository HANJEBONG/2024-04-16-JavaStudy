/*
 * int a, b;  
    a = 6;  
    b = 2;   
    System.out.printf("덧셈 연산 결과: %d \n", a+b); 8 
     => + 용도가 2개
          실제 산술연산
          문자열 결합
          System.out.println("국어점수:"+kor)
    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  4
    System.out.printf("곱셈 연산 결과: %d \n", a*b);  12
    System.out.printf("나누기 연산 결과: %d \n", a/b); 3
     => /
         0으로 나눌 수 없다 ==> 반드시 0이 입력이 된 경우에 처리
         정수/정수 = 정수
         
    System.out.printf("나머지 연산 결과: %d \n", a%b); 0
     => % ==> 배수
              코딩 => 화폐매수 구하기 , 숫자 분리
              나머지값은 왼쪽부호 따라간다

 */
import java.util.Scanner;
public class 연산자문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=369;
		// 100 => 몇 개
		// 10 => 몇 개
		// 1 => 몇 개
		int won100=money/100;
		int won10=(money%100)/10;
		int won1=money%10;
		// => %는 윤년 구하기
		System.out.println("100원 동전:"+won100);
		System.out.println("10원 동전:"+won10);
		System.out.println("1원 동전:"+won1);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println(year+"년도는 윤년입니다");
		}
		if(!(year%4==0&&year%100!=0)||(year%400==0)) {
			System.out.println(year+"년도는 윤년이 아닙니다");
		}

	}

}
