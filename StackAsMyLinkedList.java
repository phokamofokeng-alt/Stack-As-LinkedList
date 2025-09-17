public class StackAsMyLinkedList <T>
{
    MyLinkedList<T> theStack;

    public StackAsMyLinkedList()
    {
        theStack = new MyLinkedList<>();

    }

    
    // Remember with Stack, yoou add to top of stack. So the front of Stack.
    // Hence we use prepend and not append
    // Add element to Stack (front of stack)
    public void push(T element)
    {
        // revisit the append method in LL
        theStack.prepend(element);
    }

    
    // Similarly when we delete, we remove the one last added to Stack. 
    // So we remove the first element of stack
    // Remove element (from front of stack)
    public T pop()
    {
        T removed = theStack.getFirst();
        if (removed == null)
        {
            return null;
        }
        else
        {
            // use delete method 
            theStack.delete(removed);
            return removed;
        }

    }


    // toString method
    public String toString()
    {
        return theStack.toString();

    }
}