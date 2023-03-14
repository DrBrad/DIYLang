package unet.diylang.tasks;

public class UIfStatement extends UTask {

    private String k, k1;
    private IUFunction f;

    public UIfStatement(String k, IUFunction f, String k1){
        this.k = k;
        this.f = f;
        this.k1 = k1;
    }

    @Override
    public void run(UTask t){
        switch(f){
            case EQUAL:
                //System.out.println(k+"="+t.getVariable(k)+" & "+k1+"="+t.getVariable(k1)+" = "+t.getVariable(k).equals(t.getVariable(k1)));
                if(!t.getVariable(k).equals(t.getVariable(k1))){
                    return;
                }
                break;

            case NOT_EQUAL:
                if(t.getVariable(k).equals(t.getVariable(k1))){
                    return;
                }
                break;

            case GREATER_THAN:
                //Number n = (Number) t.getVariable(k);
                //if(n < n){

                //}
                //break;
        }

        super.run(t);
    }
}
