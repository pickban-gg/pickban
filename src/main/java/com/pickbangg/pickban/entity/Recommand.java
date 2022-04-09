package com.pickbangg.pickban.entity;

import java.util.List;

public interface Recommand {
    public String calculate(String[] bans, List<String> myTeamPicks, List<String> opponentTeamPicks);
}
