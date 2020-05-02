package de.t0biii.music.listener;

import com.xxmicloxx.NoteBlockAPI.event.SongEndEvent;
import de.t0biii.music.domain.Music;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Set;
import java.util.UUID;

public class HANDLER_SongEndEvent implements Listener {

    @EventHandler
    public void onSongEnded(SongEndEvent event){
        Set<UUID> uuids = event.getSongPlayer().getPlayerUUIDs();
        for(UUID uuid : uuids){
            Music.stop(uuid);
        }
    }
}
