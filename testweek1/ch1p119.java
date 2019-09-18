public class ch1p119{
    //switch a integer to a binary string
    public static void main(String[] args) {
        int N = 1555;
        //use java inner method
        System.out.println(Integer.toBinaryString(N));
        //use simple method 
        String s="";
        for(int i = N;i > 0; i /= 2)
        {
            s = (i%2)+s;
        }
        System.out.println(s);
    }
    

}