class EvenDigitSum{
public static void main(String[] args) {
     int sum, lastDigit;
     for(sum=0; number!=0; number/=10){
         lastDigit = number%10;
         if(lastDigit % 2 == 0)
             sum += lastDigit;
     }
     return sum;
 }}