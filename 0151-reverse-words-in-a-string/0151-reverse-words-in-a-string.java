class Solution {
    public String reverseWords(String s) {
        // split or trinm unwanted space ;
        String [] words = s.trim().split("\\s+");
    

        // take StringBuilder ; bescause of imutable 

        StringBuilder str = new StringBuilder();

        for( int i = words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i>0){
                
            str.append(" ");
            }
        }
        return str.toString();


    }
}