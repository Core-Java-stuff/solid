package com.javatechie.solid.leskov;

public class Instagram extends SocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("chat with insta");
    }

    @Override
    public void uploadPhotosAndVideos() {
        System.out.println("upload medias in insta");
    }
    @Override
    public void addPostForFriend(Object post) {
        System.out.println("add post in facebook");
    }
}
