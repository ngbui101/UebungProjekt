package Tutorium;


public class Aufgabe81 {
	public static int addMethode(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public static int minSuch(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	public static int maxSuch(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 50;
		int min = 10; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(max - min) + min);
		}
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("Max: " + maxSuch(arr));
		System.out.println("Min: " + minSuch(arr));
		System.out.println("Summe: " + addMethode(arr) );
	}

}