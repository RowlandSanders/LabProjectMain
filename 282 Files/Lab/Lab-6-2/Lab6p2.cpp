#include<iostream>
using namespace std;

int main()
{
   /**
 * Declared n, i and max as int var
 * 
 */
   int n;
   int i;
   int max;
   /**
   *Declare size of array
   */
   cout<<"Array size? ";
   cin>>n;
  
   int *x = new int(n);
   
   cout<<"What elements are in the array? ";
  /**
  * input values to array
  */
   for(i=0;i<n;i++)
   {
       cin>>*(x+i);
   }
/**
* Display assigned values in array
*/
   cout<<"\nThe array you selected is [ ";
   max=*(x+0);
/**
* Get largest element in array
*/
   for(i=0;i<n;i++)
   {
       cout<<*(x+i)<<" ";
       if(max<*(x+i))
           max=*(x+i);
   }
/**
* Displays the largest element 
*/
   cout<<"]";
   cout<<"\nThe largest element in your array was "<<max;
   return 0;
}