package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.*;

class FactoryTemaUniversala extends FactoryAbstract{

    @Override
    public SuperErouAbstract getSuperErou(TipErou tip, String nume) {
        SuperErouAbstract superErou = null;
        switch (tip) {
            case DISNEY:
                superErou=new CaracterDisney(nume, 100, false);
                break;
            case MARVEL:
                superErou=new CaracterMarvel(nume, 500, 0);
                break;
            case DC:
                superErou=new CaracterDCComics(nume, 500,0);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return superErou;
    }

}
