package cf473div2;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String[] words = in.nextLine().split("\\s+");
        String[] nums = in.nextLine().split("\\s+");
        HashMap<String, Integer> costs = new HashMap(n);
        for (int i = 0; i < n; i++) {
            costs.put(words[i], Integer.parseInt(nums[i]));
        }
        for (int i = 0; i < k; i++) {
            int count = in.nextInt();
            int minCost = Integer.MAX_VALUE;
            int[] indexes = new int[count];
            for (int j = 0; j < count; j++) {
                int current = in.nextInt()-1;
                indexes[j] = current;
                if(costs.get(words[current]) < minCost) {
                    minCost = costs.get(words[current]);
                }
            }
            for (int j = 0; j < count; j++) {
                costs.put(words[indexes[j]], minCost);
            }
        }
        in.nextLine();
        String[] message = in.nextLine().split("\\s+");
        long ans = 0;
        for (int i = 0; i < message.length; i++) {
            ans += costs.get(message[i]);
        }
        out.println(ans);
    }
}
