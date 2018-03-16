function solve(n) {
    for (let i = 1; i <= n; i++) {
        let currentNumsStr = (i + '');
        if (currentNumsStr === [...currentNumsStr].reverse().join('')){
            console.log(i);
        }
    }
}
solve(750);