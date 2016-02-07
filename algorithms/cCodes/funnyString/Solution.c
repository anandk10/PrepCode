#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
/**
 * Problem link: https://www.hackerrank.com/challenges/funny-string
 * @author Karandikar
 *
 */
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int strCount=0,k=0;
    int oStrLen=0;
    int i, j, isFunny = 0;
    char *str=(char*) malloc(10001 * sizeof(char));
    scanf("%d",&strCount);
    
    for(k=0;k<strCount;k++){
    // this loop for the number of strings
       *str = '\0';
       scanf("%s",str);
       oStrLen = strlen(str);
       isFunny = 1;
       for(i=1, j=oStrLen-2; i<oStrLen && j>=0; i++, j--){

            if(abs(*(str+i) - *(str+i-1)) != abs(*(str+j) - *(str+j+1))){             
                isFunny = 0;
                break;
            }
       }
       isFunny == 1 ? printf("Funny\n") : printf("Not Funny\n");
    }
    return 0;
}
