package part3.ex5.추상화;

public class Program {

	public static void main(String[] args) {
//		NewlecExam exam = new NewlecExam(); 
		
		//27강 이걸 실행하면 컴퓨터 과목은 입력할 수 없다. 
//		그러면 NewlecExamConsole에서 오버라이드 해야 한다. 
//		하지만 오버라이드하면 코드 재사용 의미가 없다. 
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();
	}

}
