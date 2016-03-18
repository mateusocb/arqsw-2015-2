package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.UserBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	private EventBI eventBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}
	
	public void setEventBI(EventBI eventBI) {
		this.eventBI = eventBI;
	}
	
	@Override
	public boolean updateEvent(Event event) {
		eventBI.updateEvent(event);
	}
}