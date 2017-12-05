<form>
Name:
<div><input type="text" name="person" /></div>
Age:
<div><input type="number" name="age" /></div>
    <div>Town:</div>
<select name="townId">
        <option value="10">Sofia</option>
        <option value="20">Varna</option>
        <option value="30">Plodvid</option>
    </select>
    <div><input type="submit"/></div>
</form>

<?PHP
echo var_dump($_GET);
?>