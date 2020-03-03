package observerPull;

public class WebService implements Observer {

	private Subject subject;

	public WebService(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @see Observer#update()
	 */
	public void update() {
		System.out.println("UPDATE WEB " + subject.getState().size());
	}

}
