function solve(arr) {
    var book = arr.map(JSON.parse);
    var sum = {};

    for (let item of book) {
        if (item.town in sum) {
            sum[item.town] += item.income;
        }
        else {
            sum[item.town] = item.income;
        }
    }
    let towns = Object.keys(sum).sort();

    for (let item of towns)
    {
        console.log(`${item} -> ${sum[item]}`);
    }

}
solve([
 '{ "town": "Sofia", "income": 200 }',
'{ "town": "Varna", "income": 120 }',
'{ "town": "Pleven", "income": 60 }',
'{ "town": "Varna", "income": 70 }'
]);

