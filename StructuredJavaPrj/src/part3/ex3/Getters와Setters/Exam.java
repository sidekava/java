package part3.ex3.Getters와Setters;

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

}
