class Fraction    
{             
  // Data members           
  private:             
   int numer;                         
   int denom;      

  // Public member functions                     
  public:                                                            
    // Constructors            
    Fraction (int num, int den);                
    Fraction ();                                   
        
    Fraction (const Fraction& fract);   
    ~Fraction ();                                 

    // Accessors  
    int getNumer () const;                    
    int getDenom () const;                    
    void print () const;                         

    // Mutators
    void setNumer (int num);                
    void setDenom (int den);

    Fraction& multiplyFract(const Fraction& ftest); 

  // Helping private member functions
  private:
    void normalize ();
    int gcd (int n, int m); 
};