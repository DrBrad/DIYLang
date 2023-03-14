package unet.diylang.tasks;

public class UVariable extends IUTask {

    //private List<IUTask> t;
    //private Map<IUObject, IUObject> v;

    //private UString k, v;
    private String k;
    private Object v;

    public UVariable(String k, Object v){
        this.k = k;
        this.v = v;
    }

    @Override
    public void run(UTask t){
        t.setVariable(k, v);
    }
}
