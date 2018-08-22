package algorithm;

import java.util.*;

/*
贪心算法
You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
You have 3 cookies and their sizes are big enough to gratify all of the children,
You need to output 2.
每个孩子都有一个满足度，每个饼干都有一个大小，
只有饼干的大小大于等于一个孩子的满足度，该孩子才会获得满足。求解最多可以获得满足的孩子数量。
 */
public class tanxin {
    public static void main(String args[]){
        int[] a = {1,2};
        int[] b = {1,2,3};
        solution s = new solution();
        System.out.println(s.findContentChildren(a,b));
    }
}

class solution{
    public solution(){}
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
}
