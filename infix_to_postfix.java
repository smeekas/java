import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        String exp=scan.nextLine();
        StringBuffer sb=new StringBuffer();
        for(char c:exp.toCharArray()){
            if(Character.isLetterOrDigit(c)){//letter or digit directly print it.
                sb.append(c);
            }
            else if(c=='('){ //'(' highest precendece while input directly add it to stack.
                stack.add(c);
            }
            else if(c==')'){ //if c==')' pop out stack until we hit '(' or emptied the stack.
                while(!stack.isEmpty()&&stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();//top is '(' pop out but don't print it.
            }
            else { // else it is operator so pop and o/p the stack until stack top has lower precedence-(so higher precedence can sit on stack top)
                    //-operator or emptied the stack.
                while(!stack.isEmpty()&&prec(stack.peek())>=prec(c)){   // |  |  ^
                    sb.append(stack.pop());                             // |  |  | higher precedece
                }                                                       // |  |  |
                stack.add(c);//stack top has lower precedence           // |  |  |
            }                // so higher precedence can sit on         // |  |  | lower precedence
        }                    // stack top                               // ----
        while(!stack.isEmpty()){//we traversed whole expression pop and o/p whatever operator left on stack
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
    static int prec(char ch){
        switch(ch){
            case '+':
            case '-':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
            case '(':return -1;
            default:return -1;
        }
    }
}
