# Merge_Sort
import java.util.*;
public class Main
{
	public static void merge(int low,int mid,int high,int arr[])
	{
	    int n=high-low+1;   
	    int low1=low;
	    int temp[]=new int[n];
	    int x=0;
	    int mid1=mid+1;
	    while(low<=mid && mid1<=high)
	    {
	        if(arr[low]<arr[mid1])
	        {
	            temp[x]=arr[low];
	            x++;
	            low++;
	        }
	        else
	        {
	            temp[x]=arr[mid1];
	            x++;
	            mid1++;
	        }
	    }
	    while(low<=mid)
	    {
	        temp[x]=arr[low];
	        x++;
	        low++;
	    }
	    while(mid1<=high)
	    {
	        temp[x]=arr[mid1];
	        x++;
	        mid1++;
	    }
	    for(int i=0;i<temp.length;i++)
	    {
	        arr[low1]=temp[i];
	        low1++;
	    }
	}
	public static void divide(int low,int high,int arr[])   
	{
	    if(low==high)
	    return;
	    int mid=(low+high)/2;
	    divide(low,mid,arr);
	    divide(mid+1,high,arr);
	    merge(low,mid,high,arr);
	}
	public static void main(String[] args)  
	{
		int arr[]=new int []{5,6,2,3,1,4};
		divide(0,5,arr);
		for(int i=0;i<6;i++)
		{
		   System.out.print(arr[i]+" "); 
		}
	}
}
