package ex8.control2.dowhile;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {
			//------- 성적 입력 부분 ------------------------
			System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
			System.out.println("│     성적 입력            │");
			System.out.println("└────────────────┘");
			do {
				System.out.println("국어1 : ");
				kor1 = scan.nextInt();
				if (kor1 < 0 || 100 < kor1)
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			
			} while (kor1 < 0 || 100 < kor1);
			
			do {
				System.out.println("국어2 : ");
				kor2 = scan.nextInt();
				if (kor2 < 0 || 100 < kor2)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				
			} while (kor2 < 0 || 100 < kor2);
			
			do {
				System.out.println("국어3 : ");
				kor3 = scan.nextInt();
				if (kor3 < 0 || 100 < kor3)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				
			} while (kor3 < 0 || 100 < kor3);
			
			
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
		}
		
		
		
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
		
	}

}
