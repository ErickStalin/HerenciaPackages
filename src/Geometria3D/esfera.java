package Geometria3D;

public class esfera {
    double radioEs, areaEs, volumenEs;

    public esfera(double radioEs, double areaEs, double volumenEs) {
        this.radioEs = radioEs;
        this.areaEs = areaEs;
        this.volumenEs = volumenEs;
    }

    public double getRadioEs() {
        return radioEs;
    }

    public void setRadioEs(double radioEs) {
        this.radioEs = radioEs;
    }

    public double getAreaEs() {
        return areaEs;
    }

    public void setAreaEs(double areaEs) {
        this.areaEs = areaEs;
    }

    public double getVolumenEs() {
        return volumenEs;
    }

    public void setVolumenEs(double volumenEs) {
        this.volumenEs = volumenEs;
    }
}
