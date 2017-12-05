
<?PHP
if (isset(($_GET['person']))){
$namea = htmlspecialchars($_GET['person']);
echo "Hello $namea!";
}
else{
?>
<form>
Name: <input type="text" name= "person" />
<input type="submit" />
</form>
<?PHP
}
?>