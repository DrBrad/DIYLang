package unet.diylang;

import unet.diylang.tasks.IUFunction;
import unet.diylang.tasks.UIfStatement;
import unet.diylang.tasks.UTask;
import unet.diylang.tasks.UVariable;

public class Main {
    public static void main(String[] args){


        UTask t = new UTask();
        //UEngine e = new UEngine();
        t.add(new UVariable("foo", "true"));
        t.add(new UVariable("bar", "true"));
        t.add(new UVariable("far", "nill"));
        UTask f = new UIfStatement("foo", IUFunction.EQUAL, "bar");
        f.add(new UVariable("far", "HELLO"));
        UTask f2 = new UIfStatement("far", IUFunction.EQUAL, "far");
        f2.add(new UVariable("far", "CASCADE"));
        f.add(f2);

        t.add(f);

        //t.add(new UVariable("hel", false));
        t.run();

        System.out.println(t.getVariable("far"));

        /*
        Task script = new Task();
        script.add(new ObjectTask("JIM", 100));

        script.run();

        System.out.println(script.getVariable("JIM"));*/
    }
}