package part3.ex2.메소드;

import java.util.Scanner;

public class Program {
	
	/*
	 * Exam[] exams = new Exam[3];
	 * 위는 Exam이란 객체가 만들어진 것이 아니다. 
	 * Exam형식의 배열 세 개가 만들어 진 것아다. 
	 * 참조 변수가 세 개 만들어 진 것이다.
	 * 그러므로 exams[0].kor = 30;이란 코드는 성립하지 못한다.
	 * 왜냐면 exams[0]은 존재하지만 exam[0]이 가리키는 참조는 없다. 
	 * 즉 exams[0]은 null이다.
	 * exams[0].kor = 30; 가 성립하려면 아래와 같이 코드를 짜야 한다.
	 * 	Exam[] exams = new Exam[3];
		exams[0] = new Exam();
		exams[0].kor = 30;
	 * 
	 */

	public static void main(String[] args) {
		ExamList list = new ExamList();
		ExamList.init(list);
		
		int menu;
        boolean keepLoop = true;			
		
		
		while(keepLoop)
		{

			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:
	        	ExamList.inputList(list);
		        break;
	        case 2:
	        	ExamList.printList(list);
		        break;
	        case 3:
	        	System.out.println("Bye~~");
	        	
	        	keepLoop = false;
	        	break;
	        default:
	        	System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
	       
	        }
		}   
	}

	static int inputMenu() {
        Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           메인 메뉴                   │");
        System.out.println("└───────────────────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.print("\t선택> ");
        int menu = scan.nextInt(); 
        
        return menu;
    }

}
