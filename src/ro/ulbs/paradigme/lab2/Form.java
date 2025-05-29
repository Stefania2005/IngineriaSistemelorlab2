package ro.ulbs.paradigme.lab2;

public class Form {
    private String color;
    private static int counter=0;

    public Form() {
        color = "white";
        if (this.getClass() == Form.class) {
            counter++;
        }
    }

    public Form(String c){
        color=c;
        if(this.getClass() == Form.class) {
            counter++;
        }

    }

    public float getArea() {
        return 0;
    }

    public String toString(){
        return "This form has the color" +color;
    }

    public String getColor() {
        return color;
    }

    public static int getCounter() {
        return counter;
    }
}
