public class StackAsMyLinkedList <T>
{
    MyLinkedList<T> theStack;

    public StackAsMyLinkedList()
    {
        theStack = new MyLinkedList<>();

    }

    // Add element to Stack (front of stack)
    public void push(T element)
    {
        // revisit the append method in LL
        theStack.prepend(element);
    }

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