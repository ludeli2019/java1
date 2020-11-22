public class prime_num {
    public static void main (String  [] args) {
//  找出101~200的质数 首先质数i都是非偶数，所以i从101开始以2递增；其次，j从3开始去整除这些数，也是以2递增；这些质数的因数最小是3，所以j从3开始，最大只需要遍历到(1/3)*i即可。
        for (int i=101;i<200;i+=2) {
            boolean f=true;
            for (int j=3;j<=(1f/3f)*i;j+=2) {
                if (i % j == 0) {
                    f = false;
                    break;
                }
            }
                if (!f) {
                    continue;
                }
            System.out.println(i+"是质数");
        }
    }
}
