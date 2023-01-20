package Tutorium;

public class Aufgabe101 {

	public static void main(String[] args) {
		String[] arr = new String[40];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "";
			for (int j = 0; j < 10; j++) {
				arr[i] = arr[i] + (char)((int)(Math.random()*(94-32) + 32));
			}
		}
		for (String string : arr) {
			System.out.println(string);
		}
		for (int i = 0; i < arr.length; i++) {
			char[] charArr = arr[i].substring(5,10).toCharArray();
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[j] >= 48 && charArr[j] <= 57)
					charArr[j] = '?';
			}
			for (char c : charArr) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
