import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel.ricart on 01/08/2017.
 */
public class ConceptualTumbleweedTest {
    private ConceptualTumbleweed tumbleweed;

    @Before
    public void setUp() throws Exception {
        tumbleweed = new ConceptualTumbleweed();
        tumbleweed.setup();
    }

    @After
    public void tearDown() throws Exception {
        tumbleweed.dispose();
    }

    @Test
    public void setup() throws Exception {

    }

    @Test
    public void settings() throws Exception {
        //tumbleweed.setup();
        //tumbleweed.settings();
        assertEquals("Height do not match", 200, tumbleweed.displayHeight);
        assertEquals("Width do not match", 301, tumbleweed.displayWidth);
    }

    @Test
    public void draw() throws Exception {

    }

    @Test
    public void main() throws Exception {

    }

}