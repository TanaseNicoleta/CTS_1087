package ro.ase.csie.cts.seminar6.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter {
    String culoare;
    int inaltime;

    ArrayList<Integer> puncte;

    private Model3DCaracter() {
    }

    public Model3DCaracter(String culoare) {
        this.culoare = culoare;

        System.out.println("Incarcare model 3D din fisier...........");
        try {
            Thread.sleep(2000);
            Random random = new Random(10);
            for(int i =0; i<20 ;i++) {
                this.puncte.add(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Object clone() throws CloneNotSupportedException {
        Model3DCaracter copie = new Model3DCaracter();
        copie.culoare = this.culoare;
        copie.inaltime = this.inaltime;
        copie.puncte = (ArrayList<Integer>) this.puncte.clone();
        return copie;
    }
}