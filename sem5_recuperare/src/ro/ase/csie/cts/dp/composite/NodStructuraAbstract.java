package ro.ase.csie.cts.dp.composite;

public abstract class NodStructuraAbstract implements InterfataCaractereNPC {
   public abstract void adaugaNod(NodStructuraAbstract nod);
   public abstract void stergeNod(NodStructuraAbstract nod);
   public abstract NodStructuraAbstract getNod(int index);
}
