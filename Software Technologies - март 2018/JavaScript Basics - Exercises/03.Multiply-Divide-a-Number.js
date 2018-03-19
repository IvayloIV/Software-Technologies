function solve(arr) {
    arr = arr.map(Number);
    return arr[1] >= arr[0] ? arr[1] * arr[0] :arr[0] / arr[1];
}

console.log(solve([`3`, '2']));