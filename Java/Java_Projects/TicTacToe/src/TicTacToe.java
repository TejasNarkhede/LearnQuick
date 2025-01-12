import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

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
                System.out.println("Position taken! Enter a correct position");
                user_pos = sc.nextInt();
            }
            p_holder(g_board, user_pos, "You");
            String res = check_winner();
            if (res.length() > 0) {
                print_board(g_board);
                System.out.println(res);
                break;
            }

            int cpu_pos = get_random();
            while (ur_set.contains(cpu_pos) || comp_set.contains(cpu_pos)) {
                cpu_pos = get_random();
            }
            p_holder(g_board, cpu_pos, "Comp");
            res = check_winner();
            if (res.length() > 0) {
                print_board(g_board);
                System.out.println(res);
                break;
            }

            print_board(g_board);
        }

        sc.close();
    }

    static void print_board(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void p_holder(char[][] board, int pos, String user) {
        char symbol = 'X';
        if (user.equals("Comp")) {
            symbol = 'O';
            comp_set.add(pos);
        } else {
            ur_set.add(pos);
        }

        switch (pos) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    static int get_random() {
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    static String check_winner() {
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

        for (HashSet c : set) {
            if (ur_set.containsAll(c)) {
                return "Congratulations! You won!";
            } else if (comp_set.containsAll(c)) {
                return "Computer wins! Sorry :(";
            }
        }

        if (ur_set.size() + comp_set.size() == 9) {
            return "It's a draw!";
        }

        return "";
    }
}
