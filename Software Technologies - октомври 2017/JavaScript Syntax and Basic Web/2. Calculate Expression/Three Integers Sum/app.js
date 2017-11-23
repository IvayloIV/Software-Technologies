function solve([input]) {
    let arr = input.split(' ');
    let a = Number(arr[0]);
    let b = Number(arr[1]);
    let c = Number(arr[2]);

    if (a + b == c) {
        if (a <= b) {
            console.log(`${a} + ${b} = ${c}`);
        }
        else if (b <= a) {
            console.log(`${b} + ${a} = ${c}`);
        }
    }
    else if (a + c == b)
    {
        if (a <= c) {
            console.log(`${a} + ${c} = ${b}`);
        }
        else if (c <= a) {
            console.log(`${c} + ${a} = ${b}`);
        }
    }
    else if (b + c == a) {
        if (b <= c) {
            console.log(`${b} + ${c} = ${a}`);
        }
        else if (c <= b) {
            console.log(`${c} + ${b} = ${a}`);
        }
    }
    else {
        console.log('No');
    }
}
solve(['-30 -10 -20']);