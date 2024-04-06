class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        /**
        dp[j]: j为长度的字符是否全部都由字典里面的字组成
        初始：dp[0] 为true其他都是false；
        公式: dp[j] && set.contains(s.substring(j, i))
        遍历：先物品再背包

        O(N^3), O(N)
         */
        Set<String> set = new HashSet<>();
        for(String str: wordDict) set.add(str);
        boolean[] dp = new boolean[s.length() + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
