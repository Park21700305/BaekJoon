#include <stdio.h>

int main(void) {
    int N,X;

    scanf("%d %d",&N,&X);
    int arr[N];

    for(int i=0; i<N; i++)
        scanf("%d",&arr[i]);

    for(int k=0; k<N; k++) {
        if(arr[k] < X)
            printf("%d ", arr[k]);
    }

    return 0;
}