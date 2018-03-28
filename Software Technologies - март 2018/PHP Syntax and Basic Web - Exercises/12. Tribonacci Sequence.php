<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if(isset($_GET['num'])){
        $num = intval($_GET['num']);
        $num1 = 0;
        $num2 = 0;
        $num3 = 1;
        while ($num-- != 0){
            echo $num3 . ' ';
            $temp = $num3;
            $num3 += $num1 + $num2;
            $num1 = $num2;
            $num2 = $temp;
        }
    }
    ?>
</body>
</html>