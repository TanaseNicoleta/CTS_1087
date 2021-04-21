package ro.ase.csie.cts.dp.proxy;

public class ModulLogIn implements InterfataModulLogIn {

    String ipServer;
    int port;

    public ModulLogIn(String ipServer, int port) {
        this.ipServer = ipServer;
        this.port = port;
    }

    @Override
    public boolean logIn(String userName, String password) {
       if(userName.equals("admin") && password.equals("admin12"))
           return true;
       else
           return false;
    }

    @Override
    public boolean verificaStatusServer() {
        return false;
    }
}
