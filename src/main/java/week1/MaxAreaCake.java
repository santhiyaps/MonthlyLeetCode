package week1;

import java.util.Arrays;

public class MaxAreaCake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int n=horizontalCuts.length;
        int m=verticalCuts.length;
        long maxHeight=Math.max(horizontalCuts[0],h-horizontalCuts[n-1]);
        for(int i=1;i<horizontalCuts.length;i++){
            maxHeight=Math.max(maxHeight,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        long maxWidth=Math.max(verticalCuts[0],w-verticalCuts[m-1]);
        for(int i=1;i<verticalCuts.length;i++){
            maxWidth=Math.max(maxWidth,verticalCuts[i]-verticalCuts[i-1]);
        }
        return (int)((maxHeight * maxWidth) % (1000000007));
    }
}
