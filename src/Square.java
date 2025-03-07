public class Square extends Form{
   private float side;

    public Square(){
        super();
        this.side = 1;
    }

    public Square(float side,String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    public String toString() {
        return super.toString() + ", it's a square with side " + side;
    }
}
