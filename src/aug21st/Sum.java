package aug21st;

public class Sum {
	
		public void add(double x,double y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	
	
	public void add(int ...a)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}
	
	public void add(long ...a)
	{
		long res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}

}
