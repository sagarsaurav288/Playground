#include<iostream>
using namespace std;
int main()
{
  int first,last,x,menu;
  cout<<"Enter first number :";
  cin>>first;
  cout<<" "<<"Enter second number :";
  cin>>last;
  cout<<" "<<"Menu"<<"\n";
  cout<<"1.Addition"<<"\n";
  cout<<"2.Subtraction"<<"\n";
  cout<<"3.Multiplication"<<"\n";
  cout<<"4.Division"<<"\n";
  cout<<"5.Remainder"<<"\n";
  cin>>menu;
  switch(menu)
  {
   	   case 1:
         x = first+last;
         cout<<x;
         break;
       case 2:
         x = first-last;
         cout<<x;
         break;
       case 3:
         x = first*last;
         cout<<x;
         break;
       case 4:
         x = first/last;
         cout<<x;
         break;
       case 5:
         x = first%last;
         cout<<x;
         break;
      default :
        cout<<"Invalid operation";
      break;
     
  }
     return 0;
}