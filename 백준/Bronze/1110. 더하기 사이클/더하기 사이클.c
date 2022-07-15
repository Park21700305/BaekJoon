#include <stdio.h>

int main(void) {
    int num,a,b,tmp,new;
    int count=0;

    scanf("%d",&num);
    new = num;

    while(1){

        a = new/10;
        b = new%10;
        tmp = a+b;
        new = b*10 + tmp%10;
        count++;
        if(new == num)
            break;
    }

    printf("%d\n",count);
    return 0;
}
