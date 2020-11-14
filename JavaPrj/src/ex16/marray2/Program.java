package ex16.marray2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		int kor1, kor2, kor3;
		int [] kors = new int[3 * 3];
		int [] total = new int [3];
		float [] avg = new float[3];
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		/*
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		*/
		
		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 3; i++)
				kors [3 * j + i] = 0;
		
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
			
			switch (menu ) {
			
			case 1: 
				//------- 성적 입력 부분 ------------------------
				System.out.println("┌───────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
				System.out.println("│     성적 입력         │");
				System.out.println("└────────────────┘");
//				do {
//					System.out.print("국어1 : ");
//					kor1 = scan.nextInt();
//					if (kor1 < 0 || 100 < kor1)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//				} while (kor1 < 0 || 100 < kor1);
//				
//				do {
//					System.out.print("국어2 : ");
//					kor2 = scan.nextInt();
//					if (kor2 < 0 || 100 < kor2)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//				} while (kor2 < 0 || 100 < kor2);
//				
//				do {
//					System.out.print("국어3 : ");
//					kor3 = scan.nextInt();
//					if (kor3 < 0 || 100 < kor3)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//				} while (kor3 < 0 || 100 < kor3);
				
				for (int j = 0; j < 3; j++)
					for (int i = 0; i < 3; i++)
						do {
							System.out.printf("%d학년 국어%d : ", j + 1, i + 1);
							kors[3 * j + i] = scan.nextInt();
							if (kors[3 * j + i] < 0 || 100 < kors[3 * j + i])
								System.out.println("성적범위(0~100)를 벗어났습니다.");
						} while (kors[3 * j + i] < 0 || 100 < kors[3 * j + i]);
				
					break;
				
			case 2 : 
				//------- 성적 출력 부분 ------------------------
				
//				total = kor1 + kor2 + kor3;
				System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
				System.out.println("│     성적 출력            │");
				System.out.println("└────────────────┘");
				
				for (int j = 0; j < 3; j++) {
					System.out.printf("%d학년 국어성적-----------\n", j + 1);
					total[j] = kors[3 * j] + kors[3 * j + 1] + kors[3 * j + 2];
					for (int i = 0; i < 3; i++) {
						System.out.printf("\t국어%d : %3d\n", i + 1, kors[3 * j + i]);
					}
					avg[j] = total[j] / 3 ;
					System.out.printf("\t총점 : %3d\n", total[j]);
					System.out.printf("\t평균 : %6.2f\n", avg[j]);
					System.out.println("────────────────────────────");
				}
					//결과값이 190.00이 나오는데 그 이유는 정수를 정수로 나오기 때문
					
						
				break;

			case 3 : 
				break 종료; //break는 break가 속한 반복문의 반복을 종료시킨다. 
				//여기선 switch를 종료한다.
			
			default :
				System.out.println("입력 오류 1~3까지만 입력할 수 있습니다.");
			}
		}
		
		System.out.println("good bye~");
		
	}

}
