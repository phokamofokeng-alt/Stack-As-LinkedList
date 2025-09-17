public class Node<T>
{
    T data; // stores value of object
    Node <T> next; // points/references to next node, so address of next object

    public Node (T data)
    {
        this.data = data;
        this.next = null; // initially no next node
    }
}