package ro.ulbs.paradigme.lab2.api;

public class Circle extends Form{
    private float radius;

    public Circle(){
        super();
        this.radius = 0;
    }
    public Circle(float radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea(){
        return (float) (radius * Math.PI);
    }
}