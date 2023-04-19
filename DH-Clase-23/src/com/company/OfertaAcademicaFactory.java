package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory factory = null;
    public static final String CURSO = "CURSO";
    public static final String PROGRAMA_INTENSIVO = "PROGRAMA_INTENSIVO";
    public static final String TALLER = "TALLER";
    public static final String CARRERA = "CARRERA";

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstancia(){
        if(factory == null)
            factory = new OfertaAcademicaFactory();

        return factory;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo){
        switch (tipo) {
            case OfertaAcademicaFactory.CURSO:
                return new Curso();
            case OfertaAcademicaFactory.PROGRAMA_INTENSIVO:
                return new ProgramaIntensivo();
            case OfertaAcademicaFactory.TALLER:
                return new Taller();
            case OfertaAcademicaFactory.CARRERA:
                return new Carrera();
        }
        return null;

    }


}

