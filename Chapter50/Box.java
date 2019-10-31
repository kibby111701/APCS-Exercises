public class Box{
    
    public double length;
    public double width;
    public double height;

    public Box(double width, double height, double length){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(Box oldbox){
        this.length = oldbox.getLength();
        this.width = oldbox.getWidth();
        this.height = oldbox.getHeight();
    }


    public double getLength(){
        return this.length;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public double volume(){
        return length * width * height;
    }

    private double topArea(){
        return length * width;
    }

    private double sideArea(){
        return width * height;
    }

    private double faceArea(){
        return length * height;
    }

    public double area(){
        return 2*(faceArea() + sideArea() + topArea());
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25*oldBox.getWidth(), 1.25*oldBox.getLength(), 1.25*oldBox.getHeight());
    }

    public boolean nests(Box outsideBox){
        return (outsideBox.height > this.height) && (outsideBox.width > this.width) && (outsideBox.length > this.length);
    }


}