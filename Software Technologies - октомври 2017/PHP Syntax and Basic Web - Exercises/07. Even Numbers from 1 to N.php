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
		
		for ($n = 1; $n <= $num; $n++){
			if ($n % 2 == 0){
	           array_push($arr, $n);
			}
		}
		echo implode(" ", $arr);
	}
	?>
</body>
</html>