package Geometria3D;

public abstract class cilindro {
    double alturaCil, radioCil, areaCil, volumenCil;

    public cilindro(double alturaCil, double radioCil, double areaCil, double volumenCil) {
        this.alturaCil = alturaCil;
        this.radioCil = radioCil;
        this.areaCil = areaCil;
        this.volumenCil = volumenCil;
    }

    public double getAlturaCil() {
        return alturaCil;
    }

    public void setAlturaCil(double alturaCil) {
        this.alturaCil = alturaCil;
    }

    public double getRadioCil() {
        return radioCil;
    }

    public void setRadioCil(double radioCil) {
        this.radioCil = radioCil;
    }

    public double getAreaCil() {
        return areaCil;
    }

    public void setAreaCil(double areaCil) {
        this.areaCil = areaCil;
    }

    public double getVolumenCil() {
        return volumenCil;
    }

    public void setVolumenCil(double volumenCil) {
        this.volumenCil = volumenCil;
    }

    public abstract void CalcularArea();

    public abstract void CalcularVolumen();
}
