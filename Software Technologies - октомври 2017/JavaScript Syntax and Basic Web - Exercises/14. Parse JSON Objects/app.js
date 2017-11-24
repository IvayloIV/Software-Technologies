function solve(arr) {
    for (var i = 0; i < arr.length; i++) {
        let pp = JSON.parse(arr[i]);
        console.log('Name: ' + pp['name']);
        console.log('Age: ' + pp['age']);
        console.log('Date: ' + pp['date']);
    }
}
solve([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);