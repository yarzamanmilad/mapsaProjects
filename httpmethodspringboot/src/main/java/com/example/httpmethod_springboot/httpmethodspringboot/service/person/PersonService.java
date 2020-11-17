package com.example.httpmethod_springboot.httpmethodspringboot.service.person;

import com.example.httpmethod_springboot.httpmethodspringboot.domain.Person;
import com.example.httpmethod_springboot.httpmethodspringboot.exception.CostomException;
import com.example.httpmethod_springboot.httpmethodspringboot.repository.PersonRepository;
import javassist.NotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
//@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;
    public Person create(Person person){
        return personRepository.save(person);
    }
    public Person put(Person person,Long id){

        ////after validation
        Person person1=personRepository.findById(id).orElse(new Person());
        person1.setName(person.getName());
        person1.setFamily(person.getFamily());
        return personRepository.save(person1);
    }
    public Person patch(Person person,Long id){
        Person person1=personRepository.findById(id).orElseThrow(()->new CostomException("resource not found"));
        if (person.getName()!=null)
        person1.setName(person.getName());
        if(person.getFamily()!=null)
        person1.setFamily(person.getFamily());
        return personRepository.save(person1);
    }
    public Person delete(Long id){
        personRepository.deleteById(id);
        return null;
    }
    public Person get(Long id) throws CostomException {
        return personRepository.findById(id).orElseThrow(()->new CostomException("resource notfound."));
    }
    public List<Person> getAll(){
        return personRepository.findAll();
    }
}
