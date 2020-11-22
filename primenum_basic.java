public class prime {
    public static void main (String  [] args) {
//  找出101~200的质数 基本解法：i从101开始递增；其次，j从2开始去整除这些数，j逐渐递增。
        for (int i=101;i<200;i++) {
            boolean f=true;
            for (int j=2;j<i;j++) {
                if (i%j==0) {
                    f=false;
                    break;
                }
                if (!f) {
                    continue;
                }
            }
            System.out.println(i+"是质数");
        }
    }
}