import java.util.Scanner;


public class shangjilianxi11 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("�������Ա���֣�");
		int x=input.nextInt();
		if (x<2000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.9");
		} else if (x>=2000&&x<4000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.8");
		} else if (x>=4000&&x<8000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.7");
		} else if (x>=8000) {
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�0.6");
		}

		
		
	}
}
