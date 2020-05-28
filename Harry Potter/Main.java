#include<iostream>
using namespace std;
int main()
{
  string str;
  int sum=0;
  cin>>str;
  int l=str.length();
  char ch=str.at(0);
  char ch2=str.at(l-1);
  int n1=int(ch)-48;
  int n2=int(ch2)-48;
  sum=n1+n2;
  cout<<sum;
  return 0;
}