package ro.ase.csie.cts.dp.adapter;

public interface ActiuniDisney {
    public void move(int x, int y);
    public void primesteLovitura(int power);
    public void reincarca(int power);
    public void jump();

    String getNume();

    int getPower();
}
