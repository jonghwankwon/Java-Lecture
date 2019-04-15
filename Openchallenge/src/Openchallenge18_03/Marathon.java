package Openchallenge18_03;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public static void main(String[] args){
    	String[] participant = {"홍길동", "유해진", "김민수", "유재석"};
    	String[] completion	= {"유해진", "유재석", "김민수"};
    	
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	
    	for(int i=0; i<participant.length; i++){
    		if(map.containsKey(participant[i])){
    			map.put(participant[i], Integer.parseInt(map.get(completion[i]).toString())+1);
    		}else{
    			map.put(participant[i], 1);
    		}
    	}
    	for(int i=0; i<completion.length; i++){
    		if(map.containsKey(completion[i])){
    			map.put(completion[i], Integer.parseInt(map.get(completion[i]).toString())-1);
    		}
    	}
    	for(Map.Entry entry: map.entrySet()){
    		if(Integer.parseInt(entry.getValue().toString())==1)	{
    			System.out.println(entry.getKey());
    		}
    	}
    	System.out.println(map);
    }
}
