import java.util.Scanner;


public class shangjilianxi12 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("���̻�õڼ���");
		String num=input.next();
		if (num.equals("��һ��")) {
			System.out.println("���μ���ʡ����ѧ��֯��1��������Ӫ");
		} else if (num.equals("�ڶ���")) {
			System.out.println("���������ձʼǱ�����һ��");
		} else if (num.equals("������")) {
			System.out.println("�������ƶ�Ӳ��һ��");
		}else{
			System.out.println("�����κν���");
		}
		
	}
}
