package telran.shapes;

public class Rectangle implements Shape{
    private int length;
    private int width;

    public Rectangle(int length, int wigth) {
        this.length = length;
        this.width = wigth;
    }

    @Override
    public int perimetr() {
        return (length+width)*2;
    }

    @Override
    public int square() {
        return length*width;
    }
        
}
