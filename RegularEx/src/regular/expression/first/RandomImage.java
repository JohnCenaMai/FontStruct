package regular.expression.first;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RandomImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int width = 640;
		int height = 320;
		
		BufferedImage img = null;
		
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		File file = null;
		
		for(int y = 0;y < height;y++)
		{
			for(int x = 0;x < width;x++)
			{
				int a = (int)(Math.random()*256); //generating 
                int r = (int)(Math.random()*256); //values 
                int g = (int)(Math.random()*256); //less than 
                int b = (int)(Math.random()*256); //256 
  
                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
  
                img.setRGB(x, y, p); 
			}
		}
		// write image 
        try
        { 
            file = new File("C:\\Users\\ADMIN\\Desktop\\nhom2_SonTungHieuHoangThanh\\nhasachmaphuong\\image\\anhnendep\\Anh.jpg"); 
            ImageIO.write(img, "jpg", file); 
            System.out.println("thanh cong");
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
	}

}
