#include<iostream>
using namespace std;

int main()
{
	int n,i,sub,res;
	int g[3]={1,0,1};
	cout<<"Enter Size: ";
	cin>>n;	

	int a[n];
	int b[n+2];
	cout<<"Enter Data: ";

	for(i=0;i<n;i++)
	cin>>a[i];

	for(i=0;i<n+2;i++)
	{
		if(i<n)
			b[i]=a[i];
		else
			b[i]=0;
	}
	

	for(i=0;i<n;i++)
	{
		if(b[i]==1)
		{
		b[i+1]=b[i+1]^g[1];
		b[i+2]=b[i+2]^g[2];
		}

	}
	
	cout<<"Transmitted Data:\n";
	
	for(i=0;i<n+2;i++)
	{
		if(i<n)
			cout<<a[i]<<" ";
		else
			cout<<b[i]<<" ";
	}
	
return 0;
}
