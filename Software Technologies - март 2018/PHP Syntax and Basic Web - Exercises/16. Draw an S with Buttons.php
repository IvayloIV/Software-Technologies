<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
function drawBlueFigure() {
    echo "<button style='background-color: blue'>1</button>";
}
for ($row = 0; $row < 9; $row++){
    for ($cow = 0; $cow < 5; $cow++){
        if ($row % 4 == 0){
            drawBlueFigure();
        } else if (($row < 4 && $cow == 0) || ($row > 4 && $cow == 4)) {
            drawBlueFigure();
        } else {
            echo "<button>0</button>";
        }
    }
    echo "</br>";
}
?>
</body>
</html>