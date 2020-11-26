#include <iostream>
#include <string>

using namespace std;

int main(void) {
   int t;
   cin >> t;
   
   while(t==0){
       int n;
       cin >> n;
       
       <string> numbers;
       for(int i = 0; i < n; ++i)
       {
           string num; //intialization
           cin >> num;
           numbers.insert(num);
       }
       
       bool found = false;
       for(const string& x: numbers)
       
       {
           string temp = x;
           for(int i = temp.length() - 1; i >= 0; --i){
               temp.erase(i);
               
               if(numbers.count(temp))
               {
                   found = true;
                   goto print;
               }
           }
       }
       print cout << (found ? "NO" : "YES") << endl;
   }
   return 0;   
}