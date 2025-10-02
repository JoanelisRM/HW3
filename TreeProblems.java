/*
 * *** Joanelis Rivera Matos / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    Set<Integer> result = new TreeSet<Integer>();
    Set<Integer> temporarySetA = new TreeSet<Integer>();
    Set<Integer> temporarySetB = new TreeSet<Integer>();

    temporarySetA.addAll(setA);
    temporarySetB.addAll(setB);
    temporarySetA.removeAll(temporarySetB);
    temporarySetB.removeAll(setA);

    result.addAll(temporarySetA);
    result.addAll(temporarySetB);

    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    Map<Integer, String> temporary = new TreeMap<Integer, String>();

    for(Map.Entry<Integer, String> value : treeMap.entrySet()){
      if(value.getKey() % 2 == 0) {
        temporary.put(value.getKey(), value.getValue());
      }
    }

    for(Integer removal : temporary.keySet()){
      treeMap.remove(removal);
    }

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return tree1.equals(tree2);

  }

} // end treeProblems class
