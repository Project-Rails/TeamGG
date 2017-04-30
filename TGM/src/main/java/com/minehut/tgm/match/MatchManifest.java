package com.minehut.tgm.match;

import com.minehut.tgm.modules.*;
import com.minehut.tgm.modules.MatchResultModule;
import com.minehut.tgm.modules.region.RegionManagerModule;
import com.minehut.tgm.modules.scoreboard.ScoreboardManagerModule;
import com.minehut.tgm.modules.team.TeamManagerModule;
import com.minehut.tgm.modules.visibility.VisibilityModule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luke on 4/27/17.
 */
public abstract class MatchManifest {

    /**
     * Determines which modules to load based on the
     * given gametype.
     * @return
     */
    public abstract List<MatchModule> allocateGameModules();

    /**
     * Core set of modules that nearly all games will use.
     * Match Manifests still have the option to override these
     * if needed.
     * @return
     */
    public List<MatchModule> allocateCoreModules() {
        List<MatchModule> modules = new ArrayList<>();

        modules.add(new TeamJoinNotificationsModule());
        modules.add(new SpectatorModule());
        modules.add(new SpawnPointHandlerModule());
        modules.add(new SpawnPointLoaderModule());
        modules.add(new VisibilityModule());
        modules.add(new TimeModule());
        modules.add(new TabListModule());
        modules.add(new MatchProgressNotifications());
        modules.add(new MatchResultModule());
        modules.add(new TeamManagerModule());
        modules.add(new ScoreboardManagerModule());
        modules.add(new RegionManagerModule());

        return modules;
    }
}
