package extends1.access.parent;

public class Parent {

    public  int publicValue;
    protected  int protectedValue;
    int defaultValue;
    private int privateValue;

    public void printParent(){
        System.out.println("== Parent 매서드 내부 ==");
        System.out.println("public " + publicValue);
        System.out.println("protected " + protectedValue);
        System.out.println("default " + defaultValue);
        System.out.println("private " +privateValue);
    }

}
