package telran.shapes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Shape;
import telran.shapes.Square;

public class CanvasTest {

    @Test
    void perimetrTest() {
        Canvas canvas = new Canvas();
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(3);
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(30,canvas.perimetr());

        canvas.addShape(square);
        assertEquals(42,canvas.perimetr());
    }

    @Test
    void squareTest() {
        Canvas canvas = new Canvas();
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(3);
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(29,canvas.square());

        canvas.addShape(rectangle);
        assertEquals(49,canvas.square());
    }

    @Test
    void countTest() {
        Canvas canvas1 = new Canvas();
        Canvas canvas2 = new Canvas();
        Shape shape1 = new Rectangle(3, 4);
        Shape shape2 = new Square(4);
        canvas1.addShape(shape1);
        canvas2.addShape(shape2);
        canvas1.addShape(canvas2);
        assertEquals(3, canvas1.count());
    }
    
}
