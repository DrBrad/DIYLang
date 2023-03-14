package unet.diylang.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UTask extends IUTask {

    private List<IUTask> x;
    private Map<String, Object> z;
    private UTask t;

    public UTask(){
        x = new ArrayList<>();
        z = new HashMap<>();
    }

    public void add(IUTask o){
        x.add(o);
    }
    
    public void setVariable(String k, Object v){
        if(z.containsKey(k)){
            z.put(k, v);
            return;
        }
        //System.out.println("RUN  "+k+" = "+v);

        if(t != null){
            if(t.setParentVariable(k, v)){
                //System.out.println("PARENT SET: "+k+"="+v);
                return;
            }
        }

        z.put(k, v);
    }

    protected boolean setParentVariable(String k, Object v){
        if(z.containsKey(k)){
            z.put(k, v);
            return true;
        }

        if(t != null){
            return t.setParentVariable(k, v);
        }
        return false;
    }

    public Object getVariable(String k){
        if(z.containsKey(k)){
            return z.get(k);
        }

        if(t != null){
            return t.getVariable(k);
        }

        return null;
    }

    public void run(){
        for(IUTask t : x){
            t.run(this);
        }
    }

    public void run(UTask t){
        this.t = t;
        for(IUTask z : x){
            z.run(this);
        }
    }
}
