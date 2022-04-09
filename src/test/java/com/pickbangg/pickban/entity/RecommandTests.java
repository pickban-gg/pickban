package com.pickbangg.pickban.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StubRecommand implements Recommand {

    @Override
    public String calculate(String[] bans, List<String> myTeamPicks, List<String> opponentTeamPicks) {
        return "진";
    }
}
public class RecommandTests {
    @Test
    public void test_추천알고리즘에_밴목록과픽목록을던지면추천을해준다() {
        Recommand recommand = new StubRecommand();
        String[] bans = {"아리", "아칼리", "라이즈", "제드", "사이온", null, "이블린", "리신", "트런들", "야스오"};
        List<String> myTeamPicks = Arrays.asList("오른", "애니비아");
        List<String> opponentTeamPicks = Arrays.asList("케이틀린", "나미");

        String result = recommand.calculate(bans, myTeamPicks, opponentTeamPicks);

        assertThat(result).isEqualTo("진");
    }
}
