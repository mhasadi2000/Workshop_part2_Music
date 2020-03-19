package com.company;

/**
 * the MusicPlayer class is used to provide
 * basic playing of music files.
 * @author Mohammad Hossein Asadi
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
        isPlaying = true;
    }

    /**Stop the playing music.**/
    public void stop()
    {
        System.out.println("player is stopped!");
        isPlaying = false;
    }
}