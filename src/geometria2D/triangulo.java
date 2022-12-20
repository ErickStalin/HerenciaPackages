package geometria2D;

public abstract class triangulo {
    double lTri, lTri2, baseTri, alturaTri, areaTri, periTri;

    public triangulo(double lTri, double lTri2, double baseTri, double alturaTri, double areaTri, double periTri) {
        this.lTri = lTri;
        this.lTri2 = lTri2;
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
        this.areaTri = areaTri;
        this.periTri = periTri;
    }

    public double getlTri() {
        return lTri;
    }

    public void setlTri(double lTri) {
        this.lTri = lTri;
    }

    public double getBaseTri() {
        return baseTri;
    }

    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }

    public double getlTri2() {
        return lTri2;
    }

    public void setlTri2(double lTri2) {
        this.lTri2 = lTri2;
    }

    public double getAreaTri() {
        return areaTri;
    }

    public void setAreaTri(double areaTri) {
        this.areaTri = areaTri;
    }

    public double getPeriTri() {
        return periTri;
    }

    public void setPeriTri(double periTri) {
        this.periTri = periTri;
    }

    public abstract void CalcularArea();

    public abstract void CalcularPerimetro();
}
