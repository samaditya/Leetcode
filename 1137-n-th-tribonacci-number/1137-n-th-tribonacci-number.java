class Solution {
    public int tribonacci(int n) {
        
          if(n==1){ 
              return 1;
          }

            if(n==2){ 
              return 1;
          }

        int a = 0,b=1,c=1,d=0;
        
      
        
        for(int i = 2 ; i < n ; i++){
            d = a+b+c;
            int temp = b;
            int temp1 = c;
            a = temp;
            b = temp1;
            c = d;
        }
        return d;
    }
}