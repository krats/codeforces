package cf473div2;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        if(n % 2 == 0) {
            out.println("Mahmoud");
        } else {
            out.println("Ehab");
        }
    }
}
