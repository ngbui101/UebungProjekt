package Uebungsblatt24;

public class AutoApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Auto vw = new Auto(); 
		vw.setTyp("VW");
		AutoReifenSatz reifen1 = new AutoReifenSatz("SommerReifen", 4);
		vw.setReifen(reifen1);
		
		Auto bmw = vw.clone();
		bmw.setTyp("bmw");
		//AutoReifenSatz reifen2 = new AutoReifenSatz("WinterReifen", 4);
		bmw.getReifen().setTyp("Winterreifen");;
		System.out.println(vw);
		System.out.println(bmw);
	}

}
