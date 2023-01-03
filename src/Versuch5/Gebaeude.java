package Versuch5;

public abstract class Gebaeude {
	private String type;
	private String klingelanlage;
	private String alarmanlage;
	private String automatischerTueroeffner;
	public Gebaeude(String type, String klingeanlage, String alarmanlage, String automatischerTueroeffner) {
		this.type = type;
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
