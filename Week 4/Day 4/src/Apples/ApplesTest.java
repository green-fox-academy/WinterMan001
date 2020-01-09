package Apples;

import Apples.Apples;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    Apples apple = new Apples("apple");

    @Test
    public void getAppleTest() {
        assertEquals("apple", apple.getApple());
    }
}