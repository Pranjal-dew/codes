#include<iostream>
using namespace std;
int main()
{
  int n,i,j,source,destination,loc1,loc2,swt;
  cout<<"Enter number of nodes : ";
  cin>>n;
  int a1[n][n];
  cout<<"Enter matrix : \n";
  for(i=0;i<n;i++)
  for(j=0;j<n;j++)
  cin>>a1[i][j];
  cout<<"Enter Source and destination node : ";
  cin>>source>>destination;

  int st=source;
  int ed=destination;

  cout<<source;

  while(st!=ed)
  {
    int max=99;
    for(i=st+1;i<n;i++)
      {
          if((a1[st][i]<max)||(a1[st][i]!=0)||i<st)
            {
              max=a1[st][i];
              loc1 = i;
            }
          else if((a1[st][i]<max)||(a1[st][i]!=0)||i>st)
            {
              max=a1[st][i];
              loc2 = i;
            }
      }

    st=(loc1>loc2)?loc2:loc1;
    cout<<" -> "<<st;
  }
  cout<<endl;

}
