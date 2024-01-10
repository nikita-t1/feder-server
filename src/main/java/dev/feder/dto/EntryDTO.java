package dev.feder.dto;

import java.io.Serializable;
import java.util.UUID;

public class EntryDTO implements Serializable {

    private UUID uuid;
    private UUID feedUuid;
    private String title;
    private String url;
    private String imageUrl;
    private String description;
    private String text;
    private String author;
    private String publishedDate;
    private String[] keywords;
    private boolean read = false;
    private boolean favorite = false;
    private boolean bookmark = false;

    public EntryDTO() {
    }

    public EntryDTO(UUID uuid, UUID feedUuid, String title, String url, String imageUrl, String description, String text, String author, String publishedDate, String[] keywords, boolean read, boolean favorite, boolean bookmark) {
        this.uuid = uuid;
        this.feedUuid = feedUuid;
        this.title = title;
        this.url = url;
        this.imageUrl = imageUrl;
        this.description = description;
        this.text = text;
        this.author = author;
        this.publishedDate = publishedDate;
        this.keywords = keywords;
        this.read = read;
        this.favorite = favorite;
        this.bookmark = bookmark;
    }

    public static class EntryDtoBuilder {
        private UUID uuid;
        private UUID feedUuid;
        private String title;
        private String url;
        private String imageUrl;
        private String description;
        private String text;
        private String author;
        private String publishedDate;
        private String[] keywords;
        private boolean read;
        private boolean favorite;
        private boolean bookmark;

        public EntryDtoBuilder() {
        }

        public EntryDtoBuilder setUuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public EntryDtoBuilder setFeedUuid(UUID feedUuid) {
            this.feedUuid = feedUuid;
            return this;
        }

        public EntryDtoBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public EntryDtoBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public EntryDtoBuilder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public EntryDtoBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public EntryDtoBuilder setText(String text) {
            this.text = text;
            return this;
        }

        public EntryDtoBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public EntryDtoBuilder setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
            return this;
        }


        public EntryDtoBuilder setKeywords(String[] keywords) {
            this.keywords = keywords;
            return this;
        }

        public EntryDtoBuilder setRead(boolean read) {
            this.read = read;
            return this;
        }

        public EntryDtoBuilder setFavorite(boolean favorite) {
            this.favorite = favorite;
            return this;
        }

        public EntryDtoBuilder setBookmark(boolean bookmark) {
            this.bookmark = bookmark;
            return this;
        }


        public EntryDTO createEntryDTO() {
            return new EntryDTO(uuid, feedUuid, title, url, imageUrl, description, text, author, publishedDate, keywords, read, favorite, bookmark);
        }


    }


}
