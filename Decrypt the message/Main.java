#include <iostream> 
using namespace std; 

int main()
{
	int n,m,i=1,sum=0,y;
	cin>>n>>m;
  	y=n+m;
	while(i<y)
	{
		if(y%i==0)
			sum=sum+i;
		i++; 
	}

	if(sum==y)
		cout << "They can read the message\n"; 
	else
		cout << "They can't read the message\n";

	return 0;
}