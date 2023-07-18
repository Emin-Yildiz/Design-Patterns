public class Calculator {

    private static double firstNumber;
    private static double secondNumber;
    private static String operation;

    public static void calculate(String problem){
        parseProblem(problem);
        Process operations = OperationStrategy.findStrategy(operation);
        if (operations != null){
            System.out.println("Sonuç: " + String.valueOf(operations.calculate(firstNumber,secondNumber)));
        }else {
            System.out.println("Hatalı işlem girişi");
        }
    }

    private static void parseProblem(String problem) {
        String [] problemArray = problem.split(" ");
        firstNumber = Double.valueOf(problemArray[0]);
        operation = problemArray[1];
        secondNumber = Double.valueOf(problemArray[2]);
    }

}
