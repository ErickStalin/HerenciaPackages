package geometria2D;

public abstract class pentagono {
    double lPen, perimetroPen, AreaPen, apotemaPen;

    public pentagono(double lPen, double perimetroPen, double areaPen, double apotemaPen) {
        this.lPen = lPen;
        this.perimetroPen = perimetroPen;
        this.AreaPen = areaPen;
        this.apotemaPen = apotemaPen;
    }

    public double getlPen() {
        return lPen;
    }

    public void setlPen(double lPen) {
        this.lPen = lPen;
    }

    public double getPerimetroPen() {
        return perimetroPen;
    }

    public void setPerimetroPen(double perimetroPen) {
        this.perimetroPen = perimetroPen;
    }

    public double getAreaPen() {
        return AreaPen;
    }

    public void setAreaPen(double areaPen) {
        AreaPen = areaPen;
    }

    public double getApotemaPen() {
        return apotemaPen;
    }

    public void setApotemaPen(double apotemaPen) {
        this.apotemaPen = apotemaPen;
    }

    public abstract void CalcularArea();

    public abstract void CalcularPerimetro();
}
