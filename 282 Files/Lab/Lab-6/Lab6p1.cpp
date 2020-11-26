#include <iostream>
using namespace std;

int main()
{
   /**
 * Declared values1 and valuess 2 as long variables
 * Declared longptr as 
 * Intialized value1 variable with an integer
 */

   long value1;
   long value2;
   long* longPtr;
   value1 = 200000;
   
    /**
 * Assigned the address of value1 to longPtr
 * Assigned value of object pointed by *longPtr to value2
 */
     
   longPtr = &value1;
   value2 = *longPtr;

   /**
 * Displays the values pointed by Ptr at value 2
 * Displays value of value2
 * Displays address of values1
 * Displays address of longPtr
 */  
   
   cout<<"Object pointed to by longPtr's value = "<<*longPtr<<'\n';
   cout<<"Value 2 = "<<value2<<'\n';
   cout<<"Value 1's address = "<<&value1<<'\n';
   cout<<"The address stored in longPtr = "<<longPtr<<'\n';

   return 0;
}

