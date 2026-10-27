public class test7 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ nums[i];
        }
        System.out.println(ans);
    }
}
