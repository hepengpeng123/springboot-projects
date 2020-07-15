import java.util.Scanner;


public class shangjilianxi {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("输入张浩的Java成绩：");
		int num=input.nextInt();
		if (num>98) {
			System.out.println("老师说：不错，奖励一个MP4！");
		}
	}
}
