package com.practise.tree;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int subset[] = new int[arr.length];
        int sum = 7;
        isSubSetSum(arr, sum,subset, arr.length, 0);
        //System.out.println(res);

    }

    public static int isSubSetSum( int arr[], int sum,int subset[], int n, int k) {

        if (sum == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(" " + subset[i]);
            }
            System.out.println();
            k=0;
            return 0;
        }
        if (sum != 0 && n <= 0) {
            return 1;
        }
        subset[k] = arr[n-1];

        return isSubSetSum(arr,sum-arr[n-1],subset,n - 1, k + 1)+isSubSetSum(arr,sum,subset, n - 1, k);

    }
}
