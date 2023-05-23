import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n");
        Scanner scanner = new Scanner(System.in);

        String PythagroeanTheoremInfo = "The Pythagorean theorem, named after the ancient Greek mathematician Pythagoras, dates back to around 500 BCE and is one of the earliest known mathematical principles that continue to be widely used in various fields today.";
        String QuadraticFormulaInfo = "The quadratic formula, which enables the solution of quadratic equations, has its origins in ancient Babylonian and Greek mathematics. While its precise origin and development are not attributed to a specific individual, it has been a fundamental tool in mathematics for centuries.";


        System.out.print("Do you want to use the Pythagorean Theorem (1) or the Quadratic Formula (2)\nAnswer 1 or 2: ");
        boolean isPythagoreanTheorem;

        // Use ternary operator to write a quick if statement on which equation to do
        byte numberSent = scanner.nextByte();
        isPythagoreanTheorem = (numberSent == 1) ? true : false;

        if (isPythagoreanTheorem == true) {
            // User wants to do the pythagorean theorem
            System.out.println("You selected the Pythagorean Theorem.");
            System.out.println(PythagroeanTheoremInfo + "\n");

            // Request all variables
            System.out.println("Given a triangle has sides a, b, and c,");
            System.out.print("Input side a: ");
            float sideA = scanner.nextFloat();

            System.out.print("Input side b: ");
            float sideB = scanner.nextFloat();

            // Do pythagorean theorem, and return c value

            double sideC = Math.sqrt(((sideA*sideA) + (sideB*sideB)));
            System.out.println("Side c: " + sideC);
        } else {
            // User wants to do the quadratic formula
            System.out.println("You selected the Quadratic Formula.");
            System.out.println(QuadraticFormulaInfo + "\n");
            
            // Request all variables
            System.out.println("Given ax^2 + bx + c = 0,");
            System.out.print("Input variable a: ");
            float variableA = scanner.nextFloat();

            System.out.print("Input variable b: ");
            float variableB = scanner.nextFloat();

            System.out.print("Input variable c: ");
            float variableC = scanner.nextFloat();

            // Do the quadratic formula (two equations because of ±)
            double answerA = (-variableB + Math.sqrt(variableB * variableB - 4 * variableA * variableC)) / (2 * variableA);
            double answerB = (-variableB - Math.sqrt(variableB * variableB - 4 * variableA * variableC)) / (2 * variableA);

            // Return both values
            System.out.println("Roots: " + answerA + ", " + answerB);

        }

        scanner.close();
    }
}