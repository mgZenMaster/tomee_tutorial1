/*
 */
package zen.tutorials.tomee1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author chz
 */
@Singleton
@Startup
public class initializer {
    
    @PostConstruct
    public void initApp() {
        
        Release newRelease = new Release();
        newRelease.setArtist("Pink Floyd");
        newRelease.setName("Wish you were here");
        
        ReleaseFacade releaseFacade = new ReleaseFacade();
        releaseFacade.create(newRelease);
        
    }
    
    @PreDestroy
    public void cleanUpApp() {
        
    }
    
}
