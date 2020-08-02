import java.util.*;

public class dublicatesInArray
{
	public static void main(String[] args) {
	    
	Integer[] myArray = new Integer[]{1,1,1,2,3,4,6,2,4,2, null, null, null};
	
	System.out.println(findDublicates(myArray,3));
	
	}
	
	
	public static Set<Integer> findDublicates(Integer[] someArray, int numberOfDublicates){
	    
	    Set<Integer> setForDublicates = new HashSet<Integer>();
	    
	    int count = 0;
	    
	    for(Integer n : someArray){
	        
	        if(n != null){
	        
	            for(Integer k : someArray){
	            
	                if(n == k){
	                
	                    count++;
	                    
	                }
	            }
	        
	        if(count == numberOfDublicates && !setForDublicates.contains(n) && !setForDublicates.contains(null)){
	            
	            setForDublicates.add(n);
	            
	        }
	        
	        count = 0;
	        
	        }
	    }
	    
	    return setForDublicates;
	    
	}
	
}


