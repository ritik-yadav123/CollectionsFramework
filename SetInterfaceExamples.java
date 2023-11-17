package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExamples {  // Set means no duplicate elements(Uniqness)
    static void hashSetExamples(){
        HashSet<Integer> st=new HashSet<>();
        st.add(4);
        st.add(9);
        st.add(4);
        st.add(98);
        st.add(49);
        System.out.println(st);
        st.remove(4);
        System.out.println(st);
        System.out.println(st.contains(9));
    }
  static void LinkedHashSetExamples(){
      LinkedHashSet<Integer> st=new LinkedHashSet<>();
      st.add(4);
      st.add(9);
      st.add(4);
      st.add(98);
      st.add(49);
      System.out.println(st);
      st.remove(4);
      System.out.println(st);
      System.out.println(st.contains(9));
  }
    static void treeSetExamples(){
        TreeSet<Integer> st=new TreeSet<>();
        st.add(4);
        st.add(9);
        st.add(4);
        st.add(98);
        st.add(49);
        System.out.println(st);
        st.remove(4);
        System.out.println(st);
        System.out.println(st.contains(9));
    }
    public static void main(String[] args) {
        hashSetExamples(); //unordered elem,uses hashing internally
        System.out.println();
        LinkedHashSetExamples();// ordered elem
        System.out.println();
        treeSetExamples();// increasing order elem,Self balancing BST,RBT
    }
}
