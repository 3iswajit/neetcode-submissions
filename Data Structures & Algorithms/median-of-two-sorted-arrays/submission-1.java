class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> output = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                output.add(nums1[i]);
                i++;
            }
            else{
                output.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            output.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            output.add(nums2[j]);
            j++;
        }
        
        double median = 0.0;
        int mid=output.size()/2;
        
        if(output.size()%2==0){
            median = ( output.get(mid) + output.get(mid-1) )/2.0;
        }
        else{
            median = output.get(mid);
        }

        return median;
    }
}
