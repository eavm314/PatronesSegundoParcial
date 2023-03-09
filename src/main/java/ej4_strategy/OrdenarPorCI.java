package ej4_strategy;

import java.util.Comparator;
import java.util.List;

public class OrdenarPorCI implements IStrategyOrdenamiento{
    @Override
    public List<Estudiante> ordenar(List<Estudiante> estudianteList) {
        return estudianteList.stream().sorted(Comparator.comparing(Estudiante::getCi)).toList();
    }
}
