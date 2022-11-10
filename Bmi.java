import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("一人目の身長を入力してください。");
		System.out.println("単位はcmではなくmです。");
		System.out.print("一人目の身長：");
		double height1 = sc.nextDouble();
		System.out.println("一人目の体重を入力してください。");
		System.out.print("一人目の体重：");
		double weight1 = sc.nextDouble();
		System.out.println("一人目のBMIを計算します。");
		double bmi1 = weight1/(height1*height1);
		System.out.println("一人目のBMI：" + String.format("%.2f",bmi1));

		System.out.println("二人目の身長を入力してください。");
                System.out.println("単位はcmではなくmです。");
                System.out.print("二人目の身長：");
                double height2 = sc.nextDouble();
                System.out.println("二人目の体重を入力してください。");
                System.out.print("二人目の体重：");
                double weight2 = sc.nextDouble();
                System.out.println("二人目のBMIを計算します。");
                double bmi2 = weight2/(height2*height2);
                System.out.println("二人目のBMI：" + String.format("%.2f",bmi2));

		sc.close();
	}
}

