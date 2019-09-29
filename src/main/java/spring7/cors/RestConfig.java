package spring7.cors;

import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

public class RestConfig extends RepositoryRestConfigurerAdapter {
    /*public void configureRepositoryRestConfiguration(RepositoryRestConfigurationconfig){
        config.setDefaultPageSize(2)
        .setPageParamName("page")
        .setLimitParamName("sort")
        .setBasePath("/api")
        .setReturnBodyOnCreate(true)
        .setReturnBodyOnUpdate(true);
    }*/
}
