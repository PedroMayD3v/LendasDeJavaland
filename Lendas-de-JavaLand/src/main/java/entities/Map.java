package entities;

import entities.Quest;

public class Map {

    private final char EMPTY = '.';
    private final char WALL = '#';
    private final char PLAYER = 'P';
    private final char ENEMY = 'E';
    private Quest quest;

    private char[][] map;

    
    public Map() {
		super();
		this.map =  this.map = new char[][]{
       	 {'#', '#', '#', '#', '#', '#', '#', '#', '#', '0'},
         {'#', '.', '.', '.', '.', '.', '.', '.', '.', '9'},
         {'#', '.', 'P', '.', '.', '?', '.', '.', '.', '8'},
         {'#', '.', '.', '.', '.', '?', '.', '.', '.', '7'},
         {'#', '.', '.', '.', '.', '?', '.', '.', '.', '6'},
         {'#', '.', '.', '.', '.', '?', '.', '.', '.', '5'},
         {'#', '.', '.', '.', '.', '?', '.', '.', '.', '4'},
         {'#', '.', '.', '.', '.', '.', '.', '.', '.', '3'},
         {'#', '.', '.', '.', '.', '.', '.', '.', '.', '2'},
         {'#', '#', '#', '#', '#', '#', '#', '#', '#', '1'}
    };
	}


    public char[][] getMap() {
        return map;
    }

    public void printFirstMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
