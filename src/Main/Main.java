package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.dao.HomePostDao;
import com.springframework.mysqltables.Announcement;
import com.springframework.mysqltables.HomePost;

public class Main {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/beanconfig/dao.xml");

			HomePostDao homePostDao = (HomePostDao) context.getBean("homePostDao");

			for (Announcement ann : homePostDao.getAnnounce()) {
				System.out.println(ann);
			}

			

			((ClassPathXmlApplicationContext) context).close();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
	}

}
