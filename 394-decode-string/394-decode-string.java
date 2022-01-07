class Solution {
    public String decodeString(String s) {
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String temp = "";
        String num = "";
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ']')
            {
                st.push(Character.toString(s.charAt(i)));
            }
            else {
                while(st.peek().charAt(0) != '[')
                    temp = st.pop()+temp;
                st.pop();
                while(st.size()>0 && Character.isDigit(st.peek().charAt(0))){
                     num = st.pop()+num;

                }
                int times = Integer.parseInt(num);
                st.push(temp.repeat(times));

                num = "";
                temp = "";




            }
        }
        temp = "";
        while (!st.isEmpty()){
            temp = st.pop()+temp;

        }

        //System.out.println(temp);
        return temp;
    }
    
}