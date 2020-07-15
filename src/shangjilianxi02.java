import java.util.Scanner;


public class shangjilianxi02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("输入张浩的Java的成绩");
		int num=input.nextInt();
		if (num>98){
		System.out.println("老师说：不错，奖励一个MP4！");
		} else {
		System.out.println("老师说：罚你进行编程");
		}
		
	}
}
