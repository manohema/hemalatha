package oddevencount;

public class Guviiiii {
	public static String longPrefix(String[] ss) {
	    if(ss==null || ss.length==0){
	        return "";
	    }
	 
	    if(ss.length==1) 
	        return ss[0];
	 
	    int minLen = ss.length+1;
	 
	    for(String str: ss){
	        if(minLen > str.length()){
	            minLen = str.length();
	        }
	    }
	 
	    for(int i=0; i<minLen; i++){
	        for(int j=0; j<ss.length-1; j++){
	            String s1 = ss[j];
	            String s2 = ss[j+1];
	            if(s1.charAt(i)!=s2.charAt(i)){
	                return s1.substring(0, i);
	            }
	        }
	    }
	 
	    return ss[0].substring(0, minLen);
	}
	public static void main(String[] args) {
		String arr[]={"hello","wonderfull","goodmorning"};
		System.out.println(longPrefix(arr));
	}
}
		
