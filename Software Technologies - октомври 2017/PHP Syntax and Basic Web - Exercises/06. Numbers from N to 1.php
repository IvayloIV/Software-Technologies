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
		$steck = [];
		
		for ($n = $num; $n >= 1; $n--){
			array_push($steck, $n);
		}
		echo implode(" ", $steck);
	}
	?>
</body>
</html>