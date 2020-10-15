package ex4.io.printf;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total / 3 ;
		//------- 성적 출력 부분 ------------------------
		System.out.println("┌────────────────┐"); // \가 n을 출력문에서 탈출, 즉 escape 시켜준다.
		System.out.println("│     성적 출력            │");
		System.out.println("└────────────────┘");
	
		System.out.printf("\t국어1 : %d\n", kor1);
		System.out.printf("\t국어2 : %d\n", kor2);
		System.out.printf("\t국어3 : %d\n", kor3);
		System.out.printf("\t총점 : %d\n", total);
		System.out.printf("\t평균 : %f\n", avg);
		
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
		
	}

}
