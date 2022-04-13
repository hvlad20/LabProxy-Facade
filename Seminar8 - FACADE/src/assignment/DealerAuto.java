package assignment;

public class DealerAuto {
    MasinaElectrica me;
    MasinaClasica mc;
    MasinaHybrid mh;

    public void getDetailsMC() {
        mc.getDetails();
    }

    public void getDetailsME() {
        me.getDetails();
    }

    public void getDetailsMH() {
        mh.getDetails();
    }
}
