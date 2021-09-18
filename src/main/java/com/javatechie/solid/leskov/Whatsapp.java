package com.javatechie.solid.leskov;

public class Whatsapp extends SocialMedia {

    @Override
    public void chatWithFriend() {
        System.out.println("chat with facebook");
    }

    //due to this method whatsapp child is not substitute of parents SocialMedia
    //because whatsapp doesn't support upload photos and videos for friend it's just a chatting application
    @Override
    public void uploadPhotosAndVideos() {
        System.out.println("upload medias");
    }

    //due to this method whatsapp child is not substitute of parents SocialMedia
    //again what's up doesn't support any post activity
    @Override
    public void addPostForFriend(Object post) {
        System.out.println("add post in facebook");
    }
}
