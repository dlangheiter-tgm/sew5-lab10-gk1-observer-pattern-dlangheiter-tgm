package observerPush;

/**
 * Observer klasse
 */
public interface Observer {

	/**
	 * Methode die vom Subject aufgerufen wird wenn es ein update gibt
	 * @param liste Die neue Sprechstunden Liste
	 */
	void update(SprechstundenListe liste);

}
