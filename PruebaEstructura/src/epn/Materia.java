package epn;

import java.util.Arrays;

public class Materia {
	private String materia;
	private Profesor[] profesor;
	private Alumno[] alumnos;
	public Materia(String mat, Profesor[] profesor, Alumno[] alumnos) {
		super();
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.materia = mat;
	}
	public Profesor[] getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor[] profesor) {
		this.profesor = profesor;
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String buscarProf(String nomp){
		for(int i=0;i<profesor.length;i++){
			if(profesor[i].getNombre().compareToIgnoreCase(nomp)==0){
				return this.materia;
			}
		}
		return "s";
	}
	
	public String buscarAlumno(String nomp){
		for(int i=0;i<alumnos.length;i++){
			if(alumnos[i].getNombre().compareToIgnoreCase(nomp)==0){
				return this.materia;
			}
		}
		return "s";
	}
	@Override
	public String toString() {
		return "Materia: " + materia + ",\nProfesores: \n"
				+ Arrays.toString(profesor) + ",\nAlumnos: \n"
				+ Arrays.toString(alumnos) + "";
	}
	
	
	
}
