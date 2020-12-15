package part3.ex2.메소드;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {
	       this.printList(this.current);
		}
		
	public void printList(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();		 
		
		Exam[] exams = this.exams;
		
		for(int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math= exam.math;
			
			int total = kor + eng + math;
			float avg = total/3.0f;
			
			System.out.printf("국어 : %3d\n", exam.kor);	        	
			System.out.printf("영어 : %3d\n", exam.eng);	        	
			System.out.printf("수학 : %3d\n", exam.math);	        	
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		}
	}
	
	public void inputList() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("┌───────────────────────────┐");
    System.out.println("│           성적  입력                   │");
    System.out.println("└───────────────────────────┘");
    System.out.println();
    
    	
    int kor, eng, math;
    
    do {
        System.out.printf("국어 : ");
        kor = scan.nextInt();
    
        if(kor < 0 || 100 < kor)
        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
        
    } while(kor < 0 || 100 < kor);
    
    do {
    	System.out.printf("영어 : ");
    	eng = scan.nextInt();
    	
    	if(eng < 0 || 100 < eng)
    		System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
    	
    } while(eng < 0 || 100 < eng);
    
    do {
    	System.out.printf("수학 : ");
    	math = scan.nextInt();
    	
    	if(math < 0 || 100 < math)
    		System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
    	
    } while(math < 0 || 100 < math);
    
    Exam exam = new Exam();
    exam.kor = kor;
    exam.eng = eng;
    exam.math = math;
    
    Exam[] exams = this.exams;
    int size = this.current;
    
	if (exams.length == size) {
		Exam[] temp = new Exam[size + 5];
		for (int j = 0; j < size; j++) {
			temp[j] = exams[j];
		}
		this.exams = temp;
	}
    
    this.exams[this.current] = exam;
	this.current++;
}

	public ExamList() {
		// TODO Auto-generated method stub
		this.exams = new Exam[3];
		this.current = 0;
	}
}
