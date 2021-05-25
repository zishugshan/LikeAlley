package com.example.likealley.Model;

public class StoryModel {

    int story, storyType, profile;
    String name;

    public StoryModel(int story, int storyTpe, int profile, String name) {
        this.story = story;
        this.storyType = storyType;
        this.profile = profile;
        this.name = name;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getStoryTpe() {
        return storyType;
    }

    public void setStoryTpe(int storyType) {
        this.storyType = storyType;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
