package Geometria3D;

public class cubo {
    double lCu, areaCu, volumenCu;

    public cubo(double lCu, double areaCu, double volumenCu) {
        this.lCu = lCu;
        this.areaCu = areaCu;
        this.volumenCu = volumenCu;
    }

    public double getlCu() {
        return lCu;
    }

    public void setlCu(double lCu) {
        this.lCu = lCu;
    }

    public double getAreaCu() {
        return areaCu;
    }

    public void setAreaCu(double areaCu) {
        this.areaCu = areaCu;
    }

    public double getVolumenCu() {
        return volumenCu;
    }

    public void setVolumenCu(double volumenCu) {
        this.volumenCu = volumenCu;
    }
}
