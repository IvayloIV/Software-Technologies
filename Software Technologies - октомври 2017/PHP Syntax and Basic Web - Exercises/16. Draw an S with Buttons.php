<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?PHP
for($n = 1; $n <= 5; $n++){
	?>
	<button style="background-color:blue">1</button>
	<?PHP
}
?>
<br>
<?PHP
for ($t = 1; $t <= 3; $t++){
	for($p = 1; $p <= 5; $p++){
		if ($p == 1){
	?>
	<button style="background-color:blue">1</button>
	<?PHP
		}else {
			?>
	<button>0</button>
	<?PHP
		}
}
?>
<br>
<?PHP
}
?>
<?PHP
for($n = 1; $n <= 5; $n++){
	?>
	<button style="background-color:blue">1</button>
	<?PHP
}
?>
<br>
<?PHP
for ($t = 1; $t <= 3; $t++){
	for($p = 1; $p <= 5; $p++){
		if ($p == 5){
	?>
	<button style="background-color:blue">1</button>
	<?PHP
		}else {
			?>
	<button>0</button>
	<?PHP
		}
}
?>
<br>
<?PHP
}
?>
<?PHP
for($n = 1; $n <= 5; $n++){
	?>
	<button style="background-color:blue">1</button>
	<?PHP
}
?>
</body>
</html>