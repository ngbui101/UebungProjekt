package Tutorium2021;

public class Aufgabe8 {
	public static int ggT(int a,int b) {
		if(a == b)
			return a;
		if(a>b)
			return ggT(a-b, b);
		return ggT(a,b-a);
	}
	public static void main(String[] args) {
		int a = 50;
		int b = 17;
		System.out.println(ggT(a, b));
	}

}
