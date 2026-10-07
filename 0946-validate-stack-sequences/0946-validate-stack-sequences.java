class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int idx=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<pushed.length;i++){
            s.push(pushed[i]);
            while(!s.isEmpty() && s.peek()==popped[idx]){
                s.pop();
                idx++;
            }
        }
        return s.isEmpty();
    }
}