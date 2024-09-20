interface A {
    public abstract void m1();
}
interface B {
    public abstract void m2();
}
class Test implements A,B{
    public void m1(){
        System.out.println("interface method");
    }
    public void m2(){
        System.out.println("Abstract method");
    }
    
    

    public static void main (String[]args){
        Test t = new Test();
        t.m1();
        t.m2();
    }
}