package com.github.it115_Brambory.Semestralni_prace_APZS.logika;

/**
 * Třída popisující obecného studenta.
 * Ve třídách Exchange a Buddy jsou blíže vysvětleni potomci třídy - čeští studenti a zahraniční.
 * 
 */
public class Admin extends Uzivatel{
	
	private String jmeno;
	private String prijmeni;
	
	/**
     * Konstruktor pro admina.
     * 
     * @param String email, String heslo, boolean access, String jmeno, String prijmeni.
     */
	public Admin(String email, String heslo, boolean access, String jmeno, String prijmeni) {
		super(email, heslo, access);
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
	}

	/**
     * Getter na jméno.
     * 
     * @return String jmeno.
     */
	public String getJmeno() {
		return jmeno;
	}
	
	/**
     * Setter na jméno.
     * 
     * @param String jmeno.
     */
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	
	/**
     * Getter na příjmení.
     * 
     * @return String prijmeni.
     */
	public String getPrijmeni() {
		return prijmeni;
	}
	
	/**
     * Setter na příjmení.
     * 
     * @param String prijmeni.
     */
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	
	/**
     * Metoda toString k výpisu obsahu proměnných.
     * 
     * @return String výpis atributů.
     */
	@Override
	public String toString() {
		return "Student [jmeno=" + jmeno + ", prijmeni=" + prijmeni + "]";
	}
	
}
