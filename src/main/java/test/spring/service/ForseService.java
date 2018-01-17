package test.spring.service;

import com.force.api.ApiConfig;
import com.force.api.DescribeSObject;
import com.force.api.ForceApi;
import test.force.ForceSoapRun;

public abstract class ForseService {
    ForceApi getForceApi() {
        return new ForceApi(new ApiConfig()
                .setUsername(ForceSoapRun.USERNAME)
                .setPassword(ForceSoapRun.PASSWORD));
    }

    abstract String getType();

    public DescribeSObject getMetaData(){
        return getForceApi().describeSObject(getType());
    }

    public void create(Object newObject){
        getForceApi().createSObject(getType(),newObject);
    }

}
