let powTwoNumbers = (arr) => {
    arr = arr.map(Number);
    return arr[0] * arr[1];
};
console.log(powTwoNumbers(['2', '5']));