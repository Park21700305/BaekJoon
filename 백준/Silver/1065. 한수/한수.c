#include <stdio.h>

int seq(int n);

int main(void) {
    
    int input;
    
    scanf("%d", &input);
    
    printf("%d", seq(input));
    
}

int seq(int n) {
    
    int count=0;
    
    for(int i=1; i<n+1; i++) {
        if(0<i && i<100) count++;
        else if(i<1000) {
            if( i/100 - (i%100)/10 == (i%100)/10 - ((i%100)%10) ) count++;
        }
    }
    
    return count;
}