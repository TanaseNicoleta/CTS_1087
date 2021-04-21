package ro.ase.csie.cts.dp.state;

public class TestState {

    public static void main(String[] args) {
        Supererou superman = new Supererou("Superman", 100);

        superman.seDeplaseaza();
        superman.esteAtacat(50);
        superman.seDeplaseaza();
        superman.esteAtacat(25);
        superman.seDeplaseaza();
        superman.seVindeca(30);
        superman.seDeplaseaza();
    }
}
