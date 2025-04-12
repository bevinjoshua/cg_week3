import java.util.*;
public class DataStructureSearchComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int val = rand.nextInt(n * 10);
            array[i] = val;
            hashSet.add(val);
            treeSet.add(val);
        }
        int target = array[rand.nextInt(n)];
        long start = System.nanoTime();
        boolean foundArray = false;
        for (int val : array) {
            if (val == target) {
                foundArray = true;
                break;
            }
        }
        long end = System.nanoTime();
        double arrayTime = (end - start) / 1e6;
        start = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        end = System.nanoTime();
        double hashTime = (end - start) / 1e6;
        start = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        end = System.nanoTime();
        double treeTime = (end - start) / 1e6;
        System.out.println("Array Search Time: " + arrayTime + " ms");
        System.out.println("HashSet Search Time: " + hashTime + " ms");
        System.out.println("TreeSet Search Time: " + treeTime + " ms");
    }
}
