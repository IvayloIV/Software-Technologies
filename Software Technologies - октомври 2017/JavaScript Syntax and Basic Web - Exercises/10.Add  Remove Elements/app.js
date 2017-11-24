function solve(arr) {
    let currentArr = [];

    for (item of arr) {
        let currentItem = item.split(' ');

        if (currentItem[0] == 'add') {
            currentArr.push(Number(currentItem[1]));
        }
        else if (currentItem[0] == 'remove') {
            currentArr.splice(Number(currentItem[1]), 1);
        }
    }

    console.log(currentArr.join('\n'));
}
solve([
    'add 3',
    'add 5',
    'remove 1',
    'add 2'
]);