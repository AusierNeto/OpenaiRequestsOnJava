package com.tinit;

import demo.openai.Whisper;

public class Main {
    public static void main(String[] args) {
        System.out.println(Openai.chatGPT("Me Responda uma pergunta"));
        System.out.println(Whisper.transcribe("recording1.wav"));
    }
}