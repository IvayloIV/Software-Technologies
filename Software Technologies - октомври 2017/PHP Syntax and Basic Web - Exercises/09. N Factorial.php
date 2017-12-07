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
		$sum = 1;
		
		for ($n = 1; $n <= $num; $n++){
			$sum *= $n;
		}
		echo $sum;
	}
	?>
</body>
</html>