package telran.shapes.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import telran.shapes.Shape;
import telran.shapes.Square;

public class SquareTest {
    
    @Test
    void squarePerimetrTest() {
        Shape square = new Square(3);
        assertEquals(12, square.perimetr());
    }

    @Test
    void squareSquareTest() {
        Shape square = new Square(3);
        assertEquals(9, square.square());
    }

}
