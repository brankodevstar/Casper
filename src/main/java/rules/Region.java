package rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Map;

@Getter
@ToString
public class Region {
    public int matching;
    public int preTest;
    public int start;
    public int time;
    public int percentage;
    public ArrayList<String> character;
    public int winStart;
    public int o1;
    @JsonProperty("02")
    public int _02;
    @JsonProperty("03")
    public int _03;
    @JsonProperty("04")
    public int _04;
    @JsonProperty("05")
    public int _05;
    @JsonProperty("06")
    public int _06;
    @JsonProperty("07")
    public int _07;
    @JsonProperty("08")
    public int _08;
    public ArrayList<String> external;
    public int windowsecondslotThreshold;
    public int windowPercentage;
    public int windowSecondslotDuration;
    public ArrayList<String> windowSecondSlotLiquidityPools;
    public Map<String, Category> category;
}
