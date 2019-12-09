public class CompareLength {
    public static void main(String[]Args){
        // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print "p2 is longer" if `p2` has more elements than `p1`
        int p1 [] = {1,2,3};
        int p2 [] = {4,5};
         int p1length = p1.length;
         int p2length = p2.length;

         if (p1length<p2length){
             System.out.println("p2 has more elements than p1");
         }
         else {
             System.out.println("p1 has more elements.");
         }
    }
}
