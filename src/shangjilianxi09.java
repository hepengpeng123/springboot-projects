import java.util.Scanner;


public class shangjilianxi09 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("С�����Գɼ���");
		int f=input.nextInt();
		if (f==100) {
			System.out.println("�ְָ���������");
		} else if (f<100&&f>=90) {
			System.out.println("���������MP4");
		} else if (f<90&&f>=60) {
			System.out.println("��������򱾲ο���");
		} else if (f<60) {
			System.out.println("ʲô������");
		}
	}
}
