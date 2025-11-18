package iscteiul.ista.battleship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    void testGetDirection() {
        assertEquals('n', Compass.NORTH.getDirection());
        assertEquals('s', Compass.SOUTH.getDirection());
        assertEquals('e', Compass.EAST.getDirection());
        assertEquals('o', Compass.WEST.getDirection());
        assertEquals('u', Compass.UNKNOWN.getDirection());
    }

    @Test
    void testToString() {
        assertEquals("n", Compass.NORTH.toString());
        assertEquals("s", Compass.SOUTH.toString());
    }

    @Test
    void testCharToCompassValid() {
        assertEquals(Compass.NORTH, Compass.charToCompass('n'));
        assertEquals(Compass.SOUTH, Compass.charToCompass('s'));
        assertEquals(Compass.EAST, Compass.charToCompass('e'));
        assertEquals(Compass.WEST, Compass.charToCompass('o'));
    }

    @Test
    void testCharToCompassInvalid() {
        assertEquals(Compass.UNKNOWN, Compass.charToCompass('x'));
        assertEquals(Compass.UNKNOWN, Compass.charToCompass(' '));
    }
}