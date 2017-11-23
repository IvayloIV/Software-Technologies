function solve(arr) {
    console.log(arr.map(Number).sort((a, b) => b - a).slice(0, 3).join('\n'));
}
solve([
    '4',
    '5',
    '23',
    '-34',
    '-245',
    '52'
]);