interface test{
     int square(int n);
}

// implementing test;
class arithmatic implements test{
    @Override
    public int square(int n){
        return n*n;
    }
}