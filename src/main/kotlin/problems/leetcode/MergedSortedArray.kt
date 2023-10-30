package problems.leetcode

class MergedSortedArray {

    // https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in m until m+n) {
            nums1[i] = nums2[i-m]
        }
        nums1.sort()
    }
}