package ro.ase.csie.cts.seminar4;

//Singleton class -- a class with a single instance
public class Elvis {
    public final static Elvis theTrueElvis = new Elvis();
    private Elvis(){

    }

    public void sing() {
        System.out.println("Elvis is singing");
    }



}
