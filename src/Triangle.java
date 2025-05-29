package ro.ulbs.paradigme.lab2.api;

public class Triangle extends Form{
    private float height, base;

    public Triangle (){
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base,String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea(){
        return (height * base)/2;
    }

    @Override
    public String toString(){
        return super.toString() + "\nHeight: " + height + "\nBase: " + base;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Triangle t){
            return this.base==t.base && this.height==t.height && t.getColor().equals(this.getColor());
        }
        return false;
    }


}