import java.util.ArrayList;

public class Agenda {
    String data;
    ArrayList<Paciente> pacientes;
    Medico medico;

    public Agenda(Medico medico) {
        pacientes = new ArrayList<>();
        data = "";
        this.medico = medico;
    }


    public void adicionarPaciente(Paciente p ){
        pacientes.add(p);
    }

    public void removerPaciente(String cpf){
        for (int i = 0; i<pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i).getNome() + " removido com sucesso");
                pacientes.remove(i);
                return;
            }
        }

    }

    public void pesquisarPaciente(String cpf){
        for (int i = 0; i<pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println("Paciente pesquisado:\n" +
                        pacientes.get(i).getNome() +
                        pacientes.get(i).getIdade() +
                        pacientes.get(i).getTelefone());
                return;
            }
        }
    }

    public void mostrarPaciente(){
        for (int i = 0; i<pacientes.size(); i++) {
            System.out.println("Data: " + data + " " + "Médico: " + medico.getNome() + " " + medico.getEspecialidade());
            Paciente p = pacientes.get(i);
            System.out.println(i+1 + ", " + p.getNome()+ ", " + p.getIdade() + ", " + p.getTelefone());

        }
    }


}
