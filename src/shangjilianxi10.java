import java.util.Scanner;


public class shangjilianxi10 {
	public static void main(String[] args) {
		Scanner input= new 	Scanner (System.in);
		System.out.println("请输入是否是会员：是(y)/否(其他字符)");
		String a="y";
		 a=input.next();
		 System.out.println("请输入购物金额:");
		 double b=input.nextDouble();
		if (a.equals("y")&&b<200) {
			System.out.println("实际支付："+b*0.8);
		} else if (a.equals("y")&&b>200) {
			System.out.println("实际支付："+b*0.75);
		}
	}
}
