package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	  printElements(nodes, p);
	   
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	  printElements(edgeList, p);
	   
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   // printElements method using extract method technique
   void printElements(List<?> elements, String p) {
	   // loop over elements in the provided list
	   for (Object element : elements) {
		   
		   // print nodes if that is the current type
		   if (element instanceof Node) {
			   // set current node and print
			   Node node = (Node) element;
			   if(node.contains(p)) {
				   System.out.println(node);
			   }
		   // print edges if that is the current time
		   } else if (element instanceof Edge) {
			   // set current edge and print
			   Edge edge = (Edge) element;
			   if(edge.contains(p)) {
				   System.out.println(edge);
			   }
		   }
	   }
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}