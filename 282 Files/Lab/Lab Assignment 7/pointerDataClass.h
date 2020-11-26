#ifndef POINTERDATACLASS_H
#define POINTERDATACLASS_H

class pointerDataClass {
	int maxSize;      // variable to store the maximum                             size of p
	int length;       // variable to store the number of                      elements in p
	int* p = nullptr; // pointer to an int array

public:
	pointerDataClass(int size);
	/**
	* Deconstructor of pointerDataClass
	* Deallocate p, pointer to an int array
	*/
	~pointerDataClass();
	/**
	* function insertAt inserts nums into array
	* @param index  the position specificaiton
	* @param num    given numbers 0,1,2,3,4,5,6,7,8,9
	*/
	void insertAt(int index, int num);
	/**
	* DisplayDate displays all the array elements in p
	*/
	void displayData();
};
#endif
