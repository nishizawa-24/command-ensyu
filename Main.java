import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�g������͂��Ă��������B");
		System.out.println("�P�ʂ�cm�ł͂Ȃ�m�ł��B");
		System.out.print("�g���F");
		double height = sc.nextDouble();
		System.out.println("�̏d����͂��Ă��������B");
		System.out.print("�̏d�F");
		double weight = sc.nextDouble();
		System.out.println("BMI���v�Z���܂��B");
		double bmi = weight/(height*height);
		System.out.println("BMI�F" + String.format("%.2f",bmi));
		sc.close();
	}
}

