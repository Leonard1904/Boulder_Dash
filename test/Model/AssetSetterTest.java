package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import View.ViewPanel;

public class AssetSetterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private ViewPanel vp;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAssetSetter() {
		//fail("Not yet implemented");
		this.setVp(vp);
	}

	@Test
	void testSetObject() {
		//fail("Not yet implemented");
	}

	public ViewPanel getVp() {
		return vp;
	}

	public void setVp(ViewPanel vp) {
		this.vp = vp;
	}

}
