package br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.app;


import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Voador;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.comportamentos.Predador;

import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Animal;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Gato;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Baleia;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Tigre;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Foca;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Falcao;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Emu;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Ganso;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Albatroz;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.PeixePalhaço;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Tilapia;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Salmao;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Arraia;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Tartaruga;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Jacare;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Iguana;
import br.edu.atitus.ARTUR_MACHADO_IBANEZ.zoo_digital.animais.Harpia; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {
    private static final List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean executando = true;

            while (executando) {
                exibirMenu();
                int opcao;
                
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.nextLine(); // Limpa a linha inteira de entrada inválida
                    continue;
                }

                switch (opcao) {
                    case 1 -> cadastrarAnimal(scanner);
                    case 2 -> listarTodosAnimais();
                    case 3 -> listarAnimaisCorredores();
                    case 4 -> listarAnimaisNadadores();
                    case 5 -> listarAnimaisVoadores();
                    case 6 -> listarAnimaisPredadores();
                    case 7 -> exibirTotalAnimais();
                    case 0 -> executando = false;
                    default -> System.out.println("Opção inválida!");
                }
            }
            System.out.println("Sistema Zoo Digital encerrado.");
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU ZOO DIGITAL ===");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static Animal criarMamifero(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o mamífero:");
        System.out.println("1. Gato (Cachorro)");
        System.out.println("2. Baleia (Golfinho)");
        System.out.println("3. Tigre (Leão)");
        System.out.println("4. Foca (Orca)");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> {
                // CORREÇÃO: Usando Gato, que tem raça, conforme seu código anterior
                System.out.print("Digite a raça do Gato: ");
                String raca = scanner.nextLine();
                yield new Gato(nome, idade, raca);
            }
            case 2 -> new Baleia(nome, idade);
            case 3 -> new Tigre(nome, idade);
            case 4 -> new Foca(nome, idade);
            default -> null;
        };
    }

    private static Animal criarAve(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha a ave:");
        System.out.println("1. Falcao (Águia)");
        System.out.println("2. Emu (Avestruz)");
        System.out.println("3. Ganso (Pato)");
        System.out.println("4. Albatroz (Pinguim)");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new Falcao(nome, idade);
            case 2 -> new Emu(nome, idade);
            case 3 -> {
                System.out.print("Digite a cor das penas do Ganso: ");
                String corPenas = scanner.nextLine();
                yield new Ganso(nome, idade, corPenas);
            }
            case 4 -> {
                // Assumindo que você usa Albatroz para representar Pinguim no cadastro
                System.out.print("Digite a cor das penas do Albatroz: ");
                String corPenas = scanner.nextLine();
                yield new Albatroz(nome, idade, corPenas);
            }
            default -> null;
        };
    }

    private static Animal criarPeixe(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o peixe:");
        System.out.println("1. Peixe Palhaço (Peixe Morcego)");
        System.out.println("2. Tilápia (Piranha)");
        System.out.println("3. Salmão (Traíra)");
        System.out.println("4. Arraia (Tubarão)");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new PeixePalhaço(nome, idade);
            case 2 -> new Tilapia(nome, idade);
            case 3 -> new Salmao(nome, idade);
            case 4 -> new Arraia(nome, idade);
            default -> null;
        };
    }

    private static Animal criarReptil(Scanner scanner, String nome, int idade) {
        System.out.println("Escolha o réptil:");
        System.out.println("1. Tartaruga (Cobra)");
        System.out.println("2. Jacaré (Crocodilo)");
        System.out.println("3. Iguana (Lagarto)");
        System.out.println("4. Harpia (Pterodactylo)");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        return switch (tipo) {
            case 1 -> new Tartaruga(nome, idade);
            case 2 -> new Jacare(nome, idade);
            case 3 -> new Iguana(nome, idade);
            case 4 -> new Harpia(nome, idade); // Assumindo Harpia é um dos répteis
            default -> null;
        };
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("\n=== CADASTRO DE ANIMAL ===");
        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Mamífero");
        System.out.println("2. Ave");
        System.out.println("3. Peixe");
        System.out.println("4. Réptil");
        
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade do animal: ");
        
        int idade;
        if (scanner.hasNextInt()) {
            idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
        } else {
            System.out.println("Idade inválida. Cadastro cancelado.");
            scanner.nextLine();
            return;
        }

        Animal animal = switch (tipo) {
            case 1 -> criarMamifero(scanner, nome, idade);
            case 2 -> criarAve(scanner, nome, idade);
            case 3 -> criarPeixe(scanner, nome, idade);
            case 4 -> criarReptil(scanner, nome, idade);
            default -> {
                System.out.println("Opção de grupo inválida.");
                yield null;
            }
        };

        if (animal != null) {
            animais.add(animal); // Upcasting: Adiciona a subclasse como Animal
            System.out.println("Animal cadastrado com sucesso!");
        } else if (tipo >= 1 && tipo <= 4) {
             System.out.println("Opção de animal específica inválida. Cadastro cancelado.");
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n=== TODOS OS ANIMAIS ===");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println("\nNome: " + animal.getNome());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom(); // Polimorfismo
            animal.comer();     // Polimorfismo
        }
    }

    private static void listarAnimaisCorredores() {
        System.out.println("\n=== ANIMAIS CORREDORES ===");
        boolean encontrado = false;
        for (Animal animal : animais) {
            // Pattern Matching for instanceof (Downcasting Seguro)
            if (animal instanceof Corredor corredor) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                corredor.correr();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhum animal corredor cadastrado.");
    }

    private static void listarAnimaisNadadores() {
        System.out.println("\n=== ANIMAIS NADADORES ===");
        boolean encontrado = false;
        for (Animal animal : animais) {
            // Pattern Matching for instanceof (Downcasting Seguro)
            if (animal instanceof Nadador nadador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                nadador.nadar();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhum animal nadador cadastrado.");
    }

    private static void listarAnimaisVoadores() {
        System.out.println("\n=== ANIMAIS VOADORES ===");
        boolean encontrado = false;
        for (Animal animal : animais) {
            // Pattern Matching for instanceof (Downcasting Seguro)
            if (animal instanceof Voador voador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                voador.voar();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhum animal voador cadastrado.");
    }

    private static void listarAnimaisPredadores() {
        System.out.println("\n=== ANIMAIS PREDADORES ===");
        boolean encontrado = false;
        for (Animal animal : animais) {
            // Pattern Matching for instanceof (Downcasting Seguro)
            if (animal instanceof Predador predador) {
                System.out.println("\nNome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                predador.cacar();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhum animal predador cadastrado.");
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n=== TOTAL DE ANIMAIS ===");
        // Uso de atributo e método static
        System.out.println("Total de animais no zoológico: " + Animal.getContador()); 
    }
}