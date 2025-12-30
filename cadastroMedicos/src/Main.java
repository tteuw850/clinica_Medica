//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico("Roberto", "Oftamologista");
        Medico m2 = new Medico("Junior", "Proctologista");
        Medico m3 = new Medico("Brendo", "Geral");
        Medico m4 = new Medico("Julia", "Ginecologista");

        Paciente p1 = new Paciente("Mateus", "133133", 21, "37999999");
        Paciente p2 = new Paciente("Julia", "233133", 22, "37888888");
        Paciente p3 = new Paciente("Brenda", "333133", 23, "37777777");
        Paciente p4 = new Paciente("Claudio", "433133", 24, "366666666");
        Paciente p5 = new Paciente("Rogério", "333133", 25, "3555555555");
        Paciente p6 = new Paciente("Carlos", "233133", 26, "34444444444");

        Agenda agenda1 = new Agenda(m1);
        agenda1.data = "22/10/2926";
        agenda1.adicionarPaciente(p1);
        agenda1.adicionarPaciente(p6);
        agenda1.removerPaciente(p6.cpf);
        agenda1.mostrarPaciente();


        Agenda agenda2 = new Agenda(m2);
        agenda2.data = "23/10/2026";
        agenda2.adicionarPaciente(p4);
        agenda2.mostrarPaciente();

        Agenda agenda3 = new Agenda(m3);
        agenda3.data = "25/10/2027";
        agenda3.adicionarPaciente(p5);
        agenda3.mostrarPaciente();

        Agenda agenda4 = new Agenda(m4);
        agenda4.data = "23/10/2028";
        agenda4.adicionarPaciente(p2);
        agenda4.adicionarPaciente(p3);
        agenda4.mostrarPaciente();


    }
}