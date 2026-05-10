class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int output[] = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                output[k] = nums1[i];
                i++;
                k++;
            }
            else{
                output[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            output[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            output[k] = nums2[j];
            j++;
            k++;
        }
        if(output.length % 2 == 0){
            return (output[output.length/2] + output[(output.length/2) - 1]) / 2.0;
        }
        else{
            return output[output.length/2];
        }
    }
}
