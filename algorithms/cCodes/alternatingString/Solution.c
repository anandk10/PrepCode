#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

/**
 * Problem link: https://www.hackerrank.com/challenges/alternating-characters
 * @author Karandikar
 *
 */
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int iter = 0, len=0, i,k,strCount;
    int numDeletions = 0;
    char *str = (char*) malloc(100001 * sizeof(char));
    scanf("%d",&strCount);
    for(k=0; k<strCount; k++){
       str = (char*) malloc(100001 * sizeof(char));
	   *str='\0';
	   scanf("%s",str);
	   len = strlen(str);
       //printf("%d",len);
	   iter = 0;
	   numDeletions = 0;
       //printf("%d",len);
	   while(iter < len){
		if(*(str+iter)=='A'){
            for(i=iter+1; i<len && *(str+i) == 'A'; i++){numDeletions++;}
            iter = i;
		}
		if(*(str+iter)=='B'){
			for(i=iter+1; i<len && *(str+i) == 'B'; i++){numDeletions++;}
            iter = i;
		}
	   }
	   printf("%d\n",numDeletions);
       free(str);
    }
    
    return 0;
}