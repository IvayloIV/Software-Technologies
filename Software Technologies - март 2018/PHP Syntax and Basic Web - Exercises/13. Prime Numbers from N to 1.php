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
    function isPrime($i){
        for($p = $i - 1; $p > 1; $p--){
            if($i % $p == 0){
                return false;
            }
        }
        return true;
    }
    if(isset($_GET['num'])){
        $num = intval($_GET['num']);
        for($i = $num; $i > 1; $i--){
            if(isPrime($i)){
                echo $i . ' ';
            }
        }
    }
    ?>
</body>
</html>