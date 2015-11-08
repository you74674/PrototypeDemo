package view;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;

import view.play.game.FieldPanel;

public class MainFrame extends JFrame{
	
	public MainFrame(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(new FieldPanel(this));
		
		pack();
		Insets insets = getInsets();
		setSize(new Dimension(insets.left + insets.right + (int)(Config.frameDimension.getWidth()), 
				insets.top + insets.bottom + (int)(Config.frameDimension.getHeight())));

		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args){
		new MainFrame();
	}
}
