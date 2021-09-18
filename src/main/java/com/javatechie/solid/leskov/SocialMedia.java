package com.javatechie.solid.leskov;

public abstract class SocialMedia {

    public abstract  void chatWithFriend();

    public abstract void addPostForFriend(Object post);

    public abstract  void uploadPhotosAndVideos();

    /**
     * @leskov same example we can discuss in Interface Segregation Principle
     *
     * because Whatsapp doesn't support for addPostForFriend() and uploadPhotosAndVideos() features,
     * so we shouldn't add in a single interface , let's segregate this interface to hold specific role
     * approach you can find in leskov.solution package
     * **/

}
