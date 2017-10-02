package data;

import entity.Spitter;
import org.springframework.stereotype.Repository;

/**
 * Created by zyzz on 17-9-29.
 */
@Repository
public class SpitterRepository {
    private Spitter spitter;
    public void save(Spitter spitter){
        this.spitter = spitter;
    }
    public Spitter findSpitter(String username){
        return spitter;
    }
}
