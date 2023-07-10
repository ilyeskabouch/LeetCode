// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                merged[k] = nums1[i];
                i++;
            } else {

                merged[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < nums1.length) {

            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {

            merged[k] = nums2[j];
            j++;
            k++;
        }

        if (merged.length % 2 == 0) {

            return (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        } else {

            return merged[merged.length / 2];
        }
    }
}