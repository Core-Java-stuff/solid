package com.javatechie.solid.leskov;

public class FaceBook extends SocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("chat with facebook");
    }

    @Override
    public void addPostForFriend(Object post) {
        System.out.println("add post in facebook");
    }

    @Override
    public void uploadPhotosAndVideos() {
        System.out.println("upload medias in facebook");
    }
}
