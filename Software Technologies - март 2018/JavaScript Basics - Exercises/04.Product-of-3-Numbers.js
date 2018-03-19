function solve(arr) {
    arr = arr.map(Number);
    if (arr.some(a => a === 0)){
        return `Positive`;
    } else {
        let neg = 0;
        arr.forEach((e) => {
            if (e < 0) neg++;
        });
        return neg % 2 === 1 ? `Negative` : `Positive`;
    }
}

console.log(solve(['2', '1', '1']));