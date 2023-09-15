package by.tms.servlet;

import java.util.Optional;

public class Calculator {

    public Optional<Operation> calculate(Operation operation){
        switch (operation.getTypeOperation()) {
            case "sum":
                return Optional.ofNullable(operation.setResult(operation.getNum1() + operation.getNum2()));
            case "sub":
                return Optional.ofNullable(operation.setResult(operation.getNum1() - operation.getNum2()));
            case "mul":
                return Optional.ofNullable(operation.setResult(operation.getNum1() * operation.getNum2()));
            case "div":
                return Optional.ofNullable(operation.setResult(operation.getNum1() / operation.getNum2()));
        }
        return Optional.empty();
    }
}
