class Solution {
    public class Pair{
        int x;
        int y;
        Pair(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int [] output = new int[temperatures.length];
        Stack<Pair> st = new Stack<>();
        for(int i=temperatures.length-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek().x <= temperatures[i]){
                st.pop();
            }
            output[i] = st.isEmpty() ? 0 : st.peek().y-i;
            st.push(new Pair(temperatures[i],i));
        }
        return output;
    }
}
