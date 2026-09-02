bool isPerfectSquare(int num) 
{
    long x = 1;
    while (x * x < num) {
        x++;
    }
    if (x * x == num) {
        return true;
    }
    
    return false;
}