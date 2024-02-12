package Day1;

public class MaximumSubArray 
{
	public static void main(String[] args)
	{
		int [] arr= {-1,0,4,8,10};
		System.out.println(subarray(arr));
	}
	public static int subarray(int [] nums)
	{
		int max=Integer.MIN_VALUE;
		int n=nums.length;
		
		if(n==1)
		{
			return nums[0];
		}
		
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+nums[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		return max;
	}
}

