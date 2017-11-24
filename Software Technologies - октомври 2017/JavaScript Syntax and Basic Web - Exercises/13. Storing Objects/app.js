function solve(arr) {
    let obj = {};
    for (var i = 0; i < arr.length; i++) {
        let currentArr = arr[i].split(' -> ');
        obj[currentArr[0]] = { age: currentArr[1], grade: currentArr[2] };
    }

    for (let item in obj) {
        console.log(`Name: ${item}`);
        console.log(`Age: ${obj[item]['age']}`);
        console.log(`Grade: ${obj[item]['grade']}`);
    }
}
solve([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);