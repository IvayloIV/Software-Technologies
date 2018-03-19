function solve(arr) {
    let book = [];
    for (let element of arr) {
        let tokens = element.split(' -> ');
        book.push({
            Name : tokens[0],
            Age : tokens[1],
            Grade : tokens[2]
        });
    }
    book.forEach((e) => {
        console.log(`Name: ${e.Name}\nAge: ${e.Age}\nGrade: ${e.Grade}`);
    });
}
solve([`Pesho -> 13 -> 6.00`,
`Ivan -> 12 -> 5.57`,
`Toni -> 13 -> 4.90`]);