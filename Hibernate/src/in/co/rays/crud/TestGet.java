package in.co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.co.rays.user.MarksheetDTO;
import in.co.rays.user.UserDTO;

public class TestGet {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		MarksheetDTO dto = (MarksheetDTO) session.get(MarksheetDTO.class, 1);

		System.out.print(dto.getId());
		System.out.print("\t" + dto.getFirstName());
		System.out.print("\t" + dto.getLastName());
		System.out.print("\t" + dto.getPhysics());
		System.out.print("\t" + dto.getChemistry());
		System.out.print("\t" + dto.getMaths());

		session.close();
	}
}