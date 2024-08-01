package telran.shapes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Shape;
import telran.shapes.Square;

public class CanvasTest {
    private Shape rectangle = new Rectangle(4, 5);
    private Shape square = new Square(3);
    private Canvas canvas = new Canvas();

    @Test
    void addShapeTest() {
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(2, canvas.shapes.length);
        assertTrue(canvas.shapes[0] instanceof Rectangle);
        assertTrue(canvas.shapes[1] instanceof Square);
    }

    @Test
    void perimetrTest() {
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(30,canvas.perimetr());

        canvas.addShape(square);
        assertEquals(42,canvas.perimetr());
    }

    @Test
    void squareTest() {
        canvas.addShape(rectangle);
        canvas.addShape(square);
        assertEquals(29,canvas.square());

        canvas.addShape(rectangle);
        assertEquals(49,canvas.square());
    }
    
}
