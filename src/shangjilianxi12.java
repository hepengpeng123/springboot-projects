import java.util.Scanner;


public class shangjilianxi12 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("韩嫣获得第几名");
		String num=input.next();
		if (num.equals("第一名")) {
			System.out.println("将参加麻省理工大学组织的1个月夏令营");
		} else if (num.equals("第二名")) {
			System.out.println("将奖励惠普笔记本电脑一部");
		} else if (num.equals("第三名")) {
			System.out.println("将奖励移动硬盘一个");
		}else{
			System.out.println("不给任何奖励");
		}
		
	}
}
