package Uebungen;

public class ArraySortierenTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				int hilf = arr[j];
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j+1];
					arr[i+1] = hilf;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
