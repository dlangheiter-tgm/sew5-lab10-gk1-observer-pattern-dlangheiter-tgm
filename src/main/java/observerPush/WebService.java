package observerPush;

public class WebService implements Observer {


	/**
	 * @see Observer#update(SprechstundenListe)
	 */
	public void update(SprechstundenListe liste) {
		System.out.println("UPDATE WEB " + liste.getList().size());
	}

}
