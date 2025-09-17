public class MyLinkedList <T>
{
    // Node references pointing to first and last element in linked list
    private Node <T> head, tail;

    public MyLinkedList()
    {
        // Initialize values of elements to which nodes point
        // List starts out empty
        head = null;
        tail = null;

    }

    // Add elements to end of linked list
    public void append (T element)
    {
        // Create Node to hold new element
        Node <T> newNode = new Node<>(element);

        // if no elements in list
        if(head == null)
        {
            // newNode returns address of the Node that was created
            head = tail = newNode;

        }
        else
        {
            // tail.next points to the address of next obj
            // now we're saying at that address, we save a new Node.
            tail.next = newNode;

            // tail points to last element of list. 
            // So that also changes to the last obj in list, which is the new Node
            tail = newNode;

        }

    }

    public String toString()
    {
        String result = "[ ";
        Node <T> ptr = head;
        
        if (head == null)
        {
            result = "[ ]";
        }
        else
        {
            //traverse linked list
            for (ptr = head; ptr != null; ptr = ptr.next)
            {
                result = result + ptr.data;

                if(ptr.next != null)
                {
                    result += ", ";
                }

            }

            result += " ]";

        }
        
        
        return result;

    }

    // Get first returns the first element of the Linked List
    public T getFirst()
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            // 'head' references the first object of the LL
            return head.data;
        }
        

    }

    // GetLast returns the last element of LL
    public T getLast()
    {
        if (head == null)
        return null;

        else
        {
            return tail.data;

        }

    }

    // Removes first node and returns the first element of the LL
    public T removeFirst()
    {

        if(head == null)
        {
            return null;
        }

        else
        {

            // Hold element that will be removed
            T element = head.data;

            // No need to traverse since elements not contiguously placed
            // New head is the .next of the first node
            head = head.next;

            if(head == null)
            {
                tail = null;
            }
            
            return element;

        }
        
    }

    // Append the LL from the front
    public void prepend(T element)
    {
        // create a node for element
        Node<T> newNode = new Node<>(element);
        
        // Start with the .next to avoid rewriting the head node
        newNode.next = head;
        head = newNode;
        
        // The only element in LL is the added one
        if (tail == null)
        {
            tail = head;
        }

    }

    // Remove last Node of LL. Return element name
    public T removeLast()
    {
        // If LL is empty
        if (head == null)
        {
            return null;
        }

        // if only 1 elenent in LL
        if(head == tail)
        {
            T removed = tail.data;
            head = null;
            tail = null;

            return removed;

        }

        // More than 1 element in LL:
        //To hold last element before removing it
        T removed = tail.data;

        Node<T> ptr = head;
        //traverse list
        while(ptr.next != null)
        {
            ptr = ptr.next;
            
        }

        // For our new tail
        // At this point ptr is now the value of the last node
        // Hence:
        tail = ptr;
        tail.next = null;
        
        return removed;

    }


    // Delete element of choice, Return true of false
    public boolean delete(T element)
    {
        Node<T> ptr = head; // First node and element (if this is index 1)
        Node<T> prvPtr = null; // Node we will be traversing with. (then this is index 0)

        // stops iterating once the element of node is equal to that of parameter element
        while (ptr != null && ((Comparable)ptr.data).compareTo(element) != 0)
        {
            prvPtr = ptr; // the prev node node has the value of next node
            ptr = ptr.next; // to iterate through loop

        }

        // ptr is now the node of the element we want to delete

        // If LL is empty
        if( ptr == null) // 
        {
            return false;
        }

        // If element to be removed is last node aka tail
        if( ptr == tail)
        {
            tail = prvPtr;
            tail.next = null;
        }

        // If element to be removed is first node aka head
        if (ptr == head)
        {
            head = head.next;
        }
        else // within the LL (general case)
        {
            prvPtr.next = ptr.next;
            // we jump an element/ node
        }

        return true;







    }
    

}

