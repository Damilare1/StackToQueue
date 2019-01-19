Open src/StackToQueue to view the code to convert a Stack to Queue

I used Two Stacks (inStack & outStack) to implement this. The operation goes as follows:
1. Enqueue
    Items are pushed into the inStack.
2. Dequeue
    The items are popped from the inStack and pushed into the outStack if and only if the outStack is empty, after which the last item (the first item pushed to the inStack) is popped out and returned.

Benefit
This method allows for amortized constant time operations as the items are only pushed and popped twice.


