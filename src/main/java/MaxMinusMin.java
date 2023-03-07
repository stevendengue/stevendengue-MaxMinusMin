
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int mini=nums.get(0);
        int maxi=nums.get(0);
        for(int i=1; i<nums.size(); i++){
            if(mini>nums.get(i)){
                mini=nums.get(i);
            }
            if(maxi<nums.get(i)){
                maxi=nums.get(i);
            }
        }
        return maxi-mini;
    }
}
