public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
        //System.out.println(a.length);
       // System.out.println(a[i]);
       // System.out.println(a[i+1]);
        if(i+1 == a.length || a.length == 0){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }
        return isSorted(a, i+1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2};
        System.out.println(isSorted(b)); // false

        int[] c = {};
        System.out.println(isSorted(c));

        int[] d = {1};
        System.out.println(isSorted(d));
    }
}


