#include <stdio.h>

int main(){
  int t[5] = {0};
  int n1, n2, max;
  for(int i = 1; i < 5; i++){
    scanf("%d %d", &n1, &n2);
    t[i] = t[i-1];
    t[i] -= n1;
    t[i] += n2;
  }
  
  max = 0;
  for(int i = 1; i<5; i++){
    if(max < t[i]){
      max = t[i];
    }
  }

  printf("%d", max);
}