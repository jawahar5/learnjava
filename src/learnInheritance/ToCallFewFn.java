package learnInheritance;

public class ToCallFewFn {

    public void homeFn(){
        ParentClass parent = new ParentClass();
        parent.displayProtectedFn();
//        parent.displayPrivateFn(); private can never be accessed by other class. they will always be accessible only within the class
    }
}
