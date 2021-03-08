package part3.ex5.추상화;

public abstract class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		//this의 변수보다 지역변수가 우선순위가 높다. 그래서 this를 생략하면 파라미터로 받은 kor에 값이 들어간다.
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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
	public abstract float avg();
	
	public abstract int total();
	
	protected int onTotal() {
		return kor+eng+math;
	}
	
}
