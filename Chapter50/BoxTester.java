public class BoxTester{
    public static void main(String[] args) {
        
        Box box = new Box(2.5, 5.0, 6.0);

        Box oldBox = new Box(box);

        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        System.out.println("Area: " + oldBox.area() + " Volume: " + oldBox.volume());

    }


}