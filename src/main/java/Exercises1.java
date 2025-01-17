public class Exercises1 
{
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) 
    {
        // TODO
    	long ans = 1;
    	for (int i = 1; i < n+1; i++)
    	{
    		ans = ans * i; 
    	}
        return ans;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) 
    {
        // TODO
    	if (n==0)
    	{
            return 0;
    	}
    	else if( n==1 || n==2 )
    	{
            return 1;
    	}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) 
    {
        // TODO
    	char[][] answer = new char[9][9];
    	for (int i = 0; i < rows; i++)
    	{
    		for (int k = 0; k <= i; k++)
    		{
    			answer[i][k] = '*';
    		}
    	}
        return answer;
    }


    public static void main(String[] args) 
    {
    	generateTriangle(8);
    }

}