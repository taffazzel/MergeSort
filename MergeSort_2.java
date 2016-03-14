
import java.util.Scanner;


public class MergeSort_2 {
	
	static int array_new[]=null;
		
		
	static int[] merge(int leftarray[],int rightarray[],int array[])
	{
		int left=leftarray.length;
		int right=rightarray.length;
		
		int i=0;
		int j=0;
		int k=0;
		while(i<left && j<right)
		{
			if(leftarray[i]<=rightarray[j])
			{
				array[k]=leftarray[i];
				i=i+1;
			}
			else
			{
				array[k]=rightarray[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<left)
		{
			array[k]=leftarray[i];
			i=i+1;
			k=k+1;
		}
		while(j<right)
		{
			array[k]=rightarray[j];
			j=j+1;
			k=k+1;
		}
		
		return array;
	}
	
		static void merge_sorting(int array[])
		{
			int arrayleft[] = null;
			int arrayright[]=null;
			int length=array.length;
			
			if(length<2)
				return;
			
			
			int mid=length/2;
			int left=mid;
			int right=length-mid;
			
			arrayleft = new int[left];
			arrayright = new int[right];
			for(int i = 0; i < mid; i++)
			{
				//System.out.print(array[i]);
				arrayleft[i]=array[i];
			}
			for(int j=mid, i = 0; j<length; j++, i++)
			{
				arrayright[i] = array[j];
			}
			merge_sorting(arrayleft);
			merge_sorting(arrayright);
			array_new = merge(arrayleft,arrayright,array);
			
		}
				
	
		public static void main(String a[])
		{
			//int array[]={4,2,1,6,8,0,3,5};
			 int array[]=null;
			 System.out.print("Enter Size of the array");
			   Scanner sc=new Scanner(System.in);
			   int val=sc.nextInt();
			   array = new int[val];
			   for(int i=0;i<val;i++)
			   {
				    System.out.println("Enter Number"+(i+1));
			   		array[i]=sc.nextInt();
			   }
			   
			   
			merge_sorting(array);
			int len=array_new.length;
			
			for(int l=0; l<len; l++)
			{
				System.out.print(array_new[l]+" ");
			}
			
		}		
}