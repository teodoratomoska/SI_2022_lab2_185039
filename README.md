# Втора лабораториска вежба по Софтверско инженерство

## Теодора Томоска, бр. на индекс 185039

###  Control Flow Graph

![Alt text](graphImage/silab2.png?raw=true "Control Flof Graph")

### Цикломатска комплексност

Според формулата за цикломатска комплексност ЦК = Р - Ј + К.
Каде Р - бројот на рабови, Ј - бројот на јазли, К - бројот на конекции.

Р = 28
Ј = 24
К = 1

ЦК = 28 - 24 + 2 = 6

Цикломатска комплексност на според овој контролен граф за функцијата изнесува 6.

### Тест случаи според критериумот  Every statement 
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
### Тест случаи според критериумот  Every path

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

### Објаснување на напишаните unit tests
Функциите се така направени да ги поминат сите услови во кодот. За исклучоците имав проблем со JUnit затоа не се вклучени.
Пример како би изгледал една проверка:
        
 IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0","#")));
 
 assertTrue(thrown.getMessage().contains("List length should be a perfect square")); 