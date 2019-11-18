package com.ifi.trainer_api.repository;

import com.ifi.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer,String> {

    Trainer save(Trainer trainer) ;
    Trainer findByName(String id) ;
}
