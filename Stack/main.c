#include<stdlib.h>
#include<stdio.h>
#include<malloc.h>
#include<string.h>
#include"Stack.h"
void main(void) {
	init();//stack is inited.
	for (int i = 0; i < 10; i++) {
		Push(i);//push i to the stack.
	}
	printf("%d\n",Top());//print the top elem to the console.

	system("pause");
	
	return 0;
}