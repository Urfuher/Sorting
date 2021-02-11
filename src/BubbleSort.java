
public class BubbleSort{

	static void bubble(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int arrays[] = {5,6,8,10,1,3,6,9,2,23};
		bubble(arrays,10);
		for(int i=0;i<10;i++)
		{
			System.out.print(arrays[i]+" ");
		}
	}

}

