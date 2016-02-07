#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
/**
 * Problem link: https://www.hackerrank.com/challenges/pangrams
 * @author Karandikar
 *
 */
int main() {
    char *str;
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    char *iter;
    int alpha[27]={0};
    str = (char *)malloc(10240 * sizeof(char));
    *str = '\0';
    scanf("%[^\n]",str);
    
    for(iter = str; *iter != '\0'; iter++){
        if(*iter >= 65 && *iter <= 90){
            // capitalized letter
            if(alpha[*iter-65+1] == 0){
                alpha[0]++;
            }
            alpha[*iter-65+1] = 1;
        }else if(*iter >= 97 && *iter <= 122){
            // small letter
            if(alpha[*iter-97+1] == 0){
                alpha[0]++;
            }
            alpha[*iter-97+1] = 1;
        }
    }
    
    alpha[0] == 26 ? printf("pangram") : printf("not pangram");
    return 0;
}
