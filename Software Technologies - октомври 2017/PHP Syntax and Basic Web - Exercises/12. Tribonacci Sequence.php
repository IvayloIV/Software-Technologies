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
		$first = 0;
		$secound = 0;
		$thred = 1;
		$arr = [];
		
		array_push($arr, $thred);
		for ($n = 1; $n < $num; $n++){
			$firstOne = $secound;
			$secoundOne = $thred;
			$thred = $first + $secound + $thred;
			$first = $firstOne;
			$secound = $secoundOne;
			array_push($arr, $thred);
		}
		echo implode(" ", $arr);
	}
	?>
</body>
</html>