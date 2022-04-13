package assignment;

public class MasinaClasica extends Masina{
    private String aditivCompatibil;

    public MasinaClasica(String producator, int sasiu, String culoare, String aditivCompatibil) {
        super(producator, sasiu, culoare);
        this.aditivCompatibil = aditivCompatibil;
    }

    @Override
    public void getDetails() {
        super.getDetails();
    }
}
