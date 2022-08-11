package Map;

import heroes.Hero;

/**
 * The Map Class
 * Represents the 2D matrix that Heroes can move around on.
 *
 * @author OliveGarch
 */
public class Map {
    private Object[][] matrix;

    public Map(int size) {
        matrix = new Object[size][size];

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = null;
            }
        }
    }

    /**
     * Moves the given Hero to the given row and column
     * @param hero the Hero
     * @param row the row
     * @param col the column
     */
    public void moveHero(Hero hero, int row, int col) {
        int[] location = findHero(hero);
        matrix[row][col] = hero;
        matrix[location[0]][location[1]] = null;
    }

    /**
     * Finds the given Hero on the map and returns the location
     * @param hero the given Hero
     * @return an Array of size 2, where [0] is the row and [1] is the column,
     * null if the Hero is not found on the board.
     */
    public int[] findHero(Hero hero) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals(hero)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
