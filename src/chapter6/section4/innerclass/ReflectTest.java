package chapter6.section4.innerclass;
import java.util.*;
import java.lang.reflect.*;;

public class ReflectTest {
	public static void main(String[] args){
		//�������л����û������������
		String name;
		if(args.length > 0) name = args[0];
		else{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a class name(e.g. java.util.Date)");
			name = in.next();
		}
		
		try{
			//print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());  //�õ���������η�
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print("class " + name);
			if(supercl != null && supercl != Object.class) System.out.println(" extends " + supercl.getName());
			
			System.out.print("{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	
	//��ӡ�����еĹ��췽��
	public  static void printConstructors(Class cl){
		Constructor[] constructors = cl.getDeclaredConstructors();
		for(Constructor c: constructors){
			String name = c.getName();
			System.out.print("\t");
			String modifiers = Modifier.toString(c.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");
			
			//��ӡ����������
			Class[] paramTypes = c.getParameterTypes();
			for(int j = 0; j < paramTypes.length; ++j){
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	//��ӡ�����еķ���
	public static void printMethods(Class cl){
		Method methods[] = cl.getDeclaredMethods();
		
		for(Method m: methods){
			String name = m.getName();
			Class retType = m.getReturnType();
			String modifiers = Modifier.toString(m.getModifiers());
			System.out.print("\t");
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
			
			Class paramTypes[] = m.getParameterTypes();
			for(int j = 0; j < paramTypes.length; ++j){
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	}
	
	//��ӡ�����е���
	public static void printFields(Class cl){
		Field fields[] = cl.getDeclaredFields();
		for(Field f : fields){
			String name = f.getName();
			Class type = f.getType();
			System.out.print("\t");
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}
}
