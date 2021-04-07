package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.dp.simpleFactory.TipErou;

public abstract class FactoryAbstract {

    public abstract SuperErouAbstract getSuperErou(TipErou tip,
                                                   String nume);
}