#include <iostream>
using namespace std;

int largerInt(int a, int b) {
  if (a > b) {
    return a;
  } else {
    return b;
  }
}

// int* largestOfThree(int& a, int& b, int& c) {
//   int x = 0;
//   int* ptrX = &x;
//   x = largerInt(largerInt(a, b), c);
//   return ptrX;
// }

int &largestOfThree(int& a, int& b, int& c) {
  int x = 0;
  int* ptrX = &x;
  x = largerInt(largerInt(a, b), c);
  return *ptrX;
}

int main() {

  int a = 1, b = 4, c = 3;
  cout << largestOfThree(a, b, c) << endl;
  // cout << &largestOfThree(a, b, c) << endl;
  
}