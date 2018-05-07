#ifndef STACK_H
#define STACK_H
#define MAX_SIZE 100
#define TRUE 1
#define FALSE 0
typedef int ELEMTYPE;
typedef struct _STACK {
	ELEMTYPE   data[MAX_SIZE];
	int top;
}STACK,*PSTACK;

STACK s;
void init();
int Empty();
int Full();
void Push(ELEMTYPE elem);
void Pop();
ELEMTYPE Top();
void Destroy();
#endif 
