package data;

import entity.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zyzz on 17-9-25.
 */
@Repository
public class SpittleRepository {
     public List<Spittle> findSpittles(long max, int count){
          List<Spittle> spittles = new ArrayList<Spittle>();
          for (int i=0;i<count;i++){
               spittles.add(new Spittle("Spittle"+i,new Date()));
          }
          return spittles;
     };
     public Spittle findOne(int id){
          Spittle spittle = new Spittle("Spittle"+id,new Date());
          return spittle;
     }
}
