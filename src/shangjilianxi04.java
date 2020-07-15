import java.util.Scanner;


public class shangjilianxi04 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("我行我素管理系统>幸运抽奖\n");
		System.out.print("请输入4位会员号：");
		int a=input.nextInt();
		int b=a/100%10;
		int b1=(int)(Math.random()*10+1);
		if (b==b1) {
			System.out.println(a+"号客户是幸运客户，获得精美MP3一个。");
		} else {
			System.out.println(a+"号客户,谢谢您的支持！");
		}
	}
}
