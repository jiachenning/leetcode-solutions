package rocks.ninjachen.leet_code_contest.bi_11;

/**
 * https://leetcode.com/contest/biweekly-contest-11/problems/toss-strange-coins/
 */
public class TossStrangeCoins {
    public double probabilityOfHeads(double[] prob, int target) {
        double[] dp = new double[target + 1];
        dp[0] = 1.0;
        for (int i = 0; i < prob.length; i++) {
            for (int k = Math.min(i + 1, target); k >= 0; k--) {
                dp[k] = (k > 0 ? dp[k-1] : 0) * prob[i] + dp[k] * (1- prob[i]);
            }
        }
        return dp[target];
    }
}
