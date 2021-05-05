package ro.ase.csie.cts.dp.chain;

public class ModulFiltru extends NodChainAbstract{

    public ModulFiltru(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        String[] dictionar = new String[] {"rau", "obraznic", "violent"};
        boolean esteValid = true;

        for(String cuv : dictionar) {
            if (mesaj.getContinut().contains(cuv)) {
                esteValid = false;
                break;
            }
        }

        if (this.next != null) {
            this.next.procesareMesajChat(mesaj);
        }
    }
}
