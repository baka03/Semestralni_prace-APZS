package com.github.it115_Brambory.Semestralni_prace_APZS.logika;

/**
 *  Rozhraní které musí implementovat BuddyAplikace, je na ně navázáno uživatelské rozhraní
 *
 */
public interface IBuddyAplikace {

	/**
     *  Metoda vrátí odkaz na BuddyAplikaci.
     *  
     *  @return     odkaz na BuddyAplikaci
     */
	public BuddyAplikace getBuddyAplikace();
	
	/** 
     * Vrací informaci o tom, zda BuddyAplikace již skončila.
     * 
     * @return   vrací true, pokud BuddyAplikace skončila
     */
	public boolean konecBuddyAplikace();
}
