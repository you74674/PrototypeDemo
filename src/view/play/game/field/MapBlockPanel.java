package view.play.game.field;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import model.game.field.MapBlock;

public class MapBlockPanel extends JPanel{
	private MapBlock mapBlock;
	private Image image;
	public MapBlockPanel(MapBlock mapBlock) {
		this.mapBlock=mapBlock;
		image=MapBlockImage.imageIcons[mapBlock.type].getImage();
	}
	public MapBlock getMapBlock() {
		return mapBlock;
	}
	public void setMapBlock(MapBlock mapBlock) {
		this.mapBlock = mapBlock;
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
		g.drawString(new String(getX()+" "+getY()), 10, 10);
	}
}
