public class TestClass
{
    public static void main (String []args)
    {
        StackAsMyLinkedList <String> myStack = new StackAsMyLinkedList<>();

        System.out.println("\nInitial stack: ");
        System.out.println(myStack);

        myStack.push(new String ("Keith"));
        myStack.push(new String ("David"));
        myStack.push(new String ("Niel"));
        myStack.push(new String ("Zack"));

        System.out.println(myStack);

        // LastIn-FirstOut
        myStack.pop();
        System.out.println(myStack);

    }
}