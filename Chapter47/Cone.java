public class Cone{
    
    private double radius;
    private double height;

    public Cone(double radius, double height){
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
        return (Math.PI*radius)*(radius+Math.sqrt((height*height) + (radius*radius)));
    }

    public double findVolume(){
        return Math.PI * radius * radius * (height/3);
    }

    public double slantHeight(){
        return Math.sqrt((radius*radius) + (height*height));
    }

    public double angle(){
        return Math.atan(radius/height);
    }
    
    public String toString(){
        return "Area: " + findArea() + " Volume: " + findVolume() + " Slant height: " + slantHeight() + " Apex angle: " + angle();
    }


}