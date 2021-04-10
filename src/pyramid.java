/*pattern to created:
 *
 *          *
 * *
 * * *
 * * * *
 * * * * *
 */

public class pyramid {
    public static void main(String[] args) {
        pyramid();
    }


    public static void pyramid() {

        String star = "*";
        System.out.println("Pyramid pattern");

        for (int i = 0; i <4; i++) {
            System.out.println(" "+star);
            for (int j = 0; j <=i; j++) {
                System.out.print(" "+star+"  ");

            }
        }
        System.out.print(" "+star);
    }
}
