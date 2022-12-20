package geometria2D;

public abstract class hexagono {
    double lHex, perimetroHex, apotemaHex, areaHex;

    public hexagono(double lHex, double perimetroHex, double apotemaHex, double areaHex) {
        this.lHex = lHex;
        this.perimetroHex = perimetroHex;
        this.apotemaHex = apotemaHex;
        this.areaHex = areaHex;
    }

    public double getlHex() {
        return lHex;
    }

    public void setlHex(double lHex) {
        this.lHex = lHex;
    }

    public double getPerimetroHex() {
        return perimetroHex;
    }

    public void setPerimetroHex(double perimetroHex) {
        this.perimetroHex = perimetroHex;
    }

    public double getApotemaHex() {
        return apotemaHex;
    }

    public void setApotemaHex(double apotemaHex) {
        this.apotemaHex = apotemaHex;
    }

    public double getAreaHex() {
        return areaHex;
    }

    public void setAreaHex(double areaHex) {
        this.areaHex = areaHex;
    }

    public abstract void CalcularArea();

    public abstract void CalcularPerimetro();
}
