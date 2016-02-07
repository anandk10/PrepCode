#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

/**
 * Problem link: https://www.hackerrank.com/challenges/staircase
 * @author Karandikar
 *
 */
 
int main(){
    int n; 
    int i,j,k;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
		  printf(" ");
        }
        for(k=0;k<=i;k++)
	       printf("#");
        printf("\n");
    }
	return 0;
}
