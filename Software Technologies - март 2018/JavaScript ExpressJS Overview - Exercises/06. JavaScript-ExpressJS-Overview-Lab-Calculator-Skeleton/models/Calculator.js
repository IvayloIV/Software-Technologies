class Calculator {
    constructor(leftOperand, operand, rightOperand){
        this.leftOperand = leftOperand;
        this.operator = operand;
        this.rightOperand = rightOperand;
    }

    calculateResult(){
        let allFunct = {
            '+' : (a, b) => a + b,
            '-' : (a, b) => a - b,
            '*' : (a, b) => a * b,
            '/' : (a, b) => a / b,
            '^' : (a, b) => a ** b,
        };
        return allFunct[this.operator](this.leftOperand, this.rightOperand);
    }
}

module.exports = Calculator;