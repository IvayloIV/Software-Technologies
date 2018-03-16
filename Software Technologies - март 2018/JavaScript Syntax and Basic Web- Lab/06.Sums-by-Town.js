function solve(arr) {
    arr = arr.map(a => JSON.parse(a));
    let towns = {};
    for (let element of arr) {
        if (!towns.hasOwnProperty(element.town)){
            towns[element.town] = 0;
        }
        towns[element.town] += Number(element.income);
    }
    for (let obj of Object.entries(towns).sort((a, b) => a[0].localeCompare(b[0]))) {
        console.log(`${obj[0]} -> ${obj[1]}`);
    }
}
solve([`{"town":"Sofia","income":200}`,
`{"town":"Varna","income":120}`,
`{"town":"Pleven","income":60}`,
`{"town":"Varna","income":70}`]);