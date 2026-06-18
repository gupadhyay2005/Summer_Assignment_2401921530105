class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {

            String x = tokens[i];

            if(x.equals("+")) {

                int b = s.pop();
                int a = s.pop();

                s.push(a + b);
            }

            else if(x.equals("-")) {

                int b = s.pop();
                int a = s.pop();

                s.push(a - b);
            }

            else if(x.equals("*")) {

                int b = s.pop();
                int a = s.pop();

                s.push(a * b);
            }

            else if(x.equals("/")) {

                int b = s.pop();
                int a = s.pop();

                s.push(a / b);
            }

            else {

                s.push(Integer.parseInt(x));
            }
        }

        return s.peek();
    }
}
