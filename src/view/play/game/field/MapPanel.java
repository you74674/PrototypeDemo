package view.play.game.field;

//import java.awt.Color;
import java.awt.GridLayout;

//import javax.swing.BorderFactory;
import javax.swing.JPanel;

import model.game.Coord;
import model.game.field.Map;

public class MapPanel extends JPanel{
	private Map map;
	private MapBlockPanel mapBlockPanels[][];
	private Coord blockSize=new Coord(100, 100);
	
	
	public MapPanel() {
		map=new Map();
		
		setSize(new Coord(blockSize.width*map.getSize().width, blockSize.height*map.getSize().height));
		setLayout(new GridLayout(map.getSize().height, map.getSize().width));
		
		mapBlockPanels=new MapBlockPanel[map.getSize().height][map.getSize().width];
		loadData();
		setComponents();
	}
	private void loadData(){
		for(int y=0; y<map.getSize().height; y++)
			for(int x=0; x<map.getSize().width; x++)
				mapBlockPanels[y][x]=new MapBlockPanel(map.getMapBlock(x, y));
	}
	private void setComponents(){
		for(MapBlockPanel[] mapChipPanelsy: mapBlockPanels)
			for(MapBlockPanel mapBlockPanel: mapChipPanelsy)
				add(mapBlockPanel);		
	}
	//read the map data and draw


	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}


}
