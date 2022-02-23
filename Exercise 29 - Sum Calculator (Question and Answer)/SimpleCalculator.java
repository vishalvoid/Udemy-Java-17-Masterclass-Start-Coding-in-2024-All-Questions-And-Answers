public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubstractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplication(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else return firstNumber / secondNumber;
    }
}
class main{
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(20);        calculator.setSecondNumber(125);
        System.out.println("Addition : "+ calculator.getAdditionResult());
        System.out.println("substraction" + calculator.getSubstractionResult());
        calculator.setSecondNumber(0);
        calculator.setFirstNumber(5);
        System.out.println("Multiplication" + calculator.getMultiplication());
        System.out.println("Division" + calculator.getDivisionResult());
        calculator.setSecondNumber(2);
        System.out.println("Division 2: " + calculator.getDivisionResult());
    }
}

// Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
// Write the following methods (instance methods):
// *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
// *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
// *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
// *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
// *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
// *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
// *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
// *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
// TEST EXAMPLE
// TEST CODE:
// SimpleCalculator calculator = new SimpleCalculator();
// calculator.setFirstNumber(5.0);
// calculator.setSecondNumber(4);
// System.out.println("add= " + calculator.getAdditionResult());
// System.out.println("subtract= " + calculator.getSubtractionResult());
// calculator.setFirstNumber(5.25);
// calculator.setSecondNumber(0);
// System.out.println("multiply= " + calculator.getMultiplicationResult());
// System.out.println("divide= " + calculator.getDivisionResult());
// OUTPUT
// add= 9.0
// subtract= 1.0
// multiply= 0.0
// divide= 0.0
// TIPS:
// *add= 9.0 is printed because 5.0 + 4 is 9.0
// *subtract= 1.0 is printed because 5.0 - 4 is 1.0
// *multiply= 0.0 is printed because 5.25 * 0 is 0.0
// *divide= 0.0 is printed because secondNumber is set to 0
// NOTE: All methods should be defined as public NOT public static.
// NOTE: In total, you have to write 8 methods.
// NOTE: Do not add the main method to the solution code.
