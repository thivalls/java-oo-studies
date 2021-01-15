package poo;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Thiago");
		student.setAge(33);
		student.setCpf("32779646802");
		student.setBirthday("13/07/1987");
		student.setFatherName("Norberto");
		student.setMotherName("Elisabete");
		student.setSchoolName("Arlindo Bittencourt");
		student.setYear("terceiro");
		student.setRegistration("13/07/2020");
		
		Topic topic = new Topic();
		topic.setName("Matemática");
		topic.setScore(100);
		
		Topic topic1 = new Topic();
		topic1.setName("Português");
		topic1.setScore(90);
		
		List<Topic> topics = new ArrayList<Topic>();
		
		topics.add(topic);
		topics.add(topic1);
		
		student.setTopics(topics);
		
		System.out.println(student);
	}

}
