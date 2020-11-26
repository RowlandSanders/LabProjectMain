#ifndef Distance_H
#define Distance_H
#include<iostream>
using namespace std;
class Distance {
//private members
private:
	int feet;		//declared variable to store feet
	float inches;	//declared variable to store inches
//public members
public:
	/*
	* Default constructor
	*/
	Distance();
	/*
	* constructor allows to access variable feet and inches.
	* @param ft	variable to store ft
	* @param in variable to store in
	*/
	Distance(int ft, float in);
	//Overload class operator +
	Distance operator + (const Distance& d)
	{
		Distance distance;

		distance.inches = inches + d.inches;
		if (distance.inches >= 12) {
			distance.feet = feet + d.feet + (inches + d.inches) / 12;
			distance.inches = fmod(inches + d.inches, 12);
			return distance;
		}

		else {
		distance.feet = feet + d.feet;
		distance.inches = inches + d.inches;
		return distance;
		}

	}
	//Overload class operator -
	friend Distance operator - (Distance const& d1, Distance const& d2);
	//Overload class operator cout
	friend ostream& operator << (ostream& out, const Distance& o);
	//Overload class operator cin
	friend istream& operator >> (istream& in, Distance& i);

};
#endif