package regular.expression.first;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int width = 963;
		int height = 640;
		
		BufferedImage image = null;
		
		try {
			File input_file = new File("C:\\Users\\ADMIN\\Pictures\\clock.png");
			
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			image = ImageIO.read(input_file);
			
			System.out.println("Reading complete");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
	
		try {
			File output_file = new File("C:\\Users\\ADMIN\\Pictures\\clock1.png"); 
		
			ImageIO.write(image, "png", output_file);
			
			System.out.println("Writing complete."); 
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
	}

}
