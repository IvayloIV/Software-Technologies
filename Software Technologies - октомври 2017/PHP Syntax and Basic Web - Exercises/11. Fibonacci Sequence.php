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
		$first = 1;
		$secound = 1;
		$arr = [];
		
		for ($n = 1; $n <= $num; $n++){
			if ($n == 1 || $n == 2){
				array_push($arr, 1);
			}else { 
			    $lastNum = 	$secound;
			    $secound = $first + $secound;
                $first = $lastNum;			
			   array_push($arr, $secound);
			}
		}
		echo implode(" ", $arr);
	}
	?>
</body>
</html>