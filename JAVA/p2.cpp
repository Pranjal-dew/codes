#include<iostream>
using namespace std;

int main()
{
	int n,i,sub,res;
	int g[3]={1,0,1};
	cout<<"Enter Size: ";
	cin>>n;	

	int a[n];
	int b[n];
	cout<<"Enter Data: ";

	for(i=0;i<n;i++)
	cin>>a[i];

	for(i=0;i<n;i++)
	b[i]=a[i];
	

	for(i=0;i<n;i++)
	{
		if(b[i]==1)
		{
		b[i+1]=b[i+1]^g[1];
		b[i+2]=b[i+2]^g[2];
		}

	}
	
	cout<<"Data Received...\n";
	for(i=0;i<n;i++)
	cout<<a[i]<<" ";
	cout<<"\n";

	if((b[n-2]==0)&&(b[n-1]==0))
		 cout<<"Data accepted.\n";
	else
		 cout<<"Data rejected.\n";
	
	
return 0;
}
