import java.util.Scanner;


public class shangjizuoye05 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("�������ع��ﹺ��ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		System.out.print("�������Ա��(<4λ����>)��");
		int a =input.nextInt();
		System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
		String b= input.next();
		System.out.print("��������֣�\n");
		int c=input.nextInt();
		System.out.print("��¼��Ļ�Ա��Ϣ�ǣ�\n"+a+"\t"+b+"\t"+c);
	}
}
