#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
 
/**
 * Problem link: https://www.hackerrank.com/challenges/game-of-thrones
 * @author Karandikar
 *
 */
int findPalind(char *arr)
{
    int freq[27]={0};
    int i,j,len=0;
    // Find the required answer here. Print Yes or No at the end of this function depending on your inspection of the string
    len = strlen(arr);
    for(i=0;i<len;i++){
        freq[*(arr+i)-97]++;
    }
    for(i=0;i<26;i++){
        if(freq[i] % 2 != 0){
            freq[26]++;
            if(freq[26]>1)
                break;
        }
    }
    
    if (freq[26]>1)
        printf("NO\n");
    else
        printf("YES\n");
    
    return 0;
}
int main() {

    char arr[100001];
    scanf("%s",arr);
    findPalind(arr);
    return 0;
}
