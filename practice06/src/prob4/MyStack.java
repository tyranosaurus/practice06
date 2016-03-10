package prob4;

public class MyStack implements Stack
{
	private String[] arr;
	private int top = -1;
	private int capacity;
	
	public MyStack(int capacity)
	{
		this.capacity = capacity;
		arr = new String[capacity];
	}

	@Override
	public void push(String str) throws RuntimeException 
	{		
		if (top >= 2)
		{
			capacity *= 2;
			String[] tmp = new String[capacity];
			System.arraycopy(arr, 0, tmp, 0, arr.length);  // System.arraycopy 배열복사 외워둘것!!!!!!
			arr = tmp; 
			arr[top+1] = str;
			top++;
			return;
		}
		arr[top+1] = str;
		top++;
	}

	@Override
	public String pop() throws RuntimeException 
	{	
		if (top == -1)
		{
			return null;
		}
		
		String out = arr[top];
		top--;
		
		return out;
	}

	@Override
	public boolean isEmpty() 
	{
		if (top == -1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public int size() 
	{
		// TODO Auto-generated method stub
		return top + 1;
	}

}
