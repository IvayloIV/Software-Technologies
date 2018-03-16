function solve(nums) {
    [num1, num2] = nums.map(Number);
    return num1 + num2;
}

console.log(solve(['3', '2']));