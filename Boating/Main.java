#include<iostream>
using namespace std;
int main()
{
  int weight, adult, child,a;
  cin>>weight>>adult>>child;
  a=(adult*75)+(child*30);
  if(a<=weight)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}