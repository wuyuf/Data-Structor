/*
 ============================================================================
 Name        : polynamialOptimizing.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <time.h>
#include <math.h>

clock_t start,stop;
double duration;
#define MAXK 1e7
#define MAXN 10
#define     CLK_TCK     18.2
double f2(int n,double a[],double x);

int main(){
	int i;
	double a[MAXN];	/*存储多项式的系数*/
	start = clock();
	f2(MAXN-1,a,1.1);
	stop=clock();
	duration = ((double)(stop-start))/CLK_TCK;
	printf("tics2=%f\n",(double)(stop-start));
	printf("duration1=%6.2e\n",duration);
}



double f2(int n,double a[],double x){
	int i;
	double p=a[n];
	for(i=n;i>0;i--)
		p=a[i-1]+x*p;
	return p;
}
