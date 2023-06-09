package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	// 14강 
	public static void main(String[] args) {
		
		/*
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole(exam);
		
		console.setExam(exam);
		*/
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		
		
//		for(Exam e : exams) {
//			System.out.println(e);
//		}
		
	}

}
