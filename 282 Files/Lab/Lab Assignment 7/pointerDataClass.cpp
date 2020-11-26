#include "pointerDataClass.h"
#include <iostream>
using namespace std;
/**
* constructor to create an array of the size *   * * @param size - size of an array
*/
pointerDataClass::pointerDataClass(int size) {
	length = 0;           //set length to 0
	maxSize = size;       //set maxSize with size
	p = new int[maxSize]; //create a dynamic array with maxSize
}

pointerDataClass::~pointerDataClass()
{
	delete[] p; //delete p to free memory
}
//function displayData displays p
void pointerDataClass::displayData() {
	for (int i = 0; i < 5; i++) {
		cout << *(p + i) << " ";
	}
}

void pointerDataClass::insertAt(int index, int num) {
	/**
	* if index is less than maxSize, then proceed.
	* if index is less than or equal to the length, shift every element down to create a space
	* then insert elements.
	* if index is more than or equal to maxsize, display "list is full"
	*/
	if (index < maxSize) {
		if (index <= length) {
			*(p + index) = num;
			length++;
		}
	}
	if (index >= maxSize) {
		cout << "List is full" << endl;
	}
}
