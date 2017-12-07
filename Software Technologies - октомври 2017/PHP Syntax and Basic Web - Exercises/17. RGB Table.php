<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
<?PHP
 for ($n = 51; $n <= 255; $n +=51){
	 echo "<tr>
	 <td style='background-color:rgb($n, 0, 0)'></td>
	 <td style='background-color:rgb(0, $n, 0)'></td>
	 <td style='background-color:rgb(0, 0, $n)'></td>
	 </tr>";
 }
?>
</table>
</body>
</html>