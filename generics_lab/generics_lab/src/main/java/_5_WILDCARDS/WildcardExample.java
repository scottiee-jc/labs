package _5_WILDCARDS;

import java.util.List;

public class WildcardExample {


    void printNames_grampasAndFathersOnly(List<? super Father> grampasAndFathers){
        System.out.println(grampasAndFathers);
    }


    void printNames_fathersAndChildrenOnly(List<? extends Father> fathersAndChildrenOnly){
        System.out.println(fathersAndChildrenOnly);
    }

    void printNames_all(List<? super Child> all){
        System.out.println(all);
    }
}
