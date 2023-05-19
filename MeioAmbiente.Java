import java.util.ArrayList;
import java.util.List;

public class AnimalMonitoringAI {
    private List<Animal> animals;

    public AnimalMonitoringAI() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void monitorAnimals() {
        for (Animal animal : animals) {
            // Realizar monitoramento dos sinais vitais e comportamento do animal

            // Coletar os dados vitais e comportamentais do animal
            double frequenciaCardiaca = animal.getFrequenciaCardiaca();
            double atividade = animal.getAtividade();

            // Enviar os dados para o sistema de análise em tempo real via 5G
            enviarDadosParaAnalise(frequenciaCardiaca, atividade);
        }
    }
 
}
private void enviarDadosParaAnalise(double frequenciaCardiaca, double atividade) {
    // Implementar o envio dos dados para o sistema de análise em tempo real via 5G
    // Código para enviar os dados usando a tecnologia 5G
}

public static void main(String[] args) {
    AnimalMonitoringAI animalMonitoringAI = new AnimalMonitoringAI();

    // Criar instâncias de animais e adicioná-los ao sistema de monitoramento
    Animal animal1 = new Animal("Tigre");
    Animal animal2 = new Animal("Macaco");
    // Adicionar mais animais, se necessário

    animalMonitoringAI.addAnimal(animal1);
    animalMonitoringAI.addAnimal(animal2);
    // Adicionar mais animais, se necessário

    // Iniciar o monitoramento dos animais
    animalMonitoringAI.monitorAnimals();
}
}

class Animal {
private String nome;
private double frequenciaCardiaca;
private double atividade;

public Animal(String nome) {
    this.nome = nome;
    // Inicializar os dados vitais e comportamentais do animal
    frequenciaCardiaca = 0.0;
    atividade = 0.0;
}

public String getNome() {
    return nome;
}

public double getFrequenciaCardiaca() {
    return frequenciaCardiaca;
}

public double getAtividade() {
    return atividade;
}
