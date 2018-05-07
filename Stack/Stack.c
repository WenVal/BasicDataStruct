#include"Stack.h"
#include<stdlib.h>
#include<stdio.h>
#include<malloc.h>
void init() {
	s.top = -1;
}
int Empty() {
	if (s.top == -1) {
		return TRUE;
	}
	else
	{
		return FALSE;
	}
}
int Full() {
	if (s.top == MAX_SIZE - 1) {
		return TRUE;
	}
	else
	{
		return FALSE;
	}

}

void Push(ELEMTYPE elem) {
	if (!Full()) {
		s.top++;
		s.data[s.top] = elem;
	}
	else
	{
		printf("Stack is full...\n");
	}
}
void Pop() 
{
	if (!Empty())
	{
		s.top--;
	}
	else
	{
		printf("Stack is empty...\n");
	}
}
ELEMTYPE Top() {
	if (!Empty()) {
		return s.data[s.top];
	}
	else
	{
		printf("Stack is emtpy...\n");
	}
}
void Destroy() {
	s.top = -1;
}