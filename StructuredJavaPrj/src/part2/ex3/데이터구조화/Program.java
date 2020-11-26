package part2.ex3.데이터구조화;

public class Program {
	public static void main(String[] args) {
		
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running)
		{
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottosManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:
			}
		}
	}
	
	/*
	 * 탑다운은 구조를 먼저 만들고 세부 내용은 나중에 작성한다.
	 * 위의 while구조에서 더 복잡해질라 하면 함수로 뺀다.
	 * */
	
	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
	}

	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	 * 개념단위의 데이타 즉 entity라 한다.
	 * 아래는 추측
	 * 즉 데이터의 본질
	 * 부가 데이터가 아닌 본 데이터
	 * 
	 * */
}
