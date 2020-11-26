
//directives
#include<iostream>
#include<string>
#include<cmath>

using namespace std;

class Rectangle  //class
{
    public:
        double width;   //attributes
        double height;
};

double getArea(double width,double height)
{
    return width*height;    
}

double getPerimeter(double width, double height)
{
    return (width+width)+(height+height);
}

int main() 
{
    double area;
    double perimeter;
    
    Rectangle test1 = Rectangle();
    test1.width = 4;
    test1.height = 40;
    
    Rectangle test2 = Rectangle();    
    test2.width = 3.5;
    test2.height = 35.9;
    
    


    cout << "Rectangle 1's area and perimeter is...\n";
    cout << "Area: "<< getArea(test1.width,test1.height) << " " << "Perimeter: " <<getPerimeter(test1.width, test1.height)<< "\n";
    cout << "When the width is "<< test1.width << " " << "Perimeter is " << test1.height << "\n";
    
    cout << "\n";
    
    cout << "Rectangle 2's area and perimeter is...\n";
    cout << "Area: "<< getArea(test2.width,test2.height) << " " << "Perimeter: " <<getPerimeter(test2.width, test2.height)<< "\n";
    cout << "When the width is "<< test2.width << " " << "Perimeter is " << test2.height << "\n";
    
    return 0;
}





