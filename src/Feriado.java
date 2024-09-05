import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Feriado {
    private TipoFeriadoEnum tipo;
    private String descricao;
    private LocalDate data;

    // Construtor
    public Feriado(TipoFeriadoEnum tipo, String descricao, LocalDate data) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
    }

    // Getters e Setters
    public TipoFeriadoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoFeriadoEnum tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Metodo para exibir informações com cores e formatação de data
    public void exibirInformacoes() {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_CYAN = "\u001B[36m";

        // Formatação da data para o padrão dd/MM/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);

        System.out.println(ANSI_RED + "Tipo de Feriado: " + ANSI_CYAN + tipo + ANSI_RESET);
        System.out.println(ANSI_RED + "Descrição: " + ANSI_CYAN + descricao + ANSI_RESET);
        System.out.println(ANSI_RED + "Data: " + ANSI_CYAN + dataFormatada + ANSI_RESET);
    }
}