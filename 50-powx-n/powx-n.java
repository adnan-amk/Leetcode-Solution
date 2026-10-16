class Solution {
    public double myPow(double x, int n) {
      long num = n;
      if(num<0)
        return (1/pow(x,-num));
      return pow(x,num);
    }
    private double pow(double x,long num){
        if(num == 0)
            return 1;
        if(num == 1)
            return  x;
        if(num%2 == 0)
             return pow(x*x,num/2);
        return x*pow(x,num-1);
    }
}