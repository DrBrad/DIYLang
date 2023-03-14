package unet.diylang.variables;

public class UInteger extends IUObject {

    private int o;

    public UInteger(int o){
        this.o = o;
    }

    public void UInteger(int o){
        this.o = o;
    }

    public Integer getValue(){
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
