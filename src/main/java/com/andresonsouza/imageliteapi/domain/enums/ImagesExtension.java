package com.andresonsouza.imageliteapi.domain.enums;

import org.springframework.http.MediaType;

import java.util.Arrays;

public enum ImagesExtension {
    PNG(MediaType.IMAGE_PNG),
    GIF(MediaType.IMAGE_GIF),
    JPEG(MediaType.IMAGE_JPEG);

    private MediaType mediaType;


    ImagesExtension(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public static ImagesExtension valueOf(MediaType mediaType) {
        return Arrays.stream(values()).filter(ie -> ie.mediaType.equals(mediaType)).findFirst().orElse(null);
    }
}
