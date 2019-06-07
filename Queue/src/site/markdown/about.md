<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>About Queue</title>
</head>
<body>
    <h1>About the queue</h1>
    <p>The queue is like an ArrayList. The first element added to the queue is the first element removed from the queue. This program can work with String values and 
    integer values.</p>
    <h3>Functions</h3>
    <ul>
        <li>
            <div>
                <h6>offer</h6>
                <p>This method adds an element to the queue.</p>
            </div>
        </li>
        <li>
            <div>
                <h6>poll</h6>
                <p>This method returns the head element and also deletes it.</p>
            </div>
        </li>
        <li>
            <div>
                <h6>remove</h6>
                <p>This method returns the head element and deletes it like poll but with a small difference - this method throws a NoSuchElementException if the queue is empty.</p>
            </div>
        </li>
        <li>
            <div>
                <h6>peek</h6>
                    <p>This method returns the head element but it does not delete it.</p>
            </div>
        </li>
        <li>
            <div>
                <h6>element</h6>
                <p>This method works similar to peek but with a small difference - it returns but does not delete the element and throws a NoSuchElementException when the queue is empty.</p>
             </div>
        </li>                
    </ul>
</body>
</html>