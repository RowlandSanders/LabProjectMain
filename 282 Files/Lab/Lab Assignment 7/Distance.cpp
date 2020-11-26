#include "Distance.h"
using namespace std;
Distance::Distance() : feet(0), inches(0.0) {
	//given default constructor
	//feet = 0;
	//inches = 0.0;
}

Distance::Distance(int ft, float in) {
	/**
	*	allows accessbility to private members
	*	
	*/
	feet = ft;
	inches = in;
}

Distance operator - (Distance const& d1, Distance const& d2) {
	Distance distance;
	// local variable of negative operator
	float d1sum, d2sum, total;
	// convert feets to incehs to calculate the total
	d1sum = d1.feet * 12 + d1.inches;
	d2sum = d2.feet * 12 + d2.inches;
	total = d1sum - d2sum;
	// if total is greater than one than proceed following:
	if (total > 0) {
		distance.feet = total / 12;
		distance.inches = fmod(total,12);
		return distance;
	}
	// if total is less than one than switch d1sum and d2sum to make it posstive
	// to calculate the following algorithm:
	else
	{
		total = d2sum - d1sum;
		distance.feet = total / 12;
		distance.inches = fmod(total, 12);
		return distance;
	}
	
}
//ostream operator displays feet and inches
ostream& operator << (ostream& output, Distance const&  o) {
	output << o.feet << "'" << o.inches << "''" << endl;
	return output;
}
//istream operator allows user to input
istream& operator >> (istream& input, Distance& i) {
	cout << "Enter feet: ";
	input >> i.feet;
	cout << "Enter inches: ";
	input >> i.inches;
	// below code is to implement display of dist1 on the main function to correct form
	if (i.inches >= 12) {
		i.feet = i.feet + i.inches / 12;
		i.inches = fmod(i.inches, 12);
		return input;
	}
	else {
		return input;
	}
}