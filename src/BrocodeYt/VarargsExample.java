package BrocodeYt;

public class VarargsExample {
    //... called as ellipsis
    public static int add(int... numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }

    static void main() {
        System.out.println(add(2,3,4,5));
    }
}
