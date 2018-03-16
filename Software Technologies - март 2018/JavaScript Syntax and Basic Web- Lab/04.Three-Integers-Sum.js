function solve(str) {
    let [num1, num2, num3] = str[0].split(' ').map(Number);
    if (num1 + num2 === num3){
        return printResult(num1, num2, num3);
    } else if (num1 + num3 === num2){
        return printResult(num1, num3, num2);
    } else if (num2 + num3 === num1){
        return printResult(num2, num3, num1);
    } else {
        return 'No';
    }
    function printResult(num1, num2, num3) {
        return `${Math.min(num1, num2)} + ${Math.max(num1, num2)} = ${num3}`;
    }
}

console.log(solve(['8 15 7']));