import part3.ex4.UI코드분리하기.Exam;

public class Program {
	
	// 1. 컴파일 -> Exam.class
	// 2. 압축 -> Exam.zip
	// 3. jar 만들기 -> Exam.jar
	// 위 과정은 이클립스가 지원함.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewlecExam exam = new NewlecExam(1, 1, 1, 1);
/*		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);*/
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}

}
