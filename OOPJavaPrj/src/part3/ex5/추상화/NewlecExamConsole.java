package part3.ex5.추상화;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

}
