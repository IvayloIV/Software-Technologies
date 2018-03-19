function solve(arr) {
    arr.forEach((e) => {
        let helper = JSON.parse(e);
        console.log(`Name: ${helper.name}\nAge: ${helper.age}\nDate: ${helper.date}`);
    });
}
solve([`{"name":"Gosho","age":10,"date":"19/06/2005"}`,
`{"name":"Tosho","age":11,"date":"04/04/2005"}`]);