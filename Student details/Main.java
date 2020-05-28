#include<bits/stdc++.h>
using namespace std;

struct Student {
  string name;
  string department;
  int yearOfStudy;
  float cgpa;
};

bool cmp(Student a, Student b) {
  string s1 = a.name, s2 = b.name;
  return s1.compare(s2);
}

int main()
{
  //Type your code here.
  int n;
  cout << "Enter the number of students" << endl;
  cin >> n;
  Student arr[n];
  for (int i = 0; i < n; i++) {
    cout << "Enter the details of student " << i + 1 << endl;
    cout << "Enter name" << endl;
    cin >> arr[i].name;
    cout << "Enter department" << endl;
    cin >> arr[i].department;
    cout << "Enter year of study" << endl;
    cin >> arr[i].yearOfStudy;
    cout << "Enter cgpa" << endl;
    cin >> arr[i].cgpa;
  }
  sort (arr, arr + n, cmp);
  cout << "Details of students" << endl;
  for (int i = 0; i < n; i++) {
    cout << "Student " << i + 1 << endl;
    cout << "Name:" << arr[i].name << endl;
    cout << "Department:" << arr[i].department << endl;
    cout << "Year of study:" << arr[i].yearOfStudy << endl;
    cout << "CGPA:" << arr[i].cgpa << endl;
  }
  return 0;
}