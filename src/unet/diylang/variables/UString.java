package unet.diylang.variables;

public class UString extends IUObject {

    private String o;

    public UString(String o){
        this.o = o;
    }

    public void setValue(String o){
        this.o = o;
    }

    public String getValue(){
        return o;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    /*
    @Override
    public boolean equals(Object o){
        return this.hashCode() == o.hashCode();
    }
    */
}
