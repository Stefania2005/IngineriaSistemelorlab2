import java.awt.*;

 class Circle extends Form {
    private float radius;

    public Circle(){
        this.radius = 1;
    }
    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + ", it's a circle with radius " + radius;
    }
}
