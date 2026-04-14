package in.co.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.user.MarksheetDTO;
import in.co.rays.user.UserDTO;

public class TestSave {

	public static void main(String[] args) {

		MarksheetDTO dto = new MarksheetDTO();
		dto.setFirstName("Ameya");
		dto.setLastName("Raut");
		dto.setPhysics("90");
		dto.setChemistry("83");
		dto.setMaths("89");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();
	}
}