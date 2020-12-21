package part3.ex4.UI코드분리하기;

public class Exam {
	/*
	 * - 게터 세터를 사용하는 이유
	 * 데이터 구조의 변경을 염두에 두고 사용한다.
	 * public Subject {
	 * 	int kor;
		int eng;
		int math;
	 * }
	 * 위와 같이 성적들을 한 단계 더 깊게 만든다면 exam의 구조를 바꿔야 한다.
	 * 하지만 Program쪽은 바꿀 필요가 없다.
	 * 그래서 사용 한다.
	 * 
	 */
	
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		//여기서 this를 써주지 않으면 생성자의 kor에 값이 들어가는 것이 아닌 파라미터에 들어간다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		// TODO Auto-generated method stub
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int total() {
		return kor + eng + math;
	}
	public float avg() {
		return this.total()/3.0f;
	}

}
