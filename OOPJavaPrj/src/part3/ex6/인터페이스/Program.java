package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		scan.close();
		fis.close();
		
		
		Class clazz = Class.forName(className);
		A a = new A();
		X x = (X) clazz.getDeclaredConstructor().newInstance();
		a.setX(x);
		a.print();
	}

}
