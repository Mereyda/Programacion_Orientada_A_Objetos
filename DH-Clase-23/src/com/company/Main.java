package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Lo que conseguimos con el Factory es desacoplar la construcción del objeto, en lugar de estar utilizando el
        * constructor por todos lados, el unico lugar donde se utiliza el constructor es en el Factory y si el día de mañana
        * cambiamos el constructor, es decir sacamos o agregamos parametros en este, solo debemos modificar la factory*/

        /*Utilizamos un factory para crear las diferentes ofertas academicas en este caso una materia*/
        OfertaAcademica frontEnd =  OfertaAcademicaFactory.getInstancia()
                                    .crearOfertaAcademica(OfertaAcademicaFactory.CURSO);

        /*cargamos por consola los datos de la materia*/
        cargarCurso(frontEnd);

        /*Utilizamos un factory para crear las diferentes ofertas academicas en este caso una materia*/
        OfertaAcademica backEnd =  OfertaAcademicaFactory.getInstancia()
                                    .crearOfertaAcademica(OfertaAcademicaFactory.CURSO);

        /*cargamos por consola los datos de la materia*/
        cargarCurso(backEnd);

        /*Utilizamos un factory para crear las diferentes ofertas academicas en este caso un programa*/
        OfertaAcademica programa = OfertaAcademicaFactory.getInstancia()
                                    .crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO);

        /*cargamos por consola los datos del programa*/
        cargarProgramaIntensivo(programa);

        /*agregamos los cursos al programa*/
        agregarOferta(programa, frontEnd);
        agregarOferta(programa, frontEnd);

        /*Utilizamos un factory para crear las diferentes ofertas academicas en este caso una carrera*/
        OfertaAcademica carrera = OfertaAcademicaFactory.getInstancia()
                                    .crearOfertaAcademica(OfertaAcademicaFactory.CARRERA);
        cargarCarrera(carrera);

        agregarOferta(carrera,backEnd);
        agregarOferta(carrera,frontEnd);


        Instituto digitalHouse = new Instituto();
        digitalHouse.agregar(backEnd);
        digitalHouse.agregar(frontEnd);
        digitalHouse.agregar(programa);
        digitalHouse.agregar(carrera);
        digitalHouse.generarInforme();

    }

    public static void cargarCurso(OfertaAcademica oferta){
        Scanner scanner = new Scanner(System.in);
        Curso curso = null;

        System.out.println("Ingrese el nombre del curso: ");
        oferta.setNombre(scanner.nextLine());

        if(oferta instanceof Curso)
            curso = (Curso) oferta;

        System.out.println("Ingrese la carga horaria: ");
        curso.setCargaHoraria(scanner.nextDouble());

        System.out.println("Ingrese la duracion: ");
        curso.setDuracion(scanner.nextDouble());

        System.out.println("Ingrese el valor hora: ");
        curso.setValorHora(scanner.nextDouble());
    }

    public static void cargarProgramaIntensivo(OfertaAcademica oferta){
        Scanner scanner = new Scanner(System.in);
        ProgramaIntensivo programa = null;

        System.out.println("Ingrese el nombre del programa: ");
        oferta.setNombre(scanner.nextLine());

        if(oferta instanceof ProgramaIntensivo)
            programa = (ProgramaIntensivo) oferta;

        System.out.println("Ingrese el porcentaje de bonificacion: ");
        programa.setPorcentajeBonifiacion(scanner.nextDouble());
    }

    public static void cargarCarrera(OfertaAcademica oferta){
        Scanner scanner = new Scanner(System.in);
        Carrera carrera = null;

        System.out.println("Ingrese el nombre de la carrera: ");
        oferta.setNombre(scanner.nextLine());

        if(oferta instanceof Carrera)
            carrera = (Carrera) oferta;

        System.out.println("Ingrese el precio base: ");
        carrera.setPrecioBase(scanner.nextDouble());
    }

    public static void agregarOferta(OfertaAcademica ofertaContenedora, OfertaAcademica oferta)
    {
        if(ofertaContenedora instanceof ProgramaIntensivo)
            ((ProgramaIntensivo)ofertaContenedora).agregar(oferta);

        if(ofertaContenedora instanceof Carrera) {
            try {
                ((Carrera)ofertaContenedora).agregar(oferta);
            } catch (Exception e) {
                System.out.println("Error al agregar oferta academica: " + oferta.getNombre());
            }
        }


    }

}
