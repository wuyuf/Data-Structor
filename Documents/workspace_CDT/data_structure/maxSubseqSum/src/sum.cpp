#include <stdio.h>
#include <time.h>
#include <math.h>

#define SIZE 1000000
int maxSubseqSum(int a[], int n)
{
	int i;
	int sum = 0;
	int max = 0;
	for (i = 0; i < n; ++i)
	{
		sum += a[i];
		if (sum > max){	//如果和大于最大值 就更新最大值
			max = sum;
		}else if (sum < 0)	//如果和是负数 就舍弃
			sum = 0;	//因为负数加上后面的序列和只会让和变小
	}
	return max;
}


int main(){
	int n,i;
	int a[SIZE];
	scanf("%d" ,&n);

	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	printf("%d\n",maxSubseqSum(a,n));
	return 0;



}
