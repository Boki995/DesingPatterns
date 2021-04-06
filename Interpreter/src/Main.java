import java.lang.reflect.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");
		
		ConversionContext question = new ConversionContext(questionAsked);
		
		String fromConversion = question.getFromConversion();
		
		String toConversion = question.getToConversion();
		
		double quantity = question.getQuantity();
		
		try{
			
			Class tempClass= Class.forName(fromConversion);
			
			Constructor con = tempClass.getConstructor();
			
			Class[] methodParams = new Class[]{Double.TYPE};
			
			Method conversionMethod = tempClass.getMethod(toConversion, methodParams);
			
			Object convertFrom =(Expression) con.newInstance();
			
			Object[] params = new Object[]{new Double(quantity)};
			
			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
			
			String aswerToQues = question.getResponse() + toQuantity + " " + toConversion;
			
			JOptionPane.showMessageDialog(null, aswerToQues);
			
			frame.dispose();
			
		} catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
		}catch(NoSuchMethodException e){
			
			e.printStackTrace();
			
		}catch(SecurityException e){
			
			e.printStackTrace();
			
		}catch(InstantiationException e){
			
			e.printStackTrace();
			
		}catch(IllegalAccessException e){
			
			e.printStackTrace();
			
		}catch(IllegalArgumentException e){
			
			e.printStackTrace();
			
		}catch(InvocationTargetException e){
			
			e.printStackTrace();
			
		}
			
			
			
			
			
			
			
			
		

	}

}
