package Tutorium2021;

public class Aufgabe4 {
	public static boolean hatElement(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element)
				return true;
		}
		return false;
	}

	public static int[] addElement(int[] arr, int element, int index) {
		int[] hilf = arr;
		arr = new int[hilf.length + 1];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				arr[i] = element;
				continue;
			}
			arr[i] = hilf[j];
			j++;
		}
		return arr;
	}

	public static int[] kehreArrayUm(int[] arr) {
		int[] hilf = new int[arr.length];
		for (int i = 0, j = arr.length - 1; i < hilf.length; i++, j--) {
			hilf[j] = arr[i];
		}
		return hilf;
	}

	public static int[] entferneDoppelteElemente(int[] arr) {
		boolean[] doppeltesElement = new boolean[arr.length];
        int anzahlDoppelteElemente = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    doppeltesElement[j] = true;
                }
            }
        }
        for (boolean b : doppeltesElement) {
			if(b == true)
				anzahlDoppelteElemente++;
		}
        int[] arrayOhneDoppelteElemente = new int[arr.length - anzahlDoppelteElemente];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!doppeltesElement[i]) {
                arrayOhneDoppelteElemente[index] = arr[i];
                index ++;
            }
        }
        return arrayOhneDoppelteElemente;
    }
	public static int[] sortereArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int hilf = arr[i];
					arr[i] = arr[j];
					arr[j] = hilf;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20 + 1);
		}
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int[] neuArr = addElement(arr, 900, 5);
		for (int i : neuArr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int[] umkehrArray = kehreArrayUm(arr);
		for (int i : umkehrArray) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int[] entfernteArray = entferneDoppelteElemente(arr);
		for (int i : entfernteArray) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int[] sortierteArray = sortereArray(arr);
		for (int i : sortierteArray) {
			System.out.printf(i + "\t");
		}
	}

}
