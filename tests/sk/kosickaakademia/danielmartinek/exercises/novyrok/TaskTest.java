package sk.kosickaakademia.danielmartinek.exercises.novyrok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {


    @Test
    void suc() {
        Task task = new Task();
        assertEquals(0, task.suc(0,0));
        assertEquals(0, task.suc(5,-5));
        assertEquals(0, task.suc(-1234,+1234));
        assertEquals(46, task.suc(12,34));
        assertEquals(499100, task.suc(-900,500000));
    }


    @Test
    void isPrimeNumber() {
        Task task = new Task();
        assertTrue(task.isPrimeNumber(7));
        assertTrue(task.isPrimeNumber(97));
        assertTrue(task.isPrimeNumber(23));
    }

    /*
    @Test
    void isRectangularly() {
        Task task = new Task();
        assertTrue(task.isRectangularly(3,4,5));
     //   assertTrue(task.isRectangularly(4,5,3));
      //  assertTrue(task.isRectangularly(5,4,3));
        assertTrue(task.isRectangularly(5,12,13));
        assertTrue(task.isRectangularly(20,48,52));
        assertTrue(task.isRectangularly(12,20,16));

        assertFalse(task.isRectangularly(0,0,0));
        assertFalse(task.isRectangularly(4,5,6));
        assertFalse(task.isRectangularly(-4,-3,-5));
    }

     */


    @Test
    void reversed() {
        Task task = new Task();
        assertEquals("jelenovipivonelej", task.reversed("jelenovipivonelej"));
        assertEquals("54321", task.reversed("12345"));
    }


    @Test
    void isBinary() {
        Task task = new Task();
        assertTrue(task.isBinary("01101010"));
        assertTrue(task.isBinary("0110101111111111111111111000000000000000010101010000010"));

        assertFalse(task.isBinary("0 11"));
        assertFalse(task.isBinary("012311111001"));
    }

    @Test
    void vowelConter() {
        Task task = new Task();
        assertEquals(3,task.vowelConter("Lalala"));
        assertEquals(5,task.vowelConter("Dneska Bolo VeĽmmm krsn."));
    }

    @Test
    void pocetMedzier() {
        Task task = new Task();
        assertEquals(3,task.pocetMedzier("DNES Je SKVELY DEN"));
    }
}