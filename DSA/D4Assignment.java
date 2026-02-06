3. Fibonacci Using Dynamic Programming

class FibonacciDP {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("Fibonacci of " + n + " = " + dp[n]);
    }
}

0/1 Knapsack Problem
class Knapsack01 {
    public static void main(String[] args) {
        int[] wt = {2, 3, 4, 5};
        int[] val = {3, 4, 5, 6};
        int W = 5;
        int n = wt.length;

        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        val[i - 1] + dp[i - 1][w - wt[i - 1]],
                        dp[i - 1][w]
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Maximum value = " + dp[n][W]);
    }
}

Longest Common Subsequence (LCS)
class LCS {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("LCS length = " + dp[m][n]);
    }
}

Coin change(Minimum coins) 
import java.util.Arrays;

class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        System.out.println(dp[amount] > amount ? -1 : dp[amount]);
    }
}

Rod cutting problem
class RodCutting {
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], price[j] + dp[i - j - 1]);
            }
        }

        System.out.println("Maximum profit = " + dp[n]);
    }
}

Activity Selection Problem
import java.util.*;

class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int n = start.length;
        int i = 0;
        System.out.print("Activities: " + i);

        for (int j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                System.out.print(" " + j);
                i = j;
            }
        }
    }
}

Fractional Knapsack
import java.util.*;

class FractionalKnapsack {
    static class Item {
        int value, weight;
        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int W = 50;

        Arrays.sort(items, (a, b) ->
            (b.value * a.weight) - (a.value * b.weight));

        double total = 0.0;

        for (Item item : items) {
            if (W >= item.weight) {
                W -= item.weight;
                total += item.value;
            } else {
                total += item.value * ((double) W / item.weight);
                break;
            }
        }

        System.out.println("Maximum value = " + total);
    }
}

Prim’s Algorithm (MST)
class Prims {
    private static final int V = 5;

    int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, index = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                index = v;
            }
        }
        return index;
    }

    void primMST(int[][] graph) {
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        for (int i = 0; i < V; i++)
            key[i] = Integer.MAX_VALUE;

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        new Prims().primMST(graph);
    }
}

Job Scheduling with Deadlines
import java.util.*;

class JobScheduling {
    static class Job {
        int id, deadline, profit;
        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 3;
        int[] slot = new int[maxDeadline];
        Arrays.fill(slot, -1);

        int profit = 0;

        for (Job job : jobs) {
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    profit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Total profit = " + profit);
    }
}
