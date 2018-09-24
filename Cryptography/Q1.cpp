#include<iostream>
#include<string>
using namespace std;

string encryptShift(string data,int k)
{
    string res="";
    for(int i=0;i<data.length();i++)
    {
        if(isupper(data[i]))
            res+=char(int(data[i])+k);
        else
            res+=char(int(data[i])+k);
    }
      return res;
}

int main()
{
    int k;
    string data,result;
    cout<<"Enter the Data to be encrypted : ";
    cin>>data;
    cout<<"Enter the key : ";
    cin>>k;
    result = encryptShift(data,k);
    cout<<"After encryption : "<<result;
    return 0;
}
