package collection;
import java.util.Scanner;

public class Austism_and_ADHD {
    static String[] autismQ = {
            "Social interactions difficult?", "Strong interest in specific topics?",
            "Changes in routine distressing?", "Struggle with understanding emotions?",
            "Prefer repetitive behaviors?"
    };

    static String[] adhdQ = {
            "Trouble focusing?", "Forget important tasks?",
            "Feel restless often?", "Difficulty staying organized?",
            "Struggle with impulse control?"
    };

    static double fuzzify(int input) {
        return (input - 1) / 4.0;
    }

    static double[] askQuestions(String[] questions, Scanner scanner) {
        double[] inputs = new double[questions.length];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + "\n1. Never  2. Rarely  3. Sometimes  4. Often  5. Always");

            int response = 0;
            while (true) {
                if (scanner.hasNextInt()) {
                    response = scanner.nextInt();
                    if (response >= 1 && response <= 5) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }

            inputs[i] = fuzzify(response);
        }
        return inputs;
    }

    static void evaluate(double autismProb, double adhdProb) {
        System.out.println("\n--- Screening Results ---");
        System.out.printf("Autism Probability: %.2f%%\n", autismProb * 100);
        System.out.printf("ADHD Probability: %.2f%%\n", adhdProb * 100);

        System.out.println(autismProb > 0.7 ? "High Autism Traits. Consider assessment."
                : autismProb > 0.4 ? "Moderate Autism Traits. Further evaluation recommended."
                : "Minimal Autism Traits.");

        System.out.println(adhdProb > 0.7 ? "High ADHD Traits. Consider assessment."
                : adhdProb > 0.4 ? "Moderate ADHD Traits. Further evaluation recommended."
                : "Minimal ADHD Traits.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Soft Computing-Based Autism & ADHD Test\nAnswer honestly.");

        double autismProb = calculateProbability(askQuestions(autismQ, scanner));
        double adhdProb = calculateProbability(askQuestions(adhdQ, scanner));

        evaluate(autismProb, adhdProb);
        scanner.close();
    }

    static double calculateProbability(double[] inputs) {
        double sum = 0;
        for (double value : inputs) {
            sum += value;
        }
        return sum / inputs.length;
    }
}


