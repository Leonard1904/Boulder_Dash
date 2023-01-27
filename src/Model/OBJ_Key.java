package Model;

import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author KAMDEM KAMDEM JOSEPH LEONARD
 *
 */

public class OBJ_Key extends SuperObject{
	
	public OBJ_Key() {
		
		name = "key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/player/DI2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
