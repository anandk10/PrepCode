#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

/**
 * Problem link: https://www.hackerrank.com/challenges/plus-minus
 * @author Karandikar
 *
 */
 
int main(){
    int n; 
    scanf("%d",&n);
    int arr[n];
    double pFrac=0, nFrac=0;
    for(int arr_i = 0; arr_i < n; arr_i++){
       scanf("%d",&arr[arr_i]);
       if(arr[arr_i] > 0)
           pFrac++;
       else if(arr[arr_i] < 0)
           nFrac++;           
    }
    printf("%.6f",pFrac/n);
    printf("\n%.6f",nFrac/n);
    printf("\n%.6f",(n-pFrac-nFrac)/n);
    
    return 0;
}
