# Selection Sort

### Logic

- Array : Better for Read.

- LinkedList: Better for Inserts and Delets.

### Exercises


### Give the run time for each of these scenarios in terms of Big O:

2.1 - ***Suppose you’re building an app to keep track of your finances.
Every day, you write down everything you spent money on. At the
end of the month, you review your expenses and sum up how much
you spent. So, you have lots of inserts and a few reads. Should you
use an array or a list?***

![Finance List](/src/assets/SelectionSort/2.1.png)

- **Answer: LinkedList because u need insert lots things**

2.2 - ***Suppose you’re building an app for restaurants to take customer
orders. Your app needs to store a list of orders. Servers keep adding
orders to this list, and chefs take orders off the list and make them.
It’s an order queue: servers add orders to the back of the queue, and
the chef takes the first order off the queue and cooks it.
Would you use an array or a linked list to implement this queue?***

![Restaurant Queue](/src/assets/SelectionSort/2.2.png)

- **Answer:LinkedList, because since there are many inserts and delets still doing, this case dont need to read in random order. The  chef only need to read the first order**

2.3 - ***Let’s run a thought experiment. Suppose Facebook keeps a list of
usernames. When someone tries to log in to Facebook, a search is
done for their username. If their name is in the list of usernames,
they can log in. People log in to Facebook pretty often, so there are
a lot of searches through this list of usernames. Suppose Facebook
uses binary search to search the list. Binary search needs random
access—you need to be able to get to the middle of the list of
usernames instantly. Knowing this, would you implement the list
as an array or a linked list?***

- **Answer: A sorted array. Arrays provide random access, so you can grab an element from the middle of the array instantly. This isn't possible with linked lists. To access the center element of a linked list, you must start at the first element and follow all the links back to the center element.**

2.4 - ***People sign up for Facebook pretty often, too. Suppose you decided
to use an array to store the list of users. What are the downsides
of an array for inserts? In particular, suppose you’re using binary
search to search for logins. What happens when you add new users
to an array?***

- **Answer: When adding new users to a sorted array, you need to reallocate and move elements to maintain order, which makes insertions slow (O(n))**


2.5 - ***In reality, Facebook uses neither an array nor a linked list to store
user information. Let’s consider a hybrid data structure: an array
of linked lists. You have an array with 26 slots. Each slot points to a
linked list. For example, the first slot in the array points to a linked
list containing all the usernames starting with a. The second slot
points to a linked list containing all the usernames starting with b,
and so on.  Suppose Adit B signs up for Facebook, and you want to add them
to the list. You go to slot 1 in the array, go to the linked list for slot
1, and add Adit B at the end. Now, suppose you want to search for
Zakhir H. You go to slot 26, which points to a linked list of all the
Z names. Then you search through that list to find Zakhir H.
Compare this hybrid data structure to arrays and linked lists. Is it
slower or faster than each for searching and inserting? You don’t
have to give Big O run times, just whether the new data structure
would be faster or slower***

![Restaurant Queue](/src/assets/SelectionSort/2.2.png)

- **Answer: Insertions are slow. Furthermore, if you're using binary search to find usernames, the array needs to be sorted. Suppose someone named Adit B signs up for Facebook. His name will be inserted at the end of the array. So you need to sort the array each time a name is inserted.**