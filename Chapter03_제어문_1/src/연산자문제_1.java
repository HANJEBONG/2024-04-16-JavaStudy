/*
 * 프로그램
 * 1. 변수 선언 => 데이터 저장 공간 확보 => 메모리
 * 2. 변수의 초기화
 * ---------------------------------------- 선언 + 초기화
 * 
 */
public class 연산자문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.변수선언
		int a;
		int b;
		//초기화
		a=3;
		b=a+5;
		// a=3 ==> b=3+5 => b=8
		// 3. 화면 출력
		System.out.printf("a의 값: %d \n", a);
		//
		//
		// %d => 정수값 첨부
		// %f => 실수값 첨부 => %.2f ==> 실수 출력 소수점 2자리 출력
		// %c => 문자 첨부
		// %s => 문자열 첨부
		// 출력형식을 만들어서 처리 ==> printf c의 출력방식 도입
		System.out.printf("b의 값: %d \n", b);

	}

}
