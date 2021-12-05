package com.hadroncfy.sreplay.mixin;

import com.hadroncfy.sreplay.recording.Photographer;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import org.apache.commons.lang3.mutable.MutableObject;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.network.Packet;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ThreadedAnvilChunkStorage;
import net.minecraft.util.math.ChunkPos;

@Mixin(ThreadedAnvilChunkStorage.class)
public interface ThreadedAnvilChunkStorageAccessor {
    @Accessor("watchDistance")
    int getWatchDistance();

    @Invoker("sendWatchPackets")
    void sendWatchPackets(ServerPlayerEntity player, ChunkPos pos, MutableObject<ChunkDataS2CPacket> mutableObject, boolean oldWithinViewDistance, boolean newWithinViewDistance);
}