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
    		exams = temp;
    	}
        
        exams[current] = exam;
		current++;
	}

	public ExamList() {
		/* Aggregation Has A 관계
		 * new Exam[3]는 Exam 객체가 만들어진 상태가 아니다.
		 * Exam 변수를 참조하기 위한 참조변수 세개짜리이다.
		 */
		exams = new Exam[3];
		current = 0;
	}


	public int size() {
		return current;
	}
	
}
