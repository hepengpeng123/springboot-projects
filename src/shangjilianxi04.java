import java.util.Scanner;


public class shangjilianxi04 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("�������ع���ϵͳ>���˳齱\n");
		System.out.print("������4λ��Ա�ţ�");
		int a=input.nextInt();
		int b=a/100%10;
		int b1=(int)(Math.random()*10+1);
		if (b==b1) {
			System.out.println(a+"�ſͻ������˿ͻ�����þ���MP3һ����");
		} else {
			System.out.println(a+"�ſͻ�,лл����֧�֣�");
		}
	}
}
