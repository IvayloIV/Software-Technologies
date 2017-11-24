function solve(arr) {
    for (current of arr)
    {
        if (current == "Stop") {
            return;
        }
        else
        {
            console.log(current);
        }
    }
}
solve([
    'Line 1',
    'Line 2',
    'Line 3',
    'Stop',
    'Line 4'
]);