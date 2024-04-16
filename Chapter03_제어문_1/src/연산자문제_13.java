/*
 *  조건문 => 비교연산자, 논리연산자 , 부정연산자
 *         --------------------------
 *         if(------)
 *  통계 / 분석 / 누적 ==> 산술연산자
 *  횟수 구하기 / 조회수 증가 ==> ++
 *  결과값 일기 => 대입연산자
 *  ---------------------------------
 *  
 *  1)
 *     int a=10;
 *     => 한개 증가
 *        a++
 *        ++a
 *        ----------
 *        a=a+1
 *        a+=1
 *        a=a+5
 *        a+=1
 *        a+=5 가급적이면 복합대입연산자를 쓸것
 *        ---------------------------- 여러개 증가
 *  2) % => 달력 (윤년) , 숫자 분리
 *  3) + , -
 *    + 문자열 결합 ...
 *    += 빈도수 , 석차 ...
 *    ------------------ 1. 인기 순위 , 실시간 그래프....
 */
public class 연산자문제_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		
		System.out.println("========결과값========");
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		//                    --
		//                     %를 이미 쓰고 있기 때문에 %를 쓰려면 두번 입력해야한다

	}

}
