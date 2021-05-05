package ro.ase.csie.cts.dp.chain;

public abstract class NodChainAbstract {
    NodChainAbstract next = null;
    String numeModul;

    public NodChainAbstract(String numeModul) {
        this.numeModul = numeModul;
    }

    public void setNext(NodChainAbstract next) {
        this.next = next;
    }

    public abstract void procesareMesajChat(MesajChat mesaj);
}
