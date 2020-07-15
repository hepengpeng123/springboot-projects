import java.util.Scanner;


public class shangjilianxi11 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("请输入会员积分：");
		int x=input.nextInt();
		if (x<2000) {
			System.out.println("该会员享受的折扣是：0.9");
		} else if (x>=2000&&x<4000) {
			System.out.println("该会员享受的折扣是：0.8");
		} else if (x>=4000&&x<8000) {
			System.out.println("该会员享受的折扣是：0.7");
		} else if (x>=8000) {
			System.out.println("该会员享受的折扣是：0.6");
		}

		
		
	}
}
