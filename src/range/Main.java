package range;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {

		System.out.print("Введите начальное число: ");
		int a = pruf();
		
		int b;
		boolean loop = true;
		do {
			System.out.println("Введите конечное число: ");
			b = pruf();
			if (b < a) {
				System.out.println("Конечное число не может быть меньше начального." + " Повторите попытку. ");
			} else {
				loop = false;
			}
		} while (loop);
		
		System.out.println("Простые числа в диапазоне от " + a + " до " + b + ": ");
		do {
			boolean print = isSimple(a);
			if (print  && a != 4) {
				System.out.print(a + " ");
			}
			a++;
		} while (a <= b);

	}

	public static int pruf() {
		boolean loop = true;
		int nor = 0;
		do {

			try {
				nor = scanner.nextInt();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Это должно быть целое число! Попробуй еще раз: ");
				scanner.next();
			}
		} while (loop);
		loop = true;
		return nor;

	}

	public static boolean isSimple(Integer number) {
		if (number < 2)
			return false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
