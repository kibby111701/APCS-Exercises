public class Cylinder {
    
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getHeight(){
        return this.height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double findArea(){
        return (2*Math.PI*radius)*(radius + height);
    }

    public double findVolume(){
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        return "Area: " + findArea() + " Volume: " + findVolume();
    }
}