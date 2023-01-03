package Klausur22092005;

public class Schraubeapplication {

	public static void main(String[] args) {
		Schraube s = new Schraube(1, 2);
		MaschineSchraube ms = new MaschineSchraube(1, 2, null, null);
		String s1 = ms.getType();
		String s2 = s.getType();
		String s3 = ((Schraube)ms).getType();
//		String s4 = ((MaschineSchraube)s).getType();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		System.out.println(s4);
	}

}
