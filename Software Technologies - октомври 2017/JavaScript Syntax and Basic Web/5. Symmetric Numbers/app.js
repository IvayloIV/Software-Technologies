function number(n) {

    isSemetric(n);

    function isSemetric(n) {
        var resul = "";        
        for (var i = 1; i <= n; i++) {
            var isSim = true;
            var currentNumber = i.toString();
            if (currentNumber.length == 1) {
                resul += currentNumber + " ";
            }
            else
            {
                for (var k = 0; k < currentNumber.length / 2; k++) {
                    if (currentNumber[k] != currentNumber[currentNumber.length - 1 - k])
                    {
                        isSim = false;
                    }
                }
                if (isSim === true)
                {
                    resul += currentNumber + " ";
                }
            }
        }
        console.log(resul);
    }

}
number(['750']);