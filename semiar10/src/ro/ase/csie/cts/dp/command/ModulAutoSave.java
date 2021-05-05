package ro.ase.csie.cts.dp.command;

public class ModulAutoSave implements InterfataModulJoc {
    @Override
    public void ececutaActiunea(String numeActiune) {
        System.out.println("Se realizeaza auto-save pt: " + numeActiune);
    }
}
