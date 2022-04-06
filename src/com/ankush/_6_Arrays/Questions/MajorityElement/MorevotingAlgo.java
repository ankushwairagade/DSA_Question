package com.ankush._6_Arrays.Questions.MajorityElement;

public class MorevotingAlgo {
// T(n) =0(n)

    public static void main(String[] args) {

        int []arr={6,5,5};
        System.out.println(moorevoting(arr));

    }

    static int moorevoting(int []arr)
    {
        int voter=arr[0],vote=1;

        for (int i = 1; i < arr.length-1; i++) {
            if(voter == arr[i]) {
                vote=vote+1;
            }else{
                if (vote > 0){
                    vote--;
                }else{
                    if(vote >= 0) {
                        voter = arr[i];
                        vote = 1;
                    }
                }
            }
        }
        return voter;

    }

}
