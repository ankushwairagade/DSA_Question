package com.ankush._6_Arrays.Questions.TrappingRainWater;

public class trappingrainwater {
    public static void main(String[] args) {
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int []left = new int[height.length];
        int []right = new int[height.length];
        int max=-999999;
        for (int i = 0; i < height.length; i++) {

            if(height[i]>max)
            {
                max=height[i];

            }
            left[i]=max;
        }
         max=-999999;
        for (int i = height.length-1; i >= 0; i--) {
            if(height[i]>max)
            {
                max=height[i];
            }
            right[i]=max;
        }

        int total=0;
        for (int i = 0; i < height.length; i++) {
            int min=Math.min(left[i],right[i]);
            total+=Math.abs(height[i]-min);
        }
        System.out.print(total);

    }


}
