public abstract class Figura {
    private double mSadeA;
    private double mSadeB;

    public Figura(double mSadeA, double mSadeB){
        this.mSadeA = mSadeA;
        this.mSadeB = mSadeB;
    }


    public abstract double FiguraArea();

    public double getmSadeA() {
        return mSadeA;
    }

    public double getmSadeB() {
        return mSadeB;
    }
}
