import java.util.Scanner;


public class shangjilainxi01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("输入张浩的Java成绩：");
		System.out.println("输入张浩的音乐成绩：");
		int num=input.nextInt();
		int num1=input.nextInt();
		if ((num>98&&num1>80)||(num==100&&num1>70)) {
			System.out.println("老师说：不错，奖励一个MP4！");
		
		}
	}
}
