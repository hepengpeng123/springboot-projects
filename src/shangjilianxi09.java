import java.util.Scanner;


public class shangjilianxi09 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("小明考试成绩：");
		int f=input.nextInt();
		if (f==100) {
			System.out.println("爸爸给他买辆车");
		} else if (f<100&&f>=90) {
			System.out.println("妈妈给他买MP4");
		} else if (f<90&&f>=60) {
			System.out.println("妈妈给他买本参考书");
		} else if (f<60) {
			System.out.println("什么都不买");
		}
	}
}
