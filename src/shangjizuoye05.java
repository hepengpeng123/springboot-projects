import java.util.Scanner;


public class shangjizuoye05 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("我行我素购物购物系统>客户信息管理>添加客户信息\n");
		System.out.print("请输入会员号(<4位整数>)：");
		int a =input.nextInt();
		System.out.print("请输入会员生日(月/日<用两位数表示>)：");
		String b= input.next();
		System.out.print("请输入积分：\n");
		int c=input.nextInt();
		System.out.print("已录入的会员信息是：\n"+a+"\t"+b+"\t"+c);
	}
}
