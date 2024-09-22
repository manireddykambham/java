package InnerClass;


public class InnerClassMethod {
    public static void main(String[] args) {
        OuterClasso myOuter = new OuterClasso();
        OuterClasso.InnerClasso myInner = myOuter.new InnerClasso();
        System.out.println(myInner.myInnerMethod());
    }
    }
    class OuterClasso {
        int x = 10;

        class InnerClasso {
            public int myInnerMethod() {
                return x;
            }
        }
    }
