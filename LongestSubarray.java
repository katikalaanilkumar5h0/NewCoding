package Day1;

public class LongestSubarray 
{
	public static void main(String[] args)
	{
		int [] arr= {-1,0,1,1,-1,-1,0};
		int k=0;
		System.out.println(longestSubarray(arr,k));
	}
	public static int longestSubarray(int[] nums,int k)
	{
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			int sum=0;
			int count=0;
			for(int j=i;j<nums.length;j++)
			{
				sum+=nums[j];
				if(sum==k)
				{
					count=j-i+1;
				}
			}
			if(count>max)
			{
				max=count;
			}
		}
		return max;
		
	}

}

// int max=0;
// for(int i=0;i<a.length;i++)
// {
//      int count=0;
//      int sum=0;
//      if(sum==k){
//           count++;
//           if(max=count){
//                  max=count;
//           }
//      }
//      for(int j=i;j<a.length;j++)
//      {
//           sum=sum+a[j];
//           counr++;
//           if(sum==k){
//                count++;
//                if(max<count){
//                         max=count;
                //}
//                break;
//           }
//       }
//   }
//  return max;
//}
