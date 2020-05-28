#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int litre,distance,a;
  cin>>mileage>>litre>>distance;
  a=mileage*litre;
  if(a<distance)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
  return 0;
}