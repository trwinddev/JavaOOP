public class stack_main {
    public static void main(String[] args) {
        my_Stack s = new my_Stack(100);
        // sc.push(10);
        // sc.push(20);
        // sc.push(30);
        // sc.push(40);
        // sc.pop();
        // sc.show();

        my_Stack_linked_list ll = new my_Stack_linked_list();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.pop();
        ll.show();

        int[] b ={1,2,3};
        for (int i = 0; i < 3; i++) {
            s.push(b[i]);
        }
        int[] c = new int[3];
        for (int i = 0; i < 3; i++) {
           c[i] = s.pop();
        }
        for(int i = 0; i < 3; i++){
            System.out.print(c[i] + " ");
        }
        
    }
}
