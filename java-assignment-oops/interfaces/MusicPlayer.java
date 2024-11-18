package assignment;

import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    public void play() {
        System.out.println("Playing music on MP3 Player!");
    }

    public void pause() {
        System.out.println("Pausing music on MP3 Player!");
    }

    public void stop() {
        System.out.println("Stopping music on MP3 Player!");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("Playing music on CD Player.");
    }

    public void pause() {
        System.out.println("Pausing music on CD Player.");
    }

    public void stop() {
        System.out.println("Stopping music on CD Player.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming music on Streaming Player.");
    }

    public void pause() {
        System.out.println("Pausing music on Streaming Player.");
    }

    public void stop() {
        System.out.println("Stopping music on Streaming Player.");
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a music player: ");
        System.out.println("1.MP3 Player");
        System.out.println("2.CD Player");
        System.out.println("3.Streaming Player");
        int choice = scanner.nextInt();
        
        Playable player;
        
        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        while (true) {
            System.out.println("Choose an action: ");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Exit");
            int action = scanner.nextInt();
            
            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Please choose proper value...");
            }
        }
    }
}
