package Entity;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetPlayerImage() {
		//fail("Not yet implemented");
		try {
			BufferedImage droit = ImageIO.read(getClass().getResourceAsStream("/player/droit.png"));
			BufferedImage up = ImageIO.read(getClass().getResourceAsStream("/player/up.png"));
			BufferedImage down1 = ImageIO.read(getClass().getResourceAsStream("/player/down1.png"));
			BufferedImage down2 = ImageIO.read(getClass().getResourceAsStream("/player/down2.png"));
			BufferedImage left1 = ImageIO.read(getClass().getResourceAsStream("/player/left1.png"));
			BufferedImage left2 = ImageIO.read(getClass().getResourceAsStream("/player/left2.png"));
			BufferedImage right1 = ImageIO.read(getClass().getResourceAsStream("/player/right1.png"));
			BufferedImage right2 = ImageIO.read(getClass().getResourceAsStream("/player/right2.png"));
			
			
		}
		catch(IOException e) {
			e.printStackTrace();		}
	}

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
	}

	@Test
	void testPickUpObject() {
		//fail("Not yet implemented");
	}

	@Test
	void testDraw() {
		//fail("Not yet implemented");
		
	}

}
