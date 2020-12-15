package part3.ex2.메소드;

import java.util.Scanner;

public class Program {
	
	/*
	 * 캡슐화 되어있는 코드들이 있다.
	 * 그 중 한 캡슐 안에 있는 코드가 다른 캡슐에 있는 데이터를 참조한다.
	 * 그 후에 참조하고 있는 데이터가 변경되면 해당 데이터를 참조하는 다른 캡슐의 코드가 영향을 받게 된다.
	 * 그래서 c언어에서는 그러지 말라고 교육을 했었다고 한다.
	 * 
	 * 저런 현상을 방지하기 위해 접근 제어 지시자를 사용한다.
	 * 데이터에 private, protected, public 등 원하는 것을 사용하여 허락 또는 금지하게 코딩할 수 있다.
	 * 
	 * 자바 객체 6강 생성자

특정 클래스의 객체를 생성할 때 list.init을 통해 초기화를 진행했다. init은 아무때나 호출할 수 있다. 그래서 불완전한 초기화 작업이라 할 수 있다.

생성자의 조건
객체가 생성 되고 먼저 실행된다.
생성 될 때 한번만 실행된다.

new ExamList();
new ExamList를 객체로 만들어 달라는 명령
()는 객체를 초기화하는 생성자를 호출해달라는 명령

	 */

	public static void main(String[] args) {
		ExamList list = new ExamList();
		
		int menu;
        boolean keepLoop = true;			
		
		
		while(keepLoop)
		{

			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:
	        	list.inputList();
		        break;
	        case 2:
//	        	ExamList.printList(list);
	        	list.printList();
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
