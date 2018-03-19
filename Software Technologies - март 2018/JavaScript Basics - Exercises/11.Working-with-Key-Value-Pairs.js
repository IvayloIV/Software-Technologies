function solve(arr) {
    let neededTokens = arr.pop();
    let book = new Map();
    for (let element of arr) {
        let tokens = element.split(' ');
        book.set(tokens[0], tokens[1]);
    }
    let helper = [...book].filter(a => a[0] === neededTokens);
    helper.length === 0 ? console.log(`None`) : console.log(helper[0][1]);
}
solve([`3 test`,
`3 test1`,
`4 test2`,
`4 test3`,
`4 test5`,
`4`]);