class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < asteroids.length; i++) { 
            
            if(stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while(true) {
                    int topofstack = stack.peek();
                    if(topofstack < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }
                    else if(topofstack == -asteroids[i]) {
                        stack.pop();
                        break;
                    } else if(topofstack > -asteroids[i]){
                        break;
                    } else {
                        stack.pop();
                        if(stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] print = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            print[i] = stack.pop();
        }
        return print;
    }
}
