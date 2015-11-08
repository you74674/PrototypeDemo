package model.game.field;

import model.game.Coord;

public class Field {
	private Map map;
	private Character characters[];
	public Field(){
	}
	public Coord getSize() {
		return getMap().getSize();
	}
//	public MapChip getMapChip(int x, int y) {
//		return map.getMapChip(x, y);
//	}
	public Character[] getCharacters() {
		return characters;
	}
	public void setCharacters(Character characters[]) {
		this.characters = characters;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}

	
	
}
