import java.time.LocalDate;

public class TesteFeriado {
    // Definição das cores ANSI
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        // Instanciando diferentes objetos Feriado com datas reais
        Feriado feriadoNacional = new Feriado(TipoFeriadoEnum.NACIONAL, "Independência do Brasil", LocalDate.of(2024, 9, 7)); // Nacional - Brasil
        Feriado feriadoEstadual = new Feriado(TipoFeriadoEnum.ESTADUAL, "Revolução Constitucionalista", LocalDate.of(2024, 7, 9)); // Estadual - São Paulo
        Feriado feriadoMunicipal = new Feriado(TipoFeriadoEnum.MUNICIPAL, "Aniversário de São Paulo", LocalDate.of(2024, 1, 25)); // Municipal - São Paulo (Cidade)

        // Exibindo as informações dos feriados com cores
        System.out.println(ANSI_BLUE + "Informações do Feriado Nacional:" + ANSI_RESET);
        feriadoNacional.exibirInformacoes();
        System.out.println();

        System.out.println(ANSI_GREEN + "Informações do Feriado Estadual:" + ANSI_RESET);
        feriadoEstadual.exibirInformacoes();
        System.out.println();

        System.out.println(ANSI_YELLOW + "Informações do Feriado Municipal:" + ANSI_RESET);
        feriadoMunicipal.exibirInformacoes();
    }
}