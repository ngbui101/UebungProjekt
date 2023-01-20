package Tutorium;

public class Haus {
	private String adresse;
	private Person[] bewohner = new Person[0];
	
	public Haus(String adresse) {
		this.adresse = adresse;
		//bewohner = new Person[4];
	}
	public String getAdresse() {
		return adresse;
	}
	public Person[] getBewohner() {
		return bewohner;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setBewohner(Person[] bewohner) {
		this.bewohner = bewohner;
	}
	public void addPerson(String name, String vorname, int alter) {
//		for (int i = 0; i < bewohner.length; i++) {
//			if(bewohner[i] == null) {
//				bewohner[i] = new Person(alter, name, vorname);
//				break;
//			}
//			if(bewohner[bewohner.length-1] != null )
//				System.out.println("Array ist voll, kein weitere Person hunzufuegin");
//		}
		Person[] temp = bewohner;
		bewohner = new Person[temp.length+1];
		for (int i = 0; i < temp.length; i++) {
			bewohner[i] = temp[i];
		}
		
		bewohner[temp.length] = new Person(alter, name, vorname);
	}
	public void bewohnerAusgeben() {
		for (Person person : bewohner) {
			System.out.printf("%s %s %d%n",person.getVorname(),person.getName(),person.getAlter());
		}
		System.out.println(bewohner.length);
	}
}
