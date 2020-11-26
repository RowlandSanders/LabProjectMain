
//directives
#include<iostream>
#include<string>
#include<cmath>
#include"Rectangle.h"
#include"Rectangle.cpp"

using namespace std;

int main() 
{
    double area;
    double perimeter
    Rectangle test1;
    Rectangle test2;
    
    test1.width = 4;
    test1.height = 40;
    test2.width = 3.5;
    test2.length = 35.9;
    
    cout << "Rectangle1's area and perimeter\n";
    cout << "Area: "<< getArea(test1.width,test1.height) << " " << "Perimeter: " <<getPerimeter(test1.width, test1.height);
    
    cout << "Rectangle2's area and perimeter\n";
    cout >> test1.height;
    
    
}



