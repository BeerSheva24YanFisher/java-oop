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
    
}
