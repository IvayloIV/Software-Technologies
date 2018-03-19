function solve(arr) {
    let mainArr = [];
    for (let element of arr) {
        let tokens = element.split(' ');
        if (tokens[0] === "add"){
            mainArr.push(Number(tokens[1]));
        } else {
            if (Number(tokens[1]) >= 0 && Number(tokens[1]) <= mainArr.length - 1){
                mainArr.splice(Number(tokens[1]), 1);
            }
        }
    }
    return mainArr.join('\n');
}

console.log(solve([`add 3`,
    `add 5`,
    `remove 2`,
    `remove 0`,
    `add 7`]));