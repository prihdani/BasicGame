public class BasicGame {
    public static void main(String[] args) {
        String[][] map = new String[10][10];
        String player = " 7 ";
        int row = 1;
        int col = 1;
        Directions direction = Directions.RIGHT;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length ; j++) {
                map[i][j] = " 0 ";
            }
        }

        for (int t = 0; t < 2; t++) {
            switch (direction) {
                case UP:
                    row--;
                    break;
                case DOWN:
                    row++;
                    break;
                case LEFT:
                    col--;
                    break;
                case RIGHT:
                    col++;
                    break;
            }


            //palya kiiratasa
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (i == row && j == col) {
                        System.out.print(player);
                    } else {
                        System.out.print(map[i][j]);
                    }
                }
                System.out.println();
            }
        }

    }
}