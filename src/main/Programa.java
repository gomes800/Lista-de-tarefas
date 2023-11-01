package main;

import entities.Tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tarefas> lista = new ArrayList<>();

        System.out.println("Quantas tarefas deseja adicionar:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++) {
            System.out.print("Nome da tarefa: ");
            String nome = sc.nextLine();
            System.out.print("Descricao: ");
            String descricao = sc.nextLine();
            lista.add(new Tarefas(nome, descricao));
        }
        for (Tarefas tarefa : lista) {
            System.out.println("Tarefa: " + tarefa.getNome());
            System.out.println("Descricao: " + tarefa.getDescricao());
            System.out.println("Concluida: " + tarefa.isConcluida());
        }




        sc.close();
    }
}
