package regular.expression.first;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grayscale {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedImage img = null;
		File file = null;
		
		try {
			file = new File("C:\\Users\\ADMIN\\Desktop\\nhom2_SonTungHieuHoangThanh\\nhasachmaphuong\\image\\anhnendep\\500638.jpg");
			
			img = ImageIO.read(file);
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		int width = img.getWidth();
		int height = img.getHeight();
		
		//System.out.println(width + " " + height);
		
		for(int y = 0;y < height;y++)
		{
			for(int x = 0;x < width;x++)
			{
				int p = img.getRGB(x, y);
				int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
                int g = (p>>8)&0xff; 
                int b = p&0xff;          
                int avg = (r+g+b)/3;
                p = (a<<24) | (avg<<16) | (avg<<8) | avg; 
                img.setRGB(x, y, p);
			}
		}
		
		try {
			file = new File("C:\\Users\\ADMIN\\Desktop\\nhom2_SonTungHieuHoangThanh\\nhasachmaphuong\\image\\anhnendep\\500639.jpg");
			ImageIO.write(img,"jpg",file);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
