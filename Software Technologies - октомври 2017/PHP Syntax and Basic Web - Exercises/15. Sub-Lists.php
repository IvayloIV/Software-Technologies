<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num1" />
        M: <input type="text" name="num2" />
        <input type="submit" />
    </form>
	<ul>
        <?PHP
		if (isset($_GET['num1']) || isset($_GET['num2'])){
			$num1 = intval($_GET['num1']);
			$num2 = intval($_GET['num2']);
			for ($n = 1; $n <= $num1; $n++){
			?>
			<li>List <?PHP
			echo $n;
			?>
			<ul>
			<?PHP
			for ($p = 1; $p <= $num2; $p++){
				?><li><?PHP
				echo "Element " . $n . "." . $p;
				?></li><?PHP
			}
			?>
			</ul>
			</li>
			<?PHP
			}
		}
         ?>		
	</ul>
</body>
</html>