function sumNumbers() {
    let sum = Number(document.getElementById("num1").value) + Number(document.getElementById("num2").value);
    document.getElementById("result").innerHTML = sum;
}