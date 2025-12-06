class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s){
        Stack<Character> st = new Stack();
        for(char a : s.toCharArray()){
            if(a!='#') st.push(a);
            else if(!st.isEmpty()) st.pop();
        }
        return String.valueOf(st);
    }
}
