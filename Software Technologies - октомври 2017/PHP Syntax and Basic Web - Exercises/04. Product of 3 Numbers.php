<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        X: <input type="text" name="num1" />
		Y: <input type="text" name="num2" />
        Z: <input type="text" name="num3" />
		<input type="submit" />
    </form>
    <?PHP
	 if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])){
		 $negative = 0;
		 $positive = 0;
		 if (intval($_GET['num1']) == 0 || intval($_GET['num2']) == 0 || intval($_GET['num3']) == 0){
			 echo "Positive";
			 return;
		 };
		 
		 if (intval($_GET['num1']) < 0){
			 $negative++;
		 }else {
			 $positive++;
		 };
		 
		 if (intval($_GET['num2']) < 0){
			 $negative++;
		 }else {
			 $positive++;
		 };
		 
		 if (intval($_GET['num3']) < 0){
			 $negative++;
		 }else {
			 $positive++;
		 };
		 
		 if ($negative == 1 || $negative == 3){
			 echo "Negative";
		 } else {
			 echo "Positive";
		 }
	 }
	?>
</body>
</html>