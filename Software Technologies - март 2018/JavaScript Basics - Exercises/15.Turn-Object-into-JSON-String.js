function solve(arr) {
    let book = {};
    arr.forEach((e) => {
        let token = e.split(' -> ');
        if (token[0] === "age" || token[0] === "grade"){
            book[token[0]] = Number(token[1]);
        } else {
            book[token[0]] = token[1].toString();
        }
    });
    return JSON.stringify(book);
}

console.log(solve([`name -> Angel`,
    `surname -> Georgiev`,
    `age -> 20`,
    `grade -> 6.00`,
    `date -> 23/05/1995`,
    `town -> Sofia`]));