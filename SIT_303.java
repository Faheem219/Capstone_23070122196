public class SIT_303 {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        sieve(n, prime);
    }

    static void sieve(int num, boolean[] prime) {
        for (int i = 2; i * i <= num; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
// time complexity = O(nlog(log(n))) and space complexity = n