import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void functionEveryPath() {
        assertEquals(SILab2.function(List.of("0","0","0","0")),List.of("0","0","0","0"));
        assertEquals(SILab2.function(List.of("0","0","0","#")),List.of("0","1","1","#"));
        assertEquals(SILab2.function(List.of("0","0","#","0")),List.of("1","0","#","1"));
        assertEquals(SILab2.function(List.of("0","0","#","#")),List.of("1","1","#","#"));
        assertEquals(SILab2.function(List.of("0","#","0","0")),List.of("1","#","0","1"));
        assertEquals(SILab2.function(List.of("0","#","0","#")),List.of("1","#","1","#"));
        assertEquals(SILab2.function(List.of("0","#","#","0")),List.of("2","#","#","2"));
        assertEquals(SILab2.function(List.of("0","#","#","#")),List.of("2","#","#","#"));
        assertEquals(SILab2.function(List.of("#","0","0","0")),List.of("#","1","1","0"));
        assertEquals(SILab2.function(List.of("#","0","0","#")),List.of("#","2","2","#"));
        assertEquals(SILab2.function(List.of("#","0","#","0")),List.of("#","1","#","1"));
        assertEquals(SILab2.function(List.of("#","0","#","#")),List.of("#","2","#","#"));
        assertEquals(SILab2.function(List.of("#","#","0","0")),List.of("#","#","1","1"));
        assertEquals(SILab2.function(List.of("#","#","0","#")),List.of("#","#","2","#"));
        assertEquals(SILab2.function(List.of("#","#","#","0")),List.of("#","#","#","2"));
        assertEquals(SILab2.function(List.of("#","#","#","#")),List.of("#","#","#","#"));
        assertEquals(SILab2.function(List.of("#")),List.of("#"));
        assertEquals(SILab2.function(List.of("0")),List.of("0"));


    }
    @Test
    public void functionEveryStatement()
    {
        assertEquals(SILab2.function(List.of("0","0","0","0")),List.of("0","0","0","0"));
        assertEquals(SILab2.function(List.of("0","0","0","#")),List.of("0","1","1","#"));
        assertEquals(SILab2.function(List.of("0","0","#","0")),List.of("1","0","#","1"));
        assertEquals(SILab2.function(List.of("0","0","#","#")),List.of("1","1","#","#"));
        assertEquals(SILab2.function(List.of("0","#","0","0")),List.of("1","#","0","1"));
        assertEquals(SILab2.function(List.of("0","#","0","#")),List.of("1","#","1","#"));
        assertEquals(SILab2.function(List.of("0","#","#","0")),List.of("2","#","#","2"));
        assertEquals(SILab2.function(List.of("0","#","#","#")),List.of("2","#","#","#"));
        assertEquals(SILab2.function(List.of("#","0","0","0")),List.of("#","1","1","0"));
        assertEquals(SILab2.function(List.of("#","0","0","#")),List.of("#","2","2","#"));
        assertEquals(SILab2.function(List.of("#","0","#","0")),List.of("#","1","#","1"));
        assertEquals(SILab2.function(List.of("#","0","#","#")),List.of("#","2","#","#"));
        assertEquals(SILab2.function(List.of("#","#","0","0")),List.of("#","#","1","1"));
        assertEquals(SILab2.function(List.of("#","#","0","#")),List.of("#","#","2","#"));
        assertEquals(SILab2.function(List.of("#","#","#","0")),List.of("#","#","#","2"));
        assertEquals(SILab2.function(List.of("#","#","#","#")),List.of("#","#","#","#"));
        assertEquals(SILab2.function(List.of("#")),List.of("#"));
        assertEquals(SILab2.function(List.of("0")),List.of("0"));
    }
}