
public class run {
    public static void main(String[] args) {
        int[][] board_size = new int[3][3];
        board_size[0][0] = 1;
        board_size[0][1] = 1;
        board_size[0][2] = 1;
        board_size[1][0] = 1;
        board_size[1][1] = 0;
        board_size[1][2] = 0;
        board_size[2][0] = 1;
        board_size[2][1] = 1;
        board_size[2][2] = 0;

        Game solution = new Game();
        System.out.print("Original Generation: ");
        for (int[] ints : board_size) {
            for (int j = 0; j < board_size.length; j++) {
                System.out.print(ints[j]);
            }
        }

        for(int g=0; g<Integer.parseInt(args[0]); g++) {
            solution.gameOfLife(board_size);
            System.out.println(" ");
            System.out.print("Next Generation is:  ");
            for (int[] ints : board_size) {
                for (int j = 0; j < board_size.length; j++) {
                    System.out.print(ints[j]);
                }
            }
        }
    }
}