class Solution
{
    public long PowMod(long x, long n, long m)
    {
        long result=1;
  		while(n>0)
  		{
  		    if(n % 2 == 1)
  		        result=((result % m) * (x % m))%m;
  		    x = (x*x) % m;
  		    n = n/2;
  		}
  		return result;
    }
}
