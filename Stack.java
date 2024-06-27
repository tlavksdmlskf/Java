import java.util.Stackl
\  

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Stack<Integer> stack = new Stack<>();
  StringBuffer bf = new StringBuffer();
  int n = sc.nextInt();
  int[] A = new int[n];
  boolean result = true;
  int num = 1;
  
  for (int i = 0 ; i < n ; i++) {
    A[i] = sc.nextInt();
  }
  for (int i = 0 ; i < A.length; i++) {
    int su = A[i];
    if(su >= num) {
      while (su >= num) {
        stack.push(num++);
        bf.append('+');
      }
      stack.pop();
      bf.append("-");
    }else {
      int p = stack.pop();
      if(p != su) {
        System.out.println("no");
        result = false;
        break;
      }
      bf.append("-");
    }
  }
  if(result) System.out.println(bf.toString());
}
