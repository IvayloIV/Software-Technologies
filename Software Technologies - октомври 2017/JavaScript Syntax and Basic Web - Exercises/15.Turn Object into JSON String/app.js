function solve(arr) {
    let obj = {}; 
    for (var i = 0; i < arr.length; i++) {
        let currentArray = arr[i].split(' -> ');
        var pp = currentArray[1];
        if (currentArray[0] == "age" || currentArray[0] == "grade")
        {
            pp = Number(currentArray[1]);
        }
        obj[currentArray[0]] = pp;
    }
    console.log(JSON.stringify(obj));
}
solve([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);