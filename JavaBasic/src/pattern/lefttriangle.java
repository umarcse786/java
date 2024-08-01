package pattern;

public class lefttriangle {

    public static void main(String[] args) {
//        for (int i = 5; i >=1; i--) 
//        {
//        	
//            for (int j = 1; j <=5; j++)
//            {
//            	if(j!=i)
//                System.out.print(" ");
//            	else
//                
//                System.out.print("* ");
//            }
//            System.out.println();
//            
//        }
//       
//           

//    	for(int i=1;i<=5;i++)
//    	{
//    		for(int j=1;j<=5;j++)
//    		{
//    			if((i+j)>=6)
//    			{
//    				System.out.print("* ");
//    			}else
//    			{
//    				System.out.print("  ");
//    			}
//    		}
//    		System.out.println();
//    	}
//        
    	int num=0;
    	int nums[]= {1,3,1,1,4,1,1,5,1,1,6,2,2};
            int k=0;
    	         int l=nums.length;
    	         int c=0;
    	         for(int i=0;i<l;i++)
    	         {
    	             c=1;
    	            for(int j=i+1;j<l;j++)
    	            {
    	                if(nums[i]==nums[j])
    	                {
    	                    c++;
    	                    nums[j]='*';
    	                }
    	            }
    	            if(nums[i]!='*')
    	            {
    	                if(c>k)
    	                {
    	                	 num=nums[i];
    	                	 k=c;
    	                	 //System.out.println(num);
    	                }
    	                
    	            	
    	          }
    	       
    	    }
    	         System.out.println(num);
    	  
    }
    }

