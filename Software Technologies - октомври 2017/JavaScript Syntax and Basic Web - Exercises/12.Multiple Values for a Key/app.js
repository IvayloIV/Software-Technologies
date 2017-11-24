function solve(arr) {
    let obj = {};
    for (var i = 0; i < arr.length - 1; i++) {
        let currentArr = arr[i].split(' ');
        if (currentArr[0] in obj) {
            obj[currentArr[0]].push(currentArr[1]);
        } else {
            obj[currentArr[0]] = [currentArr[1]];
        }

    }

    var isAnyHere = false;
    for (let item in obj) {
        if (item == arr[arr.length - 1]) {
            console.log(obj[item].join('\n'));
            isAnyHere = true;
        }
    }

    if (!isAnyHere) {
        console.log('None');
    }
}
solve([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);