import java.util.*;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(numRows == 0)	return result; 

        List<Integer> list = new ArrayList<Integer>();
        //Create first row
        list.add(1);
        result.add(list);
        //creat second row
        
        if(numRows == 1)    return result; 
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        result.add(list);


        if(numRows == 2)    return result; 
        int i = 2, val;
        while( i < numRows){
        	list = new ArrayList<Integer>();
        	list.add(1);
        	for (int j = 1 ; j < i ; j++) {
        		val = result.get(i-1).get(j-1) + result.get(i-1).get(j);
        		list.add(val);
        	}
        	list.add(1);
        	result.add(list);
        	i++;
        }
        return result;
    }
    
    public static void main(String[] args) {
     	Solution s = new Solution();
     	List<List<Integer>> result = s.generate(4);
        List<Integer> l;
     	for (int i = 0 ; i < result.size(); i++) {
     		l = result.get(i);
            for (int j = 0; j < l.size(); j++) {
                System.out.print(l.get(j)+" ");
            }
            System.out.println();
     	}
     }
}