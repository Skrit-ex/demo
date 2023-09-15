package by.tms.servlet;


public class Operation {

    private double num1;
    private double num2;
    private String typeOperation;
    private double result;

    public Operation(double num1, double num2, String typeOperation) {
        this.num1 = num1;
        this.num2 = num2;
        this.typeOperation = typeOperation;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public double getResult() {
        return result;
    }

    public Operation setResult(double result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", typeOperation='" + typeOperation + '\'' +
                ", result=" + result +
                '}';
    }
}
