#include <iostream>
#include "Fraction.h"
using namespace std;

int main() {
  Fraction fract1(1,2);
  Fraction fract2(2,3);

  cout << "Solution: ";
  // Fraction f = fract1.multiplyFract(fract2);
  // f.print();
  fract1.multiplyFract(fract2).print();
  
}