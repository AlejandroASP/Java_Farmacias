package es.cifpcm;

import java.util.ArrayList;

public interface Persistence {
    void openJson();
    void closeJson();
    void add (Farmacia farmacia);
    void delete (Farmacia farmacia);
    ArrayList<Farmacia> listaFarmacias();
}
