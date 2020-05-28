#include<iostream>
using namespace std;
int main()
{
  int unit,a;
  cin>>unit;
  a=unit*0.5;
  if(unit<=200)
    cout<<"Rs."<<a;
  else
    cout<<" ";
  return 0;
}