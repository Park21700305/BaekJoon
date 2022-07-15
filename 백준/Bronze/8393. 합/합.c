#include <stdio.h>


int fuc1(int a) {
    if(a == 1)
        return 1;
    else
        return (a+fuc1(a-1));
}

int main(void) {

    int num;

    scanf("%d",&num);
    printf("%d\n",fuc1(num));

    return 0;
}