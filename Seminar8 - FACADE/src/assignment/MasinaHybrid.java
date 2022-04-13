package assignment;

public class MasinaHybrid extends Masina{
    private boolean plugIn;

    public MasinaHybrid(String producator, int sasiu, String culoare, boolean plugIn) {
        super(producator, sasiu, culoare);
        this.plugIn = plugIn;
    }

    @Override
    public void getDetails() {
        super.getDetails();
    }
}
