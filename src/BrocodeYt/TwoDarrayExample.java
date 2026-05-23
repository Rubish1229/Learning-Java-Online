package BrocodeYt;

public class TwoDarrayExample {
    static void main() {
        char[][] tel={{'1','2','3'},
                        {'4','5','6'},
                            {'7','8','9'},
                                {'*','0','#'}};

        for(char[] num:tel){
            for(char dailPad:num){
                System.out.print(dailPad+" ");
            }
            System.out.println();
        }
    }
}
