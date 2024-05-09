package pack1;

import java.util.Arrays;

public class ClassE {
	public int[] sum(int[] nums)
	{
	return new int[] {nums[0]+nums[1]+nums[2]};
	}
    public int[] rotateleft3(int[] nums)
    {
    	return new int[] {nums[1],nums[2],nums[0]};
    
    }
    public int[] maxend3(int[] nums)
    {
    	if(nums[0]>nums[1])
    		return new int[] {nums[0],nums[0],nums[0]};
    	else
    		return new int[] {nums[2],nums[2],nums[2]};
    			
    }
    public int[] middleway(int[] a,int[] b)
    {
    	return new int[] {a[1],b[1]};
    }
    public int[] makeends(int[] nums)
    {
    	return new int[] {nums[0],nums[(nums.length-1)]}; 
    }
    public int[] makelast(int[] nums)
    {
    	int size=nums.length;
    	int[] arr=new int[size*2];
    	arr[arr.length-1]=nums[nums.length-1];
    	return arr;
    }
	public static void main(String[] args) {
		ClassE obj=new ClassE();
		int input1[]= {5,20,7,18}; 
		int[] result=obj.sum(input1);
		System.out.println(Arrays.toString(result));
	    //int[] result1=obj.rotateleft3(input1);
	    //System.out.println(Arrays.toString(result1));
	    //int[] result2=obj.maxend3(input1);
	    //System.out.println(Arrays.toString(result2));
		//int[] a= {10,0,30};
		//int[] b= {10,0,30};
		//int[] result3=obj.middleway(a,b);
		//System.out.println(Arrays.toString(result3));
		//int[] result4=obj.makeends(input1);
		//System.out.println(Arrays.toString(result4));
		//int[] result5=obj.makelast(input1);
		//System.out.println(Arrays.toString(result5));
	}

}
