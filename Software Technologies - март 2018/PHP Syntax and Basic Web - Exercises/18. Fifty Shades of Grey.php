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
<?php
for($row = 0; $row < 255; $row += 51){
    for($cow = $row; $cow < $row + 50; $cow += 5){
        echo "<div style='background-color: rgb($cow, $cow, $cow)'></div>";
    }
    echo '</br>';
}
?>
</body>
</html>