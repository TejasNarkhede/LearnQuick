import java.util.HashSet;
import java.util.Scanner;

public class TicTacToe {

    static HashSet<Integer> ur_set = new HashSet<Integer>();
    static HashSet<Integer> comp_set = new HashSet<Integer>();

    public static void main(String[] args) {
        char[][] g_board = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' }
        };

        print_board(g_board);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your placement (1-9): ");
            int user_pos = sc.nextInt();
            while (ur_set.contains(user_pos) || comp_set.contains(user_pos)) {
                System.out.println();
                System.out.println("Position taken! Enter a correct position");
                user_pos = sc.nextInt();
            }
            p_holder(g_board, user_pos, "You");
            String res = check_winnner();
            if (res.length() > 0) {
                System.out.println(res);
                break;
            }

            int cpu_pos = get_random();
            while (ur_set.contains(cpu_pos) || comp_set.contains(cpu_pos)) {
                // System.out.println();
                // System.out.println("Position taken! Enter a correct position");
                cpu_pos = get_random();
            }
            p_holder(g_board, cpu_pos, "Comp");
            res = check_winnner();
            if (res.length() > 0) {
                System.out.println(res);
                break;
            }
        }

    }

    static String check_winnner() {
        HashSet<Integer> r1 = new HashSet<Integer>();
        r1.add(1);
        r1.add(2);
        r1.add(3);
        HashSet<Integer> r2 = new HashSet<Integer>();
        r2.add(4);
        r2.add(5);
        r2.add(6);
        HashSet<Integer> r3 = new HashSet<Integer>();
        r3.add(7);
        r3.add(8);
        r3.add(9);
        HashSet<Integer> c1 = new HashSet<Integer>();
        c1.add(1);
        c1.add(4);
        c1.add(7);
        HashSet<Integer> c2 = new HashSet<Integer>();
        c2.add(2);
        c2.add(5);
        c2.add(8);
        HashSet<Integer> c3 = new HashSet<Integer>();
        c3.add(3);
        c3.add(6);
        c3.add(9);
        HashSet<Integer> d1 = new HashSet<Integer>();
        d1.add(1);
        d1.add(5);
        d1.add(9);
        HashSet<Integer> d2 = new HashSet<Integer>();
        d2.add(3);
        d2.add(5);
        d2.add(7);

        HashSet<HashSet> set = new HashSet<HashSet>();
        set.add(r1);
        set.add(r2);
        set.add(r3);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(d1);
        set.add(d2);

        for (HashSet<Integer> s : set) {
            if (ur_set.containsAll(s)) {
                return "Congratulations! You won!";
            } else if (comp_set.containsAll(s)) {
                return "Computer wins! Better luck next time!";
            }

            if (ur_set.size() + comp_set.size() == 9) {
                return "It's a tie!";
            }
        }
        return "";

    }

    static int get_random() {
        return (int) (Math.random() * 9) + 1;
    }

    static void print_board(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]);
            }
            System.out.println();
        }
    }

    static void p_holder(char[][] g_board, int pos, String user) {
        char syb = 'X';
        if (user.equals("You")) {
            syb = 'X';
            ur_set.add(pos);
        } else if (user.equals("Comp")) {
            syb = 'O';
            comp_set.add(pos);
        }

        switch (pos) {
            case 1:
                g_board[0][0] = syb;
                break;
            case 2:
                g_board[0][2] = syb;
                break;
            case 3:
                g_board[0][4] = syb;
                break;
            case 4:
                g_board[2][0] = syb;
                break;
            case 5:
                g_board[2][2] = syb;
                break;
            case 6:
                g_board[0][4] = syb;
                break;
            case 7:
                g_board[4][0] = syb;
                break;
            case 8:
                g_board[4][2] = syb;
                break;
            case 9:
                g_board[4][4] = syb;
                break;

            default:
                System.out.println("Invalid position");
        }

        print_board(g_board);
    }

}
