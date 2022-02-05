
public class LengthOfLongestAP{
    public static void main(String args[]){

     int arr[] = {1,7,10,15,27,29};

       int lengthOfLongestAP = lengthOfLongestAP(arr);


    System.out.println("length of Longest AP is " + lengthOfLongestAP);


        }


    static int lengthOfLongestAP(int arr[])
    {

       int maxLen = -1;
              int n = arr.length;
       int L[][] = new int[n][n];

       for(int i=0;i<n;i++){
          L[i][n-1] = 2; 
          } 

       for(int j=n-2;j>=1;j--){
             
             int i=j-1;
             int k=j+1;
             while(i>=0 && k<=n-1){
    
              if((arr[i] + arr[k]) < 2*arr[j] ){
                  k++;
               }

            else if((arr[i] + arr[k]) > 2*arr[j]){
                   L[i][j] = 2;
                    i--;
                }

      else{
  
                 L[i][j] = L[j][k] + 1;
                 maxLen = Math.max(maxLen,L[i][j]);
                  i--;
                  k++;
             
  
            }
  

        }



      while(i>=0){
         L[i][j] = 2;
          i--;
      
        }
        
         }
         

      return maxLen;
    
     }

}
