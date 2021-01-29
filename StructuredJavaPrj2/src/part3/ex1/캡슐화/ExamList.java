package part3.ex1.캡슐화;

import java.util.Scanner;

import part3.ex1.캡슐화.Exam;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
	       printList(list, list.current);
	}
		
	static void printList(ExamList list, int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();		 
		
		Exam[] exams = list.exams;
		
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

	static void inputList(ExamList list) {
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
        
        Exam[] exams = list.exams;
        int size = list.current;
        
    	if (exams.length == size) {
    		Exam[] temp = new Exam[size + 5];
    		for (int j = 0; j < size; j++) {
    			temp[j] = exams[j];
    		}
    		list.exams = temp;
    	}
        
        list.exams[list.current] = exam;
		list.current++;
	}

	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
	}
}
