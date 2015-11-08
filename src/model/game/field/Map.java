package model.game.field;


import java.util.Random;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

import model.game.Coord;

public class Map {
	private Coord size;
	private MapBlock mapBlocks[][];
	
	
	public Map(){
		size=new Coord(50,20);
		//load data
		mapBlocks=new MapBlock[size.height][size.width];
		for(int y=0; y<size.height; y++)
			for(int x=0; x<size.width; x++)
				mapBlocks[y][x]=new MapBlock(new Random().nextInt(5));//random
			
	}
	//not used yet
//	public Map(String fileName){
//		try {
//			Scanner scanner=new Scanner(new File(fileName));
//			size.width=scanner.nextInt();
//			size.height=scanner.nextInt();
//			mapBlocks=new MapBlock[size.height][size.width];
//			for(int y=0; y<size.height; y++)
//				for(int x=0; x<size.width; x++)
//					mapBlocks[y][x]=new MapBlock(scanner.nextInt());
//			scanner.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public Coord getSize() {
		return size;
	}
	public void setSize(Coord size) {
		this.size = size;
	}
	public MapBlock getMapBlock(int x, int y) {
		return mapBlocks[y][x];
	}
}
