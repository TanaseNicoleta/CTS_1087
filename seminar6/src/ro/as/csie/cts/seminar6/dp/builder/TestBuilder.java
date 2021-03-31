package ro.as.csie.cts.seminar6.dp.builder;

public class TestBuilder {
    public static void main(String[] args) {
        //Construiesti obiectul
        Supererou supererou = new Supererou();
        //Initializare atribute
        supererou.nume = "Superman";

        Supererou supererou2 =
                new Supererou("Batman", 100, false, false, new Arma(), null, null, null);

    }
}
