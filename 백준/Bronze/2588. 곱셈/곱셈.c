#include <stdio.h>

int main(void) {
    int num1,num2,a,b,c;
    
    scanf("%d %d",&num1,&num2);
    a = num2 / 100;
    b = (num2 % 100) / 10;
    c = (num2 % 100) % 10;
    
    printf("%d\n",num1*c);
    printf("%d\n",num1*b);
    printf("%d\n",num1*a);
    printf("%d\n",num1*num2);
    
    return 0;
    
}