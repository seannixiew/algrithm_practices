//给定⼀个按照升序排列的整数数组 nums，和⼀个⽬标值 target，找出给定⽬标值在数组中的开始位置和结
//束位置。如果数组中不存在⽬标值 target，返回 [-1, -1]

public class BinarySearch {
    public String solution(int target,int[] nums){
        return "["+leftBound(target,nums)+","+rightBound(target, nums)+"]";
    }
    public int leftBound(int target,int[] nums){
        int left=0,right= nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }
        }

        if(nums[left]!=target || left>=nums.length){
            return -1;
        }
        return left;
    }
    public int rightBound(int target,int[] nums){
        int left=0,right= nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }
        }
        if(nums[right]!=target || right<0){
            return -1;
        }
        return right;
    }
}
class Solution{
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,7,7,7,7,7,7,8,8,10};
        int target=7;
        System.out.println("");
        BinarySearch binarySearch=new BinarySearch();
        String ans=binarySearch.solution(target,nums);
        System.out.println(ans);
    }
}
