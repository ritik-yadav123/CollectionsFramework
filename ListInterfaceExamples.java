package SetInterface;

import java.util.*;

public class ListInterfaceExamples {
    static void ArrayListExamples(){
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(15);
        l1.get(0);
        l1.set(1,10);
        System.out.println(l1.contains(5));
        System.out.println(l1);}
    static void LinkedListExamples(){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(5);
        l.add(15);
        l.get(0);
        l.set(1,10);
        System.out.println(l.contains(5));
        System.out.println(l);}
    static void StackExamples(){
        Stack<String> st=new Stack<>();
        st.push("ritik");
        st.push("yadav");
        System.out.println(st.peek());
        st.push("tushar");
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
    public static void main(String[] args) {
       // ArrayListExamples();
       // LinkedListExamples();
        StackExamples();}}
