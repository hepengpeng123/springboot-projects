import java.util.Scanner;


public class shangjilianxi08 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("���������ܰ�������������");
		int s=input.nextInt();
		System.out.println("�Ա�");
		String sex=input.next();
		if (s<10&&sex.equals("��")) {
			System.out.println("�������Ӷ�");
		} else if (s<10&&sex.equals("Ů")) {
			System.out.println("����Ů�Ӷ�");
		}
		
		}
		
	}

