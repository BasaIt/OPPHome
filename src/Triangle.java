public class Triangle extends Figura {

    private double mScadeC;

    public Triangle(double mSadeA, double mSadeB, double mScadeC) {
        super(mSadeA, mSadeB);
        this.mScadeC = mScadeC;
    }

    public Triangle(double size){
        super(size, size);
        this.mScadeC = size;
    }

    @Override
    public double FiguraArea() {
        double P = (getmSadeA() + getmSadeB() + mScadeC) / 2;
        double S = P * (P - getmSadeA()) * (P - getmSadeB()) * (P - mScadeC);
        return Math.sqrt(S);
    }
}
