package com.spring.transaction.domain;

import com.spring.transaction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public void create(User user){
        userRepository.save(user);
    }

    @Transactional(rollbackFor = {EntityNotFoundException.class, Exception.class})
    public void createBatch(User user) throws Exception {
        userRepository.save(user);
        try{
        User one = userRepository.getOne(9l);
        } catch (EntityNotFoundException ee){
            throw new EntityNotFoundException();
        }
        catch (Exception e){
            throw new Exception();
        }
        throw new Exception();
    }


}
