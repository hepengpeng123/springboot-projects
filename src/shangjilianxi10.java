import java.util.Scanner;


public class shangjilianxi10 {
	public static void main(String[] args) {
		Scanner input= new 	Scanner (System.in);
		System.out.println("�������Ƿ��ǻ�Ա����(y)/��(�����ַ�)");
		String a="y";
		 a=input.next();
		 System.out.println("�����빺����:");
		 double b=input.nextDouble();
		if (a.equals("y")&&b<200) {
			System.out.println("ʵ��֧����"+b*0.8);
		} else if (a.equals("y")&&b>200) {
			System.out.println("ʵ��֧����"+b*0.75);
		}
	}
}
