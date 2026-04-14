package in.co.rays.user;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) throws Exception {
		//testAdd();
		//testFindByLogin();
		//testAuthenticate();
		//testSearch();
		//testupdate();
		testdelete();
	}

	private static void testSearch() {

		UserModel model = new UserModel();
		UserDTO dto = new UserDTO();

		dto.setFirstName("r");
		
		List<UserDTO> list = model.search(dto, 1, 10);

		Iterator<UserDTO> it = list.iterator();

		while (it.hasNext()) {
			dto = it.next();
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}

	}
	
	private static void testAuthenticate() {
		UserDTO dto = new UserDTO();
		UserModel model = new UserModel();

		dto = model.authenticate("ram123@gmail.com", "ram123");

		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		} else {
			System.out.println("invalid login or password");
		}

	}

	private static void testFindByLogin() {

		UserDTO dto = new UserDTO();
		UserModel model = new UserModel();

		dto = model.findByLogin("ram123@gmail.com");

		if (dto != null) {
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		} else {
			System.out.println("user not found");
		}

	}

	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();
		UserDTO dto = new UserDTO();

		dto.setFirstName("Yogesh");
		dto.setLastName("Sharma");
		dto.setLoginId("yogesh@gmail.com");
		dto.setPassword("yogesh123");
		dto.setAddress("Indore");
		dto.setDob(sdf.parse("2001-01-01"));

		model.add(dto);

	}
	
	private static void testupdate() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserModel model = new UserModel();
		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Yogesh");
		dto.setLastName("Sahu");
		dto.setLoginId("yogesh@gmail.com");
		dto.setPassword("yogesh123");
		dto.setAddress("Indore");
		dto.setDob(sdf.parse("2001-01-01"));

		model.update(dto);

	}

	private static void testdelete() throws Exception {
		
		UserModel model = new UserModel();
		UserDTO dto = new UserDTO();

		dto.setId(2);

		model.delete(dto);

	}
}
