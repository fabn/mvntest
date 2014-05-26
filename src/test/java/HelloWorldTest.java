import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testPrintHelloWorld() throws Exception {
        System.setOut(new PrintStream(outContent));
        helloWorld.printHelloWorld();
        assertEquals("Hello world!\n", outContent.toString());
    }
}