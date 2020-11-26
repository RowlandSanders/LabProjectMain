#include <iostream>
#include "Distance.h"
using namespace std;
int main()
{
	Distance dist1, dist3, dist4; //define distances
	cin >> dist1; // input from user
	Distance dist2(12, 9); //define, initialize dist2
	// operator of '+'
	dist3 = dist1 + dist2;
	// operator of friend '-'
	dist4 = dist1 - dist2;

	cout << "dist1 = " << dist1 << endl; //displays dist1
	cout << "dist2 = " << dist2 << endl; //displays dist2
	cout << "dist3 = " << dist3 << endl; //displays dist1 + dist 2
	cout << "dist4 = " << dist4 << endl; //displays difference distance between dist1 and dist2
}