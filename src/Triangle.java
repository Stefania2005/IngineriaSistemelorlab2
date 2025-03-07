class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        super();
        this.height = 1;
        this.base = 1;
    }
    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangle other = (Triangle) obj;
        return this.base == other.base &&
                this.height == other.height &&
                this.getColor().equals(other.getColor());
    }
}


