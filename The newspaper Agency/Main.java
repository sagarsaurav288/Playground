#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit,finalprofit;
  cin>>w>>x>>y;
  profit=w*x-(w*y);
  finalprofit=profit-100;
  cout<<finalprofit;
  return 0;
}