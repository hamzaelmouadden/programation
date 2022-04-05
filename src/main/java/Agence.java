import java.util.ArrayList;

public class Agence {
    private  String nomAgence;
    private ArrayList<Client> clients;

    public ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "nomAgence='" + nomAgence + '\'' +
                ", clients=" + clients +
                '}';
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

}
