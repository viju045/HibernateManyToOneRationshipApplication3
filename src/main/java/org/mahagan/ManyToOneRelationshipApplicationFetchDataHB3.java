/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 4:50 PM
 * Project : ManyToOneRelationshipApplicationHB3
 **/

package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Addres;
import org.mahagan.domain.Students;

import java.util.Iterator;
import java.util.List;

public class ManyToOneRelationshipApplicationFetchDataHB3 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        TypedQuery query = session.createQuery("from Students students");
        List<Students>list = query.getResultList();
        Iterator<Students>iterator = list.listIterator();
        while(iterator.hasNext())
        {
            Students students = iterator.next();
            System.out.println(students.getFirtstName()+"-"+students.getLastName());

            Addres addres = students.getAddres();
            System.out.println(addres.getCountry()+"-"+addres.getCity()+"-"+addres.getPincode());
        }
        session.close();
        System.out.println("Data Inserted Done!");
    }
}
