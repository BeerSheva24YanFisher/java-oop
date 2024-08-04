package telran.shapes;

import telran.util.Arrays;

public class Canvas implements Shape{
    public Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape){
        if (shape != null) {
            shapes = Arrays.insert(shapes, shapes.length, shape);
        }
    };

    @Override
    public int perimetr() {
        int totalPerimetr = 0;
        for (Shape shape : shapes) {
            totalPerimetr += shape.perimetr();
        }
        return totalPerimetr;
    }

    @Override
    public int square() {
        int totalSquare = 0;
        for (Shape shape : shapes) {
            totalSquare += shape.square();
        }
        return totalSquare;
    }

    public int count() {
        int count = 0;
        for (Shape shape : shapes) {
            count++;
            if (shape instanceof Canvas canvas) {
                count += canvas.count();
            }
        }
        return count;
    }

}
