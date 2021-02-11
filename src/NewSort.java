
public class NewSort 
{
	static void insertion_sort(int arr[],int n)
	{
		int min=100,pos = 0;
		for(int i=0;i<n;i++)
		{
			min=100;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[pos]=temp;
		}
	}
	public static void main(String[] args) 
	{
		
		int arr[]= {6,3,9,10,32,1,8,7,234,53};
		insertion_sort(arr,10);
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

