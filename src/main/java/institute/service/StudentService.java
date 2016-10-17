package institute.service;

import institute.entity.Student;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
@Transactional
public class StudentService {

    protected static Logger logger = Logger.getLogger("service");

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public List<Student> getAll() {
        logger.debug("Retrieving all students");

        final Session session = sessionFactory.getCurrentSession();
        final Query query = session.createQuery("from Student");
        return query.list();
    }

    public List<Object> getStudentsWithStipend() {
        logger.debug("Retrieving all students with stipend more then 1400");

        final Session session = sessionFactory.getCurrentSession();
        final Query query = session.createQuery("select s.firstName, s.lastName, m.quantity from Student as s, Money as m where s.id = m.studentId and m.quantity > 1400");
        return query.list();
    }
}
