function Calculator(leftOperand, operator, rightOperand){
	this.leftOperand = leftOperand;
	this.operator = operator;
	this.rightOperand = rightOperand;
	
	this.calculateResult = function(){
		let result = 0;
		
		if (this.operator == "+"){
			result = this.leftOperand + this. rightOperand;
		}
		else if (this.operator == "-"){
			result = this.leftOperand - this. rightOperand;
		}
		else if (this.operator == "*"){
			result = this.leftOperand * this. rightOperand;
		}
		else if (this.operator == "/"){
			result = this.leftOperand / this. rightOperand;
		}
		return result;
	}
}

module.exports = Calculator;