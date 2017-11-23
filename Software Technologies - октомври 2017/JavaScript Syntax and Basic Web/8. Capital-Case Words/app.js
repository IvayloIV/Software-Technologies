function solve(arr) {
    var result = [];
    for (let item of arr)
    {
        let currentArr = item.split(/\W+/).filter(a => a !== '');

        for (let item2 of currentArr)
        {
            if (item2 == item2.toUpperCase())
            {
                result.push(item2);
            }
        }
    }
    console.log(result.join(', '));
}
solve([
    'We start by HTML, CSS, JavaScript, JSON and REST.',
    'Later we touch some PHP, MySQL and SQL.',
    'Later we play with C#, EF, SQL Server and ASP.NET MVC.',
    'Finally, we touch some Java, Hibernate and Spring.MVC.'
]);