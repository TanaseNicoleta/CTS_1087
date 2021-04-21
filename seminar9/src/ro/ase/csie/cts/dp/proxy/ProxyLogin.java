package ro.ase.csie.cts.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogIn {
    InterfataModulLogIn modulLogIn = null;
    public static final int NR_MAX_INCERCARI = 3;
    public Map<String, Integer> nrIncercari = new HashMap<>();

    public ProxyLogin(InterfataModulLogIn modulLogIn) {
        this.modulLogIn = modulLogIn;
    }

    @Override
    public boolean logIn(String userName, String password) {
        Integer nrIncercariNereusite = nrIncercari.get(userName);
        if(nrIncercariNereusite == null) {
            nrIncercari.put(userName, 0);
            nrIncercariNereusite = 0;
        }

        if(modulLogIn != null) {
            if (nrIncercariNereusite < NR_MAX_INCERCARI) {
                if (modulLogIn.logIn(userName, password) == true) {
                    nrIncercariNereusite = 0;
                    nrIncercari.put(userName, nrIncercariNereusite);
                    return true;
                }
                else {
                    nrIncercariNereusite += 1;
                    nrIncercari.put(userName, nrIncercariNereusite);
                    return false;
                }
            } else
                return false;
        }
        else
            throw new UnsupportedOperationException();

    }

    @Override
    public boolean verificaStatusServer() {
        if(modulLogIn != null)
            return modulLogIn.verificaStatusServer();
        else
            throw new UnsupportedOperationException();
    }
}
