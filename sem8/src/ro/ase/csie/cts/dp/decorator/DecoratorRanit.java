package ro.ase.csie.cts.dp.decorator;

import ro.ase.csie.cts.dp.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter {
    public DecoratorRanit(ACMECaracterJoc caracter) {
        super(caracter);
    }

    @Override
    public void seDeplaseaza() {
        if(this.caracter.getPuncteViata() < 100) {
            System.out.println("Eroul nu se mai poate deplasa, este ranit critic!");
        } else
            this.caracter.seDeplaseaza();

    }
}
