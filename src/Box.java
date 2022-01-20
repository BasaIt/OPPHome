public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size){
        width = size;
        height = size;
        length = size;
    }

    public Box() {

    }

    void ShowValue() {
        double value = width * height * length;
        System.out.println(value);
    }
     double value(){
        return width * height  * length;
     }

     public void ShowInfo(){
         System.out.println("Ширина "+ width);
         System.out.println("Высота "+ height);
         System.out.println("Длина "+ length);
     }
}
