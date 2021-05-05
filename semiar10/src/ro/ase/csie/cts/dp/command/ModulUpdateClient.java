package ro.ase.csie.cts.dp.command;

public class ModulUpdateClient implements  InterfataModulJoc {
    @Override
    public void ececutaActiunea(String numeActiune) {
        System.out.println("Update client joc. Detalii: " + numeActiune);
    }
}
