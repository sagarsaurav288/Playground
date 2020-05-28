#include<iostream>
using namespace std;
int main()
{
  int radius,length,a;
  cin>>radius>>length;
  a=radius*2;
  if(a>length)
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
  return 0;
}