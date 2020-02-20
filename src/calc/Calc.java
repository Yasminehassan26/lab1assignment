package calc;

public class Calc implements icalculator {

    int z;
    float k;

    @Override
    public int add(int x, int y) {
        z = x + y;
        return z;
    }

    @Override
    public float divide(int x, int y) {
        k = 0;
        if(y==0){
        throw new RuntimeException("Number cant be divided by zero");
        }
   else if (x==0){
return 0;    } 
    return (float)x/y;
    }

   }
