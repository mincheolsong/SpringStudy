package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	// 9강 까지 들음 !
	public static void main(String[] args) {
		
		/*
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(exam);
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
