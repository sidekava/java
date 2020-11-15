package ex20.finalvar;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		final int SIZE = 3;
		int [] kors = new int[SIZE];
		int total = 0;
		float avg;
		int menu; // 1: INPUT 2: PRINT 3: EXIT
		final int MENU_INPUT = 1; //대문자인 이유는 일반 변수와 차이를 두기위해
		final int MENU_PRINT =2;
		final int MENU_EXIT =3;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < SIZE; i++)
			kors [i] = 0;
		
		종료:
		while(true) {
			//------- 성적 입력 부분 ------------------------
			System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
			System.out.println("│     메인 메뉴         │");
			System.out.println("└────────────────┘");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("\t 1. 성적 입력");
			System.out.println("\t 2. 성적 출력");
			System.out.println("\t 3. 종료");
			System.out.print("\t >");
			menu = scan.nextInt();
			
			switch (menu) {
			
			case MENU_INPUT: 
				//------- 성적 입력 부분 ------------------------
				System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
				System.out.println("│     성적 입력         │");
				System.out.println("└────────────────┘");
				
				for (int i = 0; i < SIZE; i++)
					do {
						System.out.printf("국어%d : ", i + 1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("성적범위(0~100)를 벗어났습니다.");
					} while (kors[i] < 0 || 100 < kors[i]);
			
				break;
				
			case MENU_PRINT : 
				//------- 성적 출력 부분 ------------------------
				
				for (int i = 0; i < SIZE; i++) 
					total += kors[i];
				avg = total / 3 ;
				
				System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
				System.out.println("│     성적 출력            │");
				System.out.println("└────────────────┘");
				
				for (int i = 0; i < SIZE; i++) {
					System.out.printf("\t국어%d : %3d\n", i + 1, kors[i]);
				}
				
				System.out.printf("\t총점 : %3d\n", total);
				System.out.printf("\t평균 : %6.2f\n", avg);
				
				break;

			case MENU_EXIT : 
				break 종료; //break는 break가 속한 반복문의 반복을 종료시킨다. 
			
			default :
				System.out.println("입력 오류 1~3까지만 입력할 수 있습니다.");
			}
		}
		
		System.out.println("good bye~");
		
	}

}
