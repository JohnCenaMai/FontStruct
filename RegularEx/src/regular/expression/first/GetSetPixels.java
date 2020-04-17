package regular.expression.first;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GetSetPixels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedImage img = null;
		File file = null;
		try {
			file = new File("C:\\Users\\ADMIN\\Pictures\\clock.png");
			img = ImageIO.read(file);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e); 
		}
		
		int width = img.getWidth();
		int height = img.getHeight();
		
		int p = img.getRGB(0, 0);
		int a = (p>>24)&0xff;
		
		int r = (p>>16)&0xff;
		
		int g = (p>>8)&0xff;
		
		int b = p&0xff;
		
		a = 255; 
        r = 100; 
        g = 150; 
        b = 200; 
        
        p = (a<<24) | (r<<16) | (g<<8) | b;
        img.setRGB(0, 0, p);
        try {
			file = new File("C:\\Users\\ADMIN\\Pictures\\clock1.png");
			ImageIO.write(img, "png", file);
			System.out.println("thanh cong");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e); 
		}
		
	}

}
