package assignment;

public class MasinaElectrica extends Masina{
    private int autonomieBaterie;


    public MasinaElectrica(String producator, int sasiu, String culoare, int autonomieBaterie) {
        super(producator, sasiu, culoare);
        this.autonomieBaterie = autonomieBaterie;
    }

    @Override
    public void getDetails() {
        super.getDetails();
    }
}
