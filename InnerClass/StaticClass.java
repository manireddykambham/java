package InnerClass;
class OuterClass {
    int x= 5;

    static class InnerClass {//Adding private will throw error
        int y=7;
    }

    public class StaticClass {
        public static void main(String[] args) {
            /*OuterClass myOuter = new OuterClass();*/
            /*OuterClasses.InnerClass myInner = myOuter.new InnerClass();*/
            OuterClass.InnerClass myInner = new OuterClass.InnerClass();
            System.out.println(myInner.y);
        }
    }
}

