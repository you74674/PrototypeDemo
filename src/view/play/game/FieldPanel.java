package view.play.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import model.game.field.Field;
import view.Config;
import view.MainFrame;
import view.play.game.field.MapPanel;

public class FieldPanel extends JPanel implements KeyListener{
	private Field field;
	
	private MapPanel mapPanel;

	public FieldPanel(MainFrame parent){
		setFocusable(true);
		setLayout(null);
		mapPanel=new MapPanel();
		mapPanel.setLocation(Config.defaultLocation.width+Config.frameDimension.width/2, 
				Config.defaultLocation.height+Config.frameDimension.height/2);
		add(mapPanel);
		addKeyListener(this);

	}
	public void setField(Field field) {
		this.field=field;
	}
	public Field getField(){
		return field;
	}

	private int moveUnit=25;
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			mapPanel.setLocation(mapPanel.getX(), mapPanel.getY()+moveUnit);
			break;
		case KeyEvent.VK_DOWN:
			mapPanel.setLocation(mapPanel.getX(), mapPanel.getY()-moveUnit);
			break;
		case KeyEvent.VK_RIGHT:
			mapPanel.setLocation(mapPanel.getX()-moveUnit, mapPanel.getY());
			break;
		case KeyEvent.VK_LEFT:
			mapPanel.setLocation(mapPanel.getX()+moveUnit, mapPanel.getY());
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
}