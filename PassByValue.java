public class PassByValue{

    public int increment (int x ) {
        System.out.println("Number passed: " + x);
        int increasedNum = x + 1;
        
        return increasedNum;
    }
    
    public static void main(String[] args) {
        PassByValue p1 = new PassByValue();
        p1.increment(5);
        System.out.println("Number increased: " + p1.increment(5));

    }
    
}