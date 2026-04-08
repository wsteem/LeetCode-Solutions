/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    public Queue<Integer> queue; //initialize a new queue (that what we will use to add integers)

    //constructor this(List<NestedInteger>)
    public NestedIterator(List<NestedInteger> nestedList) {
        queue = new LinkedList<>(); //declare queue to LinkedList
        traverseList(nestedList); //flatten the nestedList (queue will be updated).
    }

    public void traverseList(List<NestedInteger> nestedList) {
        //traverse list
        for(int i=0; i<nestedList.size(); i++){
            //get the element (integer or list)
            NestedInteger element = nestedList.get(i);
            //if the element is an integer
            if(element.isInteger()) {
                //add it to the queue
                queue.add(element.getInteger()); 
            } else { // else use recursion and pass in the new list
                traverseList(element.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return queue.poll(); //similar to pop in stack.
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty(); //true if queue is not empty
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
