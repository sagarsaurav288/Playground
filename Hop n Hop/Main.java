#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int corx,cory,distance;
  cin>>corx>>cory;
  distance=sqrt(pow(corx - 3, 2) +  pow(cory - 4, 2) * 1.0);
  cout<<distance;
  return 0;
}