public class Rect extends Figura {

    public Rect(double mSadeA, double mSadeB) {
        super(mSadeA, mSadeB);
    }

    public Rect(double size){
        super(size, size);
    }

    @Override
    public double FiguraArea() {
        return getmSadeA() * getmSadeB();
    }
}
