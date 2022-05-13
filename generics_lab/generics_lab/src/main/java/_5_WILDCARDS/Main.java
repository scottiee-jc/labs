package _5_WILDCARDS;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Grampa> grampas = List.of(
                new Grampa("Cbum"),
                new Grampa("Daddy Noel"),
                new Grampa("Arnold")
        );

        List<Father> fathers = List.of(
                new Father("Scott"),
                new Father("Who art in heaven"),
                new Father("Gain-o-tron")
        );

        List<Child> children = List.of(
                new Child("Little boy Dedoid"),
                new Child("Crogpitts"),
                new Child("Ricky bogga-johnson")
        );

        List<String> names = List.of("Scott", "Arnold");

        WildcardExample wildEx = new WildcardExample();
        // we can pass all 3 lists from the same heirachy but not 'names'
        // otherwise we get a compiler error saying "Required type: List <? super Child> provided: List<String>
        // this is because names only contains the values we set in here, it is not linked to the other classes

        wildEx.printNames_all(grampas);
        wildEx.printNames_all(fathers);
        wildEx.printNames_all(children);

        // wildEx.printNames_fathersAndChildrenOnly(grampas);
        // ^^ this doesn't work because grampa does not extend fathers - it is the superclass

        wildEx.printNames_fathersAndChildrenOnly(fathers);
        wildEx.printNames_fathersAndChildrenOnly(children);


        // same goes here for children - child extends father but it is not its super

        wildEx.printNames_grampasAndFathersOnly(grampas);
        wildEx.printNames_grampasAndFathersOnly(fathers);


    }

}
