function solve(arr) {
    let positive = 0;
    let negative = 0;

    var firstNumber = arr[0] >= 0 ? positive++ : negative++;
    var secondNumber = arr[1] >= 0 ? positive++ : negative++;
    var thirdNumber = arr[2] >= 0 ? positive++ : negative++;

    if (negative == 1 || negative == 3) {
        console.log('Negative');
    } else {
        console.log('Positive');
    }
}
solve([
    '-5',
    '-4',
    '-6'
]);