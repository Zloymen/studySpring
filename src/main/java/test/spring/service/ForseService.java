package test.spring.service;

import com.force.api.ApiConfig;
import com.force.api.DescribeSObject;
import com.force.api.ForceApi;
import test.force.ForceRun;

public abstract class ForseService {
    ForceApi getForceApi() {
        return new ForceApi(new ApiConfig()
                .setUsername(ForceRun.USERNAME)
                .setPassword(ForceRun.PASSWORD));
    }

    abstract String getType();

    public DescribeSObject getMetaData(){
        return getForceApi().describeSObject(getType());
    }
}
