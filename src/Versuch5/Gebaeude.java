package Versuch5;

public abstract class Gebaeude {
	private String type;
	private String klingelanlage;
	private String alarmanlage;
	private String automatischerTueroeffner;
	public Gebaeude( String klingeanlage, String alarmanlage, String automatischerTueroeffner) {
		this.klingelanlage = klingeanlage;
		this.alarmanlage = alarmanlage;
		this.automatischerTueroeffner = automatischerTueroeffner;
	}
	void setKlingeanlage(String klingeanlage) {
		this.klingelanlage = klingeanlage;
	}

	void setAlarmanlage(String alarmanlage) {
		this.alarmanlage = alarmanlage;
	}
	public void setType(String type) {
		this.type = type;
	}

	void setAutomatischerTueroeffner(String automatischerTueroeffner) {
		this.automatischerTueroeffner = automatischerTueroeffner;
	}
	void typeAusgabe() {
		System.out.println(type);
	}
	public String getKlingelanlage() {
		return klingelanlage;
	}
	public String getAlarmanlage() {
		return alarmanlage;
	}
	public String getAutomatischerTueroeffner() {
		return automatischerTueroeffner;
	}
	
}
