class Solution {
    public char processStr(String s, long k) {
      String result="";
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch >='a' && ch<='z'){
            result+=ch;
        }
        else if(ch=='*'){
        if( result.length()>0){
            result=result.substring(0,result.length()-1);
        }
        }
        else if (ch=='#'){
           result+=result;
        }
        else{
            String reversed="";
            for(int j=result.length()-156 ;j>=0;j--){
                reversed+=result.charAt(j);
            }
            result = reversed;
        }
       }
        if( k < 0 || k > result.length()-1){
            return '.';
        }
       return result.charAt((int) k);
    }
}