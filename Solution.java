class Solution {
    public String clearDigits(String s) {
        Stack<Character> temp = new Stack<>();
        for(int i=0; i<s.length(); i++){
            temp.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        int digits = 0;

        while(!temp.isEmpty()){
            char ch = temp.peek();
            temp.pop();
            if(Character.isDigit(ch)){
                digits++;
                while(Character.isDigit(temp.peek())){
                    digits++;
                    temp.pop();
                }
                int k = 0;
                while (k < digits){
                    char c = temp.peek();
                    if(Character.isDigit(c)){
                        digits++;
                    }else {
                        k++;
                    }
                    temp.pop();

                }

                digits = 0;
            }else{
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}
