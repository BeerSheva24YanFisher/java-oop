package telran.shapes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import telran.shapes.Rectangle;
import telran.shapes.Shape;

public class RectangleTest {
    private Shape rectangle = new Rectangle(4, 5);
    @Test
    void testRectanglePerimetr() {
        assertEquals(18, rectangle.perimetr());
    }

    @Test
    void testRectangleSquare() {
        assertEquals(20, rectangle.square());
    }

}
