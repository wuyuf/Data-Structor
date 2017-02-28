/*
 ============================================================================
 Name        : Polynomial.c
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
double f1(int n,double a[],double x);
double f2(int n,double a[],double x);

int main(){
	int i;

	double a[MAXN];	/*存储多项式的系数*/
	start = clock();
	for(i=0;i<MAXN;i++)	/*重复调用函数亦或者充分多的时间打点数*/
		f1(MAXN-1,a,1.1);
	stop=clock();

	duration=((double)(stop-start))/CLK_TCK;
	printf("tics1=5f\n",(double)(stop-start));
	printf("duration1=%6.2e\n",duration);




	return 0;
}



double f1(int n,double a[],double x){
	int i;
	double p = a[0];
	for(i=1;i<=n;i++)
		p += (a[i] * pow(x,i));
	return p;



}
