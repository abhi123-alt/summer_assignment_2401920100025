public class ContainerWithMostWater{
    public int water(int []height){
    // find the maximum water and then mive pointers towards the lower height ny comparing 
        int n=height.length;
        int left=0, right=n-1;
        int water=0;
        while(left<right){
            water=Math.max(water,(right-left)*Math.min(height[left],height[right]));
            if(height[left]>height[right]) right--;
            else left++;
        }
        return water;
    }
    public static void main(String[] args){
        ContainerWithMostWater c= new ContainerWithMostWater();
        int []height={1,8,6,2,5,4,8,3,7};
        System.out.println(c.water(height));
    }
}