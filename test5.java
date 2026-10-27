public class test5 {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int sort=0;
        int tar = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=tar){
                nums[sort]=nums[i];
                sort++;
            }
        }
        while(sort < n){
            nums[sort] = 0;
            sort++;
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
