import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("身長を入力してください。");
		System.out.println("単位はcmではなくmです。");
		System.out.print("身長：");
		double height = sc.nextDouble();
		System.out.println("体重を入力してください。");
		System.out.print("体重：");
		double weight = sc.nextDouble();
		System.out.println("BMIを計算します。");
		double bmi = weight/(height*height);
		System.out.println("BMI：" + String.format("%.2f",bmi));
		sc.close();
	}
}

