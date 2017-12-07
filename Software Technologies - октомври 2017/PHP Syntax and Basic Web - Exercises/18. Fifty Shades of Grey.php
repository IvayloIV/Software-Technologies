<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
<?PHP
for ($n = 0; $n <= 255; $n += 51){
	for ($t = 0; $t <= 45; $t += 5){
	$currentcolor = $n + $t;
	echo "<div style='background-color:rgb($currentcolor, $currentcolor, $currentcolor)'></div>";
}
?>
<br>
<?PHP
}
?>
</body>
</html>