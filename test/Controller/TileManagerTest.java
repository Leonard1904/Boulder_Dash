package Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import View.ViewPanel;

public class TileManagerTest {

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
	void testTileManager() {
		//fail("Not yet implemented");
	}

	@Test
	void testLoadmap() {
		//fail("Not yet implemented");
		try {
			String filePath = null;
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));		
			
			
			
			int col = 0;
			int row = 0;
			
			
			ViewPanel vp = null;
			while (col < vp.maxMapCol && row < vp.maxMapRow) {
				String line = br.readLine();
				
				while(col < vp.maxMapCol) {
					
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					int[][] mapTileNum = null;
					mapTileNum[col][row] = num;
					col++;
				}
				if (col == vp.maxMapCol) {
					col = 0;
					row++;
				}
			}
			
			br.close();
		}catch(Exception e) {
					
				}
	}

	@Test
	void testLoadmap2() {
		//fail("Not yet implemented");
		try {
			String filePath = null;
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			int col = 0;
			int row = 0;
			ViewPanel vp = null;
			while (col < vp.maxMapCol && row < vp.maxMapRow) {
				String line = br.readLine();

				while(col < vp.maxMapCol) {

					String numbers[] = line.split(" ");

					int num = Integer.parseInt(numbers[col]);

					int[][] mapTileNum = null;
					mapTileNum[col][row] = num;
					col++;
				}
				if (col == vp.maxMapCol) {
					col = 0;
					row++;
				}
			}
			br.close();
		}catch(Exception e) {

		}

	}

	@Test
	void testDraw() {
		//fail("Not yet implemented");
	}

}
