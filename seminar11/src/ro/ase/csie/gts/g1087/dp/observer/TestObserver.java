package ro.ase.csie.gts.g1087.dp.observer;

public class TestObserver {
    public static void main(String[] args) {
        ModulConexiuneInternet modulConexiuneInternet = new ModulConexiuneInternet();
        ModulAutoSalvare modulAutoSalvare = new ModulAutoSalvare();
        ModulNotificareJucator modulNotificareJucator = new ModulNotificareJucator();

        modulConexiuneInternet.registerModul(modulNotificareJucator);
        modulConexiuneInternet.registerModul(modulAutoSalvare);

        modulConexiuneInternet.pierdereConexiune();

        modulConexiuneInternet.unregisterModul(modulAutoSalvare);
        modulConexiuneInternet.pierdereConexiune();

    }
}
