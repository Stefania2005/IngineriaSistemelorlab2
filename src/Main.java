//public accessible class, defined in a file with same name.
class Main {
    private String color;

    public Main() {
        this.color = "white";
    }

    public Main(String color) {

        this.color = color;
    }

    float getArea() {
        int i = 0;
        return i;
    }

    @Override
    public String toString() {
        return "this form has the color" + color;
    }

    public String getColor() {
        return color;
    }

}