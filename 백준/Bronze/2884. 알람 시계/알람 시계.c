#include <stdio.h>

int main(void) {
    int hour,min;

    scanf("%d %d",&hour,&min);

    if(min < 45) {
        if(hour == 0) {
            hour = 23;
            min = min+60-45;
            printf("%d %d",hour,min);
        }
        else {
        min = min+60-45;
        hour -= 1;
        printf("%d %d",hour,min);
        }
    }
    else {
        min = min-45;
        printf("%d %d",hour,min);
    }

    return 0;
}