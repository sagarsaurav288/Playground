#include<iostream>
using namespace std;
int main()
{
  int actual, yours;
  cin>>actual>>yours;
  if(yours<actual)
    cout<<"Yes, you can enter.";
  else if(yours==actual)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}