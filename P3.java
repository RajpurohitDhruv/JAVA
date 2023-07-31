import java.util.Random;

public class P3 {
    public static void main(String[] args) {
	System.out.println("====================================");
		System.out.println("Name: "+ "Dhruv");
		System.out.println("Enrollment Number: "+ "210210107061");
		System.out.println("Date: "+ new java.util.Date());
		System.out.println("Practical: "+"2");
		System.out.println("==================");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            String plate = generatePlate(rand);
            System.out.println(plate);
        }
    }

    public static String generatePlate(Random rand) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] plateLetters = new char[3];
        for (int i = 0; i < 3; i++) {
            plateLetters[i] = letters.charAt(rand.nextInt(letters.length()));
        }
        int digits = rand.nextInt(10000);
        return String.format("%s-%04d", new String(plateLetters), digits);
    }
}
