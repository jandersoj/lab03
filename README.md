#HEADER HERE 

Find All Duplicates
Write a function (or static method in the case of Java) that accepts 
a list of integers and returns a list of only those integers that appear 
more than once.

-done in java and python directories-


Describe Different Approaches to Solving This Problem
Describe the two different ways to figure out all of the duplicate values 
of a list of integers in english. The first solution is the nested loop 
solution. The second solution is to use a dictionary or a map 
(similar to the containsPair method we wrote in class. 
Describe both in as much detail as you can (with no code) 
and describe the trade-offs between the two solutions.

1. the nested loop method, as shown in our python and java code.
We iterate over the list, and at each index compare the value to 
each other value between it and the end of the list. I'm not going
to describe the logic of only comparing to some of the other values
as you go down the list, but know that it works and every combination
gets checked. When we reach a duplicate, we placa that value in another
list containing all of the values that show up in the list more than
once. We return that list. 

 
2. the map method.I remain slightly bewildered by maps, but not to fret.
Basically, we start with a list to be checked and an empty hashmap.
The example in the slides returns a boolean, but you could easily do as 
in the first method and add each duplicate value to another list.
As we iterate through the list, we check to see if our hashmap contains a key 
for the value that we are currently "at". If it does, it returns true/adds to
a list of duplicates. 
If it doesn't, the value is not in our map of values so far, and we add it
to be compared to all following values in the list. If we get the end 
with no duplicates, it returns false/a list of none.

In comparing methods, our biggest concern is usually time complexity. 
The nested loop method has a complexity of O(n^2), and I think the map method 
is O(n) in the best case (O(n) for the loop and O(1) for s.containsKey) or
O(n^2) in the worst (O(n) for both). Re:complexity, the map method is likely better.
A drawback to the map method is also that it requires other libraries, and 
may be harder to implement for a beginner. If you're going for minimalism, 
it might not be the right choice. However, I also think it's prettier and a 
little more straightforward if you know what's going on. 


