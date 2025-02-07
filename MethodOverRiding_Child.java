package assigment;
class Parent {
    // base class or superclass which is going to overriden
    // below
    void show() 
    { 
    	System.out.println("Parent's show()"); 
    }
}
// Inherited class
class MethodOverRiding_Child extends Parent {
    // This method overrides show() of Parent
    @Override void show()
    {
        System.out.println("Child's show()");
    }

    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new MethodOverRiding_Child();
        obj2.show();
    }
}