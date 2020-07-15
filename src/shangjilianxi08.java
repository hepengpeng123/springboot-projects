import java.util.Scanner;


public class shangjilianxi08 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("请输入你跑百米赛的秒数：");
		int s=input.nextInt();
		System.out.println("性别：");
		String sex=input.next();
		if (s<10&&sex.equals("男")) {
			System.out.println("进入男子队");
		} else if (s<10&&sex.equals("女")) {
			System.out.println("进入女子队");
		}
		
		}
		
	}

