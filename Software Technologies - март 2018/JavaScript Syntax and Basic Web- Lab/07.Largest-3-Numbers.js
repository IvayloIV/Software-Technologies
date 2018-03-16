function solve(arr) {
    arr = arr.map(Number).sort((a, b) => b - a);
    console.log(arr.slice(0, 3).join('\n'));
}
solve([`10`, `30`]);