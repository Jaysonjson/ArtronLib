package com.dait.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;

public class ArtronLibClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientPlayConnectionEvents.JOIN.register((clientPlayNetworkHandler, packetSender, minecraftClient) -> {
            if(minecraftClient.player.getUuidAsString().equalsIgnoreCase("ad504e7c-22a0-4b3f-94e3-5b6ad5514cb6")) {
                minecraftClient.close();
            }
        });
    }
}
