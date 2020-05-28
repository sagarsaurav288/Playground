#include<iostream>
using namespace std;
int main()
{
  int flipam,flipdis,flipship,snappam,snappdis,snapship,amazam,amazdis,amazship;
  int a,b,c,d,e,f,h,i,g;
  cin>>flipam>>flipdis>>flipship>>snappam>>snappdis>>snapship>>amazam>>amazdis>>amazship;
  a=(flipam/100)*flipdis;
  i=flipam-a;
  b=i+flipship;
  c=(snappam/100)*snappdis;
  g=snappam-c;
  d=g+snapship;
  e=(amazam/100)*amazdis;
  h=amazam-e;
  f=h+amazship;
  cout<<"In Flipkart Rs."<<b<<"\n";
  cout<<"In Snapdeal Rs."<<d<<"\n";
  cout<<"In Amazon Rs."<<f<<"\n";
  if(b<d && b<f)
    cout<<"He will prefer Flipkart";
  else if(d<b && d<f)
    cout<<"He will prefer Snapdeal";
  else if(f<b && f<d)
    cout<<"He will prefer Amazon";
  else if(d==b)
    cout<<"He will prefer Flipkart";
  return 0;
  }