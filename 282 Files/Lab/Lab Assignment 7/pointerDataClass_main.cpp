#include <iostream>
#include "pointerDataClass.h"
using namespace std;
int main() {
	const int max_size = 10;
	pointerDataClass list(max_size);
	cout << "Max size is:  " << max_size << endl;

	cout << "\nTEST #1 = Insert at the end" << endl;
	for (int i = 0; i < 5; i++) {
		list.insertAt(i, i);
	}
		list.displayData();

	cout << "\nTest #2 - Insert in the middle" << endl;
	list.insertAt(2, 100);
	list.displayData();

	cout << "\nTest #3 - Out of bound" << endl;
	list.insertAt(10, 900);
	return 0;
}