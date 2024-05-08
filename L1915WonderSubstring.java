public class L1915WonderSubstring {

  public long wonderfulSubstrings(String word) {
    long ans = 0;
    int prefix = 0; // the binary prefix
    int[] count = new int[1024]; // the binary prefix count
    count[0] = 1; // the empty string ""

    for (final char c : word.toCharArray()) {
      prefix ^= 1 << c - 'a';
      // All the letters occur even number of times.
      ans += count[prefix];
      // ('a' + i) occurs odd number of times.
      for (int i = 0; i < 10; ++i)
        ans += count[prefix ^ 1 << i];
      ++count[prefix];
    }

    return ans;
  }
  public static void main(String[] args) {
    L1915WonderSubstring l = new L1915WonderSubstring();
    System.out.println(l.wonderfulSubstrings("aba"));
    System.out.println(l.wonderfulSubstrings("aabb"));
  }
}
