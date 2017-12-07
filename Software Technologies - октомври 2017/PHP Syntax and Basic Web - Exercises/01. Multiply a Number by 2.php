<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
	<?PHP
if (isset($_GET['num'])){
	$num1 = intval($_GET['num']) * 2;
	echo "$num1";
}
?>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
</body>
</html>