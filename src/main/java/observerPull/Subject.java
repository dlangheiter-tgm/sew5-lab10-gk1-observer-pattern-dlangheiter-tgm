package observerPull;

import java.util.List;

/**
 * Ein subject wo sich ein Observer anmelden und abmelden kann
 */
public interface Subject {

	/**
	 * Meldet einen observer an diesem Subject an
	 * @param observer Observer zum anmelden
	 */
	void attach(Observer observer);

	/**
     * Meldet einen Observer von diesem Subject ab
	 * @param observer Observer zum abmelden
	 */
	void remove(Observer observer);

	/**
     * Sendet ein update an alle angemeldeted Observer
	 */
	void sendUpdate();

	List<Sprechstunde> getState();

}
