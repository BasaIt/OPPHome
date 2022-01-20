public class BoxWeight extends Box{
    private double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(double width, double height, double lenght, double weight){
        super(width, lenght, height);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Вес " + weight);
    }

    public BoxWeight(double size, double weight){
        super(size);
        this.weight = size;
    }
}

