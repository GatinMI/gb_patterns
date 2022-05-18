package ru.gb.lesson_6.relation_object;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class Person extends DomainObject<Long> {
    private Long id;
    private String name;
    private Long jobId;

    public void setJobId(long jobId) {
        this.jobId = jobId;
        this.markDirty();
    }

    public static Person create(String name, Long jobId) {
        Person person = new Person(null, name, jobId);
        person.markNew();
        return person;
    }

    public static Optional<Person> load(Long id) {
        Optional<Person> person = UnitOfWork.getDomainObject(id, Person.class);
        if (person.isEmpty()) {
            person = Registry.getMapper(Person.class).find(id);
            person.ifPresent(UnitOfWork::addDomainObject);
        }
        return person;
    }

    public static Optional<Person> loadByName(String name) {
        PersonMapper mapper = (PersonMapper) Registry.getMapper(Person.class);
        Optional<Person> byName = mapper.findByName(name);
        if (byName.isPresent()) {
            Optional<Person> existsing = UnitOfWork.getDomainObject(byName.get().getId(), Person.class);
            if (existsing.isPresent()) {
                return existsing;
            } else {
                UnitOfWork.addDomainObject(byName.get());
            }
        }
        return byName;
    }

    public void remove() {
        this.markRemoved();
    }
}
