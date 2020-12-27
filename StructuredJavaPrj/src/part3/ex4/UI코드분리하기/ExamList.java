package part3.ex4.UI코드분리하기;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam exam) {
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

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}
}
