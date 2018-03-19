function solve(arr) {
    let n = arr.shift();
    let mainArr = [];
    for (let i = 0; i < n; i++) {
        mainArr.push(0);
    }
    for (let element of arr) {
        let tokens = element.split(' - ').map(Number);
        mainArr[tokens[0]] = tokens[1];
    }
    return mainArr.join('\n');
}

console.log(solve([`5`,
    `0 - 3`,
    `3 - -1`,
    `4 - 2`]));