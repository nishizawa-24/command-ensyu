import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��l�ڂ̐g������͂��Ă��������B");
		System.out.println("�P�ʂ�cm�ł͂Ȃ�m�ł��B");
		System.out.print("��l�ڂ̐g���F");
		double height1 = sc.nextDouble();
		System.out.println("��l�ڂ̑̏d����͂��Ă��������B");
		System.out.print("��l�ڂ̑̏d�F");
		double weight1 = sc.nextDouble();
		System.out.println("��l�ڂ�BMI���v�Z���܂��B");
		double bmi1 = weight1/(height1*height1);
		System.out.println("��l�ڂ�BMI�F" + String.format("%.2f",bmi1));

		System.out.println("��l�ڂ̐g������͂��Ă��������B");
                System.out.println("�P�ʂ�cm�ł͂Ȃ�m�ł��B");
                System.out.print("��l�ڂ̐g���F");
                double height2 = sc.nextDouble();
                System.out.println("��l�ڂ̑̏d����͂��Ă��������B");
                System.out.print("��l�ڂ̑̏d�F");
                double weight2 = sc.nextDouble();
                System.out.println("��l�ڂ�BMI���v�Z���܂��B");
                double bmi2 = weight2/(height2*height2);
                System.out.println("��l�ڂ�BMI�F" + String.format("%.2f",bmi2));

		sc.close();
	}
}

