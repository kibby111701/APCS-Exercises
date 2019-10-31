public class BoxTester{
    public static void main(String[] args) {
        
        Box box = new Box(2.5, 5.0, 6.0);

        Box oldBox = new Box(box);

        Box biggerBox = oldBox.biggerBox(oldBox);

        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        System.out.println("Area: " + oldBox.area() + " Volume: " + oldBox.volume());

        System.out.println("Area: " + biggerBox.area() + "Volume: " + biggerBox.volume());

        System.out.println(box.nests(biggerBox));

        System.out.println(biggerBox.nests(box));



    }


}