/*
UCF COP 3330 Fall 2021 Assignment 2 Solution
Copyright 2021 Cole Castille
 */

// Prompt the user to enter multiple strings such as a:
/*      <noun>
        <verb>
        <adjective>
        <adverb>
 */
// Use Scanners to read those strings
// Output "You play <noun> <adverb> on a <adjective> PC while you <verb>?! Poggers!"

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {

        //noun
        System.out.print("Enter a noun: ");
        Scanner s1 = new Scanner(System.in);
        String noun = s1.nextLine();
        //verb
        System.out.print("Enter a verb: ");
        Scanner s2 = new Scanner(System.in);
        String verb = s2.nextLine();
        //adjective
        System.out.print("Enter a adjective: ");
        Scanner s3 = new Scanner(System.in);
        String adj = s3.nextLine();
        //adverb
        System.out.print("Enter a adverb: ");
        Scanner s4 = new Scanner(System.in);
        String adv = s4.nextLine();

        System.out.print("You play " + noun + " " + adv + " on a " + adj + " PC while you " + verb + "?! Poggers!");
    }
}
