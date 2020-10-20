package ex5.io.scanner;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		//------- 성적 입력 부분 ------------------------
		System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
		System.out.println("│     성적 입력            │");
		System.out.println("└────────────────┘");
//		System.out.println("국어1 : ");
//		kor1 = scan.nextInt();
//		System.out.println("국어2 : ");
//		kor2 = scan.nextInt();
//		System.out.println("국어3 : ");
//		kor3 = scan.nextInt();
		
		//------- 성적 출력 부분 ------------------------
		
		total = kor1 + kor2 + kor3;
		avg = total / 3 ;
		//결과값이 190.00이 나오는데 그 이유는 정수를 정수로 나오기 때문
		
		System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
		System.out.println("│     성적 출력            │");
		System.out.println("└────────────────┘");
		
		System.out.printf("%2$d %3$d %1$d\n", 10,13,45);
		System.out.printf("%1$d %1$d %1$d\n", 10);
	
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %6.2f\n", avg);
		
//		System.out.println(80); //80을 기호 80으로 이해
//		System.out.write(80); //80을 코드값 80으로 이해
//		System.out.flush(); //write 사용 시엔 반드시 flush 사용
		
		/* 18강
		 * \b 백스페이스
		 * \t 수평 탭 삽입
		 * \n 새 행 삽입(new line)
		 * \f 폼피드
		 * \r 캐리지리턴(carrige return - 가장 왼쪽 위치로)
		 * \' 홑 따옴표 삽입
		 * \" 이중 따옴표 삽입
		 * \\ 역슬래쉬 삽입
		 * \는 단독으로 쓰일 수 없다. 그래서 역슬래시를 사용하고 싶다면 \\ 역슬래시를 연속으로 두개 쓰면 하나만 출력된다.
		 */
		
		/*
		 * 19강
		 * System.out.printl
		 */
		
		/*
		 * 20강 형식지정자
		 * % 1$ +0 20 .10 f 순
		 * % : begin format specifier
		 * 1$ : argument index(설정한 argument 순서대로 출력하지 않고 순서를 변경해서 출력할 때 index 지정)
		 * +0 : flags
		 * 20 : width(최소 길이)
		 * .10 : percision(소수점 길이)
		 * f : conversion
		 * System.out.printf("1:%d\n2:%10d\n3:%-10d", 3, 3, 3);
		 * 2:최소길이 10자리
		 * System.out.printf("%5.2f\n", 87,98989);
		 * 최소 5자리에 소수점 2자리. (자리 수 계산에 .도 포함)
		 * 
		 * 
		 */
		
		/*
		 * 22강 산술, 대입 연산자
		 * 산술 연산자
		 * + 덧셈
		 * - 뺄셈
		 * * 곱셈
		 * / 나눗셈
		 * % 나머지
		 * 
		 * 단항 연산자
		 * + 양수 연산자 ex) result = +1;
		 * - 음수 연산자 ex) result = -result;
		 * ++ 증가 연산자 
		 * -- 감소 연산자
		 * !  부정연산자 ex) !success
		 * 
		 * 증가와 감소는 전위와 후위가 있다.
		 * 전위일경우 연산 후에 명령 수행
		 * 후위일경우 명령 수행 후에 연산
		 * ex
		 * int i = 1;
		 * System.out.print(i); //1
		 * System.out.print(++i) //2
		 * System.out.print(i++) //2
		 * System.out.print(i) //3
		 * 
		 * 
		 */
		
	}

}
