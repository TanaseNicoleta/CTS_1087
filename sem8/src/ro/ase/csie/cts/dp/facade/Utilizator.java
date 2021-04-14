package ro.ase.csie.cts.dp.facade;

public class Utilizator {

    public void login(String userNAme, String password) {
        System.out.println("Login");
    }

    public ProfilJucator getProfil() {
        return new ProfilJucator();
    }
}
