package org.mahagan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Addres;
import org.mahagan.domain.Students;

public class ManyToOneRelationshipApplicationHB3 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        Students students = new Students();
        students.setFirtstName("Siddarth");
        students.setLastName("Sirke");

        Students students1 = new Students();
        students1.setFirtstName("Krishna");
        students1.setLastName("Shinde");

        Students students2 = new Students();
        students2.setFirtstName("Ajay");
        students2.setLastName("DHole");

        Addres addres = new Addres();
        addres.setCountry("India");
        addres.setCity("Pune");
        addres.setPincode("412207");

        students.setAddres(addres);
        students1.setAddres(addres);
        students2.setAddres(addres);

        session.persist(students);
        session.persist(students1);
        session.persist(students2);


        tsx.commit();
        session.close();
        System.out.println("Data Inserted Done!");
    }
}