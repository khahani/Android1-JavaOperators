/**
 * Developer and Teacher: Khahani.com
 * Course: Android 1
 */

public class Khahani {
    public static void main(String[] args) {

        int a = 1;

        System.out.println(a + 1);
        System.out.println(a - 2);
        System.out.println(a * 3);
        System.out.println(a / 4);
        System.out.println(a % 2);

        a = a + 1;
        a++;
        a--;

        a = a + 3;
        a+=3;
        a-=3;
        a*=3;
        a/=3;
        a%=3;

        // Calculate area of a rectangle
        int width, height;
        width = 4;
        height = 2;

        int rectangleArea = width * height;
        System.out.println(rectangleArea);

        // Take a look at this tip
        System.out.print("Tip: ");
        System.out.println(width + height);

        System.out.println("Tip: " + width + height);

    }
}
