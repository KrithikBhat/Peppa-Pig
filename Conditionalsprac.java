public class Conditionalsprac {
    public static void main(String[] args) {
        double x = 1500;

        if (x < 100){
            x += 50;
        }
        else if (x > 100){
            x /= 20;
        }

        System.out.println(x);
    };
};
