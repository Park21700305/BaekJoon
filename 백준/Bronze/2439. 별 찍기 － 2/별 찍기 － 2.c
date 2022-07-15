#include <stdio.h>

int main(void){
    int num;

    scanf("%d",&num);

    for(int k = 1; k <= num; k++) {
        for (int i = num; i > k; i--)
            printf(" ");
        for (int j = 0; j < k; j++)
            printf("*");
        printf("\n");
    }
    return 0;
}