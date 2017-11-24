function solve(arr) {
    let currentArr = new Array(Number(arr[0]));

    for (var i = 1; i < arr.length; i++) {
        let command = arr[i].split(' - ');
        currentArr[Number(command[0])] = Number(command[1]);
    }

    for (var i = 0; i < currentArr.length; i++) {
        if (currentArr[i] === undefined) {
            console.log('0');
        }
        else {
            console.log(currentArr[i]);
        }
    }
}
solve([
    '3',
    '0 - 5',
    '0 - 4',
    '1 - 3'
]);