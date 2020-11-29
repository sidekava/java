package part2.ex3.데이터구조화;

/*
 * 개념단위의 데이타를 entity라 한다.
 * 아래는 추측
 * 즉 데이터의 본질
 * 부가 데이터가 아닌 본 데이터
 * 
 * */

public class ExamProgram{
	
	/*
	 * 구조적인 프로그래밍으로 변경함으로써 거시적인 형태로 변해서 한 눈에 구조를 파악할 수 있다.
	 * 
	 */
	
	//전역변수는 static을 붙인다.
	
    public static void main(String[] args) {
    	/*
    	 * Exam exam;
    	
    	exam.kor = 30;
    	위와 같은 코드는 에러다. exam이 null이라서 에러다. exam을 new로 객체를 생성해야 한다.
    	new를 통해 만들면 모두 객체라고 한다.
    	 */
    	/*
    	 * Exam exam = new Exam();
    	 * 여기서 exam은 참조변수다
    	 * exam은 Exam 객체의 주소를 저장한다. 
    	 * 개념적으론 객체주소를 저장한 공간은 없다.
    	 */
    	Exam exam = new Exam();
    	
    	input(exam);
    	
    	print(exam);
    }

	private static void print(Exam exam) {
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력                   │");
        System.out.println("└───────────────────────────┘");
        System.out.println();		 
        
        int total = exam.kor + exam.eng + exam.math;
        float avg = total/3.0f;
        
        System.out.printf("국어 : %3d\n", exam.kor);	        	
        System.out.printf("영어 : %3d\n", exam.eng);	        	
        System.out.printf("수학 : %3d\n", exam.math);	        	
        	        
        System.out.printf("총점 : %3d\n", total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.println("─────────────────────────────");
	}

	private static void input(Exam exam) {

	}
}