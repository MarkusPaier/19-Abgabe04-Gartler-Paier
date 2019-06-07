#About the queue

The queue is like an ArrayList. A new element will be added to the end of the queue. 
When deleting, the first element is removed from the queue. (FIFO)
This program can work with String values and Integer values.

####Functions
* **offer**
<br/>This method adds an element to the queue.

* **poll**
<br/>This method returns the head element and also deletes it.

* **remove**
<br/>This method returns the head element and deletes it like poll but with a small difference - this method throws a 
NoSuchElementException if the queue is empty.

* **peek**
<br/>This method returns the head element but it does not delete it.

* **element**
<br/>This method works similar to peek but with a small difference - it returns but does not delete the element 
and throws a NoSuchElementException when the queue is empty.