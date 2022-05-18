package com.hillel.lesson7.homework;

import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int countOfPlayers = 25;
        int minAge = 18;
        int maxAge = 40;

        teamPrintResult(countOfPlayers, minAge, maxAge, "team1");
        teamPrintResult(11, 10, 18, "team3");
        teamPrintResult(countOfPlayers, minAge, maxAge, "team5");
        teamPrintResult(10, 20, 50, "team2");
    }

    private static void teamPrintResult(int countOfPlayers, int minAge, int maxAge, String teamName) {
        int[] team = createTeam(minAge, maxAge, countOfPlayers);
        System.out.println("Players: " + Arrays.toString(team));
        averageAgeInTeam(teamName, team);
    }

    private static void averageAgeInTeam(String teamName, int[] team) {
        int sum = 0;
        for (int player : team) {
            sum+=player;
        }
        int average = sum / team.length;
        System.out.println("Avarage year of the team: " + average);
    }

    private static int[] createTeam(int minAge, int maxAge, int countOfPlayers) {
        Random random = new Random();
        int[] teamPlayers = new int[countOfPlayers];
        for (int i = 0; i < teamPlayers.length; i++) {
            int age = minAge + random.nextInt(maxAge - minAge + 1);
            teamPlayers[i] = age;
        }
        return teamPlayers;
    }
}
