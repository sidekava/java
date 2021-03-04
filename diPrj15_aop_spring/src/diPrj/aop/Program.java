package diPrj.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPrj.aop.entity.Exam;
import diPrj.di.NewlecDIConfig;

public class Program {
	public static void main (String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class); 
//				new ClassPathXmlApplicationContext("diPrj/aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %d\n", proxy.avg());
//		Exam exam = new NewlecExam(1, 1, 1, 1);
//		
//		/*
//		 * �봽�씫�떆�뒗 媛�吏쒖씤�뜲 �떎�젣泥섎읆 濡쒕뱶�빐�빞 �븳�떎. 洹몃옒�꽌 loader�뿉 媛앹껜瑜� 濡쒕뱶�븷 �닔 �엳�룄濡� �븳�떎.
//		 */
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						
//						String message = (end - start) + "ms �떆媛꾩씠 嫄몃졇�뒿�땲�떎";
//						System.out.println(message);
//						
//						return result;
//					}
//				}
//		);
		
				
	}

}
