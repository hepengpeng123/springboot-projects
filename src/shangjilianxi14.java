import java.util.Scanner;


public class shangjilianxi14 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("���������ѽ�");
		int a=input.nextInt();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����1ƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ����һ���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ����ż����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.println("��ѡ��");
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
			break;
		case 2:
			System.out.println("2����100Ԫ����3Ԫ����500ml����1ƿ");		
			break;
		
		case 3:
			System.out.println("3����100Ԫ����10Ԫ����5�������");
			break;
		case 4:
			System.out.println("4����200Ԫ����10Ԫ����һ���ղ������˹�");
			break;
		case 5:
			System.out.println("5����200Ԫ����20Ԫ����ż����ˬ��ˮһƿ");
			break;
		case 0:
			System.out.println("0��������");
			break;
		
		default:System.out.println("��������");
			break;
		}
		if (num==1) {
			System.out.println("");
		} else {

		}
	}
}
