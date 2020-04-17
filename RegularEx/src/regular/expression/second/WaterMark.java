package regular.expression.second;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WaterMark extends JPanel {

	String[] typeStrings = {"Serif","SansSerif"};
	int[] styles = {Font.PLAIN,Font.ITALIC,Font.BOLD,Font.ITALIC + Font.BOLD};
	String[] stylenameStrings = {"Plain","Italic","Bold & Italic"};
	
	public void paint(Graphics g)
	{
		/*for(int f = 0;f < typeStrings.length;f++)
		{
			for(int s = 0;s < stylenameStrings.length;s++)
			{	
				Font font = new Font(typeStrings[f], styles[s], 18);
				g.setFont(font);
				String nameString = typeStrings[f] + " " + stylenameStrings[s];
				g.drawString(nameString, 20, (f*4+s+1)*20);
			}
		}*/
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\ADMIN\\Desktop\\nhom2_SonTungHieuHoangThanh\\nhasachmaphuong\\newfont\\newfontbyme.ttf")).deriveFont(18f);
			g.setFont(font);
			String nameString = "MAI THAI SON";
			g.drawString(nameString, 20, (0*4+0+1)*20);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.setContentPane(new WaterMark());
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}

}
