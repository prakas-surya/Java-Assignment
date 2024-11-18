class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        if (
            !operation.equals("+") &&
            !operation.equals("*") &&
            !operation.equals("/")
        ) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        
        try {
            switch (operation) {
                case "+" -> {
                    return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                }
                
                case "*" -> {
                    return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                }
                
                case "/" -> {
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                }
                
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        
    }
}