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
	<?PHP
	if (isset($_GET['num'])){
		$num = intval($_GET['num']);
		$arr = [];
		
		for ($n = $num; $n > 1; $n--){
			$isPrime = true;
			for ($p = 2; $p < $n; $p++){
				if ($n % $p == 0){
					$isPrime = false;
					break;
				}
			}
			if ($isPrime == true){
				array_push($arr, $n);
			}
		}
		echo implode(" ", $arr);
	}
	?>
</body>
</html>