#include<iostream>
using namespace std;
int main()
{
  int p,r,t,si,tamount;
  float discount,fprice;
  cin>>p>>r>>t;
  si=(p*r*t)/100;
  tamount=p+si;
  discount=(si/100.0)*2;
  fprice=tamount-discount;
  cout<<si<<"\n";
  cout<<tamount<<"\n";
  cout<<discount<<"\n";
  cout<<fprice<<"\n";
  return 0 ;
}