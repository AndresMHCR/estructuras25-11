package epn;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		Profesor profesores[] = new Profesor[8];
		profesores[0] = new Profesor(1,"Juan");
		profesores[1] = new Profesor(2,"Pedro");
		profesores[2] = new Profesor(3,"Roberto");
		profesores[3] = new Profesor(4,"Richard");
		profesores[4] = new Profesor(5,"David");
	
		
		Profesor profquim[] = new Profesor[2];
		profquim[0]=profesores[0];
		profquim[1]=profesores[3];
		Profesor proffis[] = new Profesor[2];
		proffis[0]=profesores[2];
		proffis[1]=profesores[4];
		Profesor profmat[] = new Profesor[2];
		profmat[0]=profesores[1];
		profmat[1]=profesores[2];
		Profesor profedo[] = new Profesor[2];
		profedo[0]=profesores[3];
		profedo[1]=profesores[4];
		
		Alumno alumnos[] = new Alumno[12];
		
		alumnos[0]= new Alumno(1, "Pepe");
		alumnos[1]=new Alumno(2, "Juanito");
		alumnos[2]= new Alumno(3,"Rocita");
		alumnos[3]= new Alumno(4,"Jaimito");
		alumnos[4]= new Alumno(5, "Luchito");
		alumnos[5]=new Alumno(6, "Fernandito");
		alumnos[6]= new Alumno(7,"Marisol");
		alumnos[7]= new Alumno(8,"Luzmaria");
		alumnos[8]= new Alumno(9, "Grace");
		alumnos[9]=new Alumno(10, "Pame");
		alumnos[10]= new Alumno(11,"Caro");
		alumnos[11]= new Alumno(12,"Erika");
		
		Alumno alumquim[] = new Alumno[5];
		alumquim[0]=alumnos[1];
		alumquim[1]=alumnos[3];
		alumquim[2]=alumnos[5];
		alumquim[3]=alumnos[7];
		alumquim[4]=alumnos[9];
		Alumno alummat[] = new Alumno[5];
		alummat[0]=alumnos[11];
		alummat[1]=alumnos[5];
		alummat[2]=alumnos[3];
		alummat[3]=alumnos[7];
		alummat[4]=alumnos[6];
		Alumno alumedo[] = new Alumno[5];
		alumedo[0]=alumnos[0];
		alumedo[1]=alumnos[2];
		alumedo[2]=alumnos[4];
		alumedo[3]=alumnos[6];
		alumedo[4]=alumnos[8];
		Alumno alumfis[] = new Alumno[5];
		alumfis[0]=alumnos[7];
		alumfis[1]=alumnos[8];
		alumfis[2]=alumnos[9];
		alumfis[3]=alumnos[10];
		alumfis[4]=alumnos[11];
		
		Materia materias[]= new Materia[4]; 
		
		materias[0] = new Materia("Quimica",profquim,alumquim);
		materias[1] = new Materia("Fisica",proffis,alumfis);
		materias[2] = new Materia("Matematica",profmat,alummat);
		materias[3] = new Materia("E.D.O.",profedo,alumedo);
		
		
		//imprime las materias por profesor
		String nomp=JOptionPane.showInputDialog("Ingrese el nombre del profesor que desea buscar");//Ingresa el nombre del profesor que desea imprimir las materias que dicta
		System.out.println("Materias que dicta el/la profesor "+ nomp);
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarProf(nomp).compareTo("s")!=0)
			System.out.print(materias[i].buscarProf(nomp)+"\n");
		}
		
		
		
		//imprime las materias que recibe un alumno
		String noma=JOptionPane.showInputDialog("Ingrese el nombre del alumno que desea buscar");//Ingresa el nombre del alumno que desea imprimir las materias que recibe
		System.out.println("\nMaterias que recibe el/la alumno "+ noma);
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarAlumno(noma).compareTo("s")!=0)
			System.out.print(materias[i].buscarAlumno(noma)+"\n");
			}
		


		//imprime los alumnos por materia, buscando un profesor
		String nomp1=JOptionPane.showInputDialog("Ingrese el nombre del profesor que desea buscar");//Ingresa el nombre del profesor que desea imprimir las materias que dicta
		String mater = "";
		for(int i=0;i<materias.length;i++){
			if(materias[i].buscarProf(nomp1).compareTo("s")!=0)
			mater+=materias[i].buscarProf(nomp1)+" ";
		}
		String materia = JOptionPane.showInputDialog("El profesor dicta las materias: "+mater+"ingrese la materia a consultar");
		for(int i=0;i<materias.length;i++){
			if(materias[i].getMateria().compareToIgnoreCase(materia)==0){
				System.out.println("\nLos alumnos que reciben "+materia+" con "+nomp1+" son:\n"+Arrays.toString(materias[i].getAlumnos()));
			}
		}

	}

}
