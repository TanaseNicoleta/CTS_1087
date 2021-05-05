package ro.ase.csie.cts.dp.chain;

public class ModulChatPrivat extends  NodChainAbstract {
    public static final String NUME_MODUL = "Modul Chat Privat";

    public ModulChatPrivat() {
        super(NUME_MODUL);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {
            if (this.next != null) {
                this.next.procesareMesajChat(mesaj);
            } else {
                System.out.println(String.format("Mesaj privat pt %s = %s",
                        mesaj.getDestinatie(), mesaj.getContinut()));
            }
        }
    }
}
