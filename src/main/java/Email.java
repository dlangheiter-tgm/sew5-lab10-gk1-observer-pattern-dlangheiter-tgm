public class Email implements Observer {

	/**
	 * @see Observer#update(SprechstundenListe)
	 */
	public void update(SprechstundenListe liste) {
		System.out.println("UPDATE EMAIL " + liste.getList().size());
	}

}
