import java.util.Scanner;


public class shangjilianxi14 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("请输入消费金额：");
		int a=input.nextInt();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐1瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元换购一个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元换购偶蓝牙爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.println("请选择：");
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			break;
		case 2:
			System.out.println("2：满100元，加3元换购500ml可乐1瓶");		
			break;
		
		case 3:
			System.out.println("3：满100元，加10元换购5公斤面粉");
			break;
		case 4:
			System.out.println("4：满200元，加10元换购一个苏泊尔炒菜锅");
			break;
		case 5:
			System.out.println("5：满200元，加20元换购偶蓝牙爽肤水一瓶");
			break;
		case 0:
			System.out.println("0：不换购");
			break;
		
		default:System.out.println("输入有误");
			break;
		}
		if (num==1) {
			System.out.println("");
		} else {

		}
	}
}
