#include<iostream>
int main()
{
  int a,b,add,sub,mul,divw,rem;
  std::cin>>a>>b;
  add=a+b;
  sub=a-b;
  mul=a*b;
  divw=a/b;
  rem=a%b;
  std::cout<<"a+b="<<add<<"\n";
  std::cout<<"a-b="<<sub<<"\n";
  std::cout<<"a*b="<<mul<<"\n";
  std::cout<<"a/b="<<divw<<"\n";
  std::cout<<"a%b="<<rem<<"\n";
  return 0;
}