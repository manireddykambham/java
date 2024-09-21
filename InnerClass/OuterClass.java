package InnerClass;
class OuterClasses {
    int x= 5;

   /*private*/ class InnerClass {//Adding private will throw error
        int y=7;
    }

    public class OuterClass {
        public static void main(String[] args) {
            OuterClasses myOuter = new OuterClasses();
            OuterClasses.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }
}
