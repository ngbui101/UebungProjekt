package JA1letztePRKlausur;


import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {
		byte a = (byte) 137;
		String eingabe = JOptionPane.showInputDialog("dsad");
		String[] str = eingabe.split(" ");
		String b = str[0];
		String c = str[1];
		System.out.println(b + "\n" + c);
	}

}
