package observerPull;

public class Main {

    public static void main(String[] args) {
        SprechstundenListe sl = new SprechstundenListe();

        sl.attach(new Email(sl));
        sl.attach(new WebService(sl));

        sl.addSprechstunde(new Sprechstunde("KOPG", "H932", 0, "11:30", "12:20"));
        sl.addSprechstunde(new Sprechstunde("HOEK", "H933", 3, "9:50", "10:40"));
        sl.sendUpdate();
    }

}
