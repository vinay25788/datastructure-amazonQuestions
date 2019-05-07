public class MedianSortedSameSize {
   
    // Using merge method of merge sort, for arrays of equal size 'n'
    // median will be nth and n+1th element average. So count n+1 times
    // and find those 2 elements - nth and n+1th
    // Time Complexity: O(n)
    public static double mergeSortCountingMethod(int[] arr1, int[] arr2, int n) {
        if (n == 0) return 0.0d;
        if (arr1.length != arr2.length || arr1.length != n) return 0.0d;
        double m1 = -1.0d, m2 = -1.0d;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2[0];
                break;
            }
           
            if (j == n) {
                m1 = m2;
                m2 = arr1[0];
                break;
            }
           
            if (arr1[i] <= arr2[j]) {
                m1 = m2;
                m2 = arr1[i];
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }
        return (m1+m2)/2;
    }
   
    public static Double median(int[] arr, int i, int j) {
        if (arr == null || i > j || i < 0 || j > arr.length) {
            return null;
        }
        int n = j - i + 1;
        if (i == j) return (double)arr[i];
        double med;
        if (n%2 == 0) {
            med = (arr[i + n/2 - 1] + arr[i + n/2])/2.0d;
        }
        else {
            med = (double) arr[i + n/2];
        }
        return med;
    }
    public static double medianUsingRecursion(int[] arr1, int[] arr2, int n) {
		if (n==1) return (arr1[0] + arr2[0])/2.0d;
		if (n==2) return (Math.max(arr1[0], arr2[0]) + Math.min(arr1[1], arr2[1]))/2.0d;
		return medianUsingRecursionHelper(arr1, 0, n-1, arr2, 0, n-1);
	}
	
	private static double medianUsingRecursionHelper(int[] arr1, int s1, int e1, int[] arr2, int s2, int e2) {
		Double m1 = median(arr1, s1, e1);
		Double m2 = median(arr2, s2, e2);
		if (m1 == null) return m2;
		if (m2 == null) return m1;
		
		int len1 = (e1-s1+1);
		int len2 = (e2-s2+1);
		if (m1 < m2) {
			if (len1 % 2 == 0) {
				s1 += len1/2 - 1;
			}
			else {
				s1 += len1/2;
			}
			
			if (len2 % 2 == 0) {
				e2 = e2 - len2/2 + 1;
			}
			else {
				e2 -= len2/2;
			}
			return medianUsingRecursionHelper(arr1, s1, e1, arr2, s2, e2);
		}
		else if (m1 > m2) {
			if (len2 % 2 == 0) {
				s2 += len2/2 - 1;
			}
			else {
				s2 += len2/2;
			}
			
			if (len1 % 2 == 0) {
				e1 = e1 - len1/2 + 1;
			}
			else {
				e1 -= len1/2;
			}
			return medianUsingRecursionHelper(arr2, s2, e2, arr1, s1, e1);
		}
		else return m1;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7,8,9};
		int n = arr1.length;
		//double med = mergeSortCountingMethod(arr1, arr2, n);
		double med = mergeSortCountingMethod(arr1, arr2, n);
		//System.out.println(medianUsingRecursion(arr1, arr2, n));
		System.out.println("med = " + med);
	}
}
