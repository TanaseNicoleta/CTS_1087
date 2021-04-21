package ro.ase.csie.cts.dp.proxy;

public class TestProxy {
    public static void main(String[] args) {
        InterfataModulLogIn logIn = new ModulLogIn("10.0.0.1", 127);
        logIn = new ProxyLogin(logIn);

        if(logIn.logIn("admin", "admin12"))
            System.out.println("Hello admin");

        String[] parole = new String[]{"1234", "123456", "admin", "root", "admin12"};
        for(String parola : parole)
            if(logIn.logIn("admin", parola))
                System.out.println("Parola gasita " + parola);
    }
}
