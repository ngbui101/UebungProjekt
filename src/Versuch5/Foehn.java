package Versuch5;

public class Foehn extends Geraet{

	public Foehn(String kabel, String einAusSchalter) {
		super(kabel, einAusSchalter);
		setGeraeteTyp("Foehn");
	}
	
	@Override
	public String wechseln(String teil) {
		return super.wechseln(teil) + ". Beim Foehn ist neu : " + teil;
	}

	@Override
	public void ausgabe() {
		System.out.printf("Kabel: %s%nEinausschalter: %s%n",super.getKabel(),getEinAusSchalter());
	}
	
	
}
