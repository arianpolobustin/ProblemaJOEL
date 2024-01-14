package ProblemaJOEL;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class ProblemaTest {
	
    @Test
    void ProblemaJOEL() {
        List<String> input = Arrays.asList("3", "3", "Pikachu", "Charizard", "Bulbasaur", "5", "Bulbasaur", "Charizard", "Pikachu", "Bulbasaur", "Charizard", "6", "Geodude", "Jigglypuff", "Jigglypuff", "Jigglypuff", "Geodude", "Psyduck");
        Problema problema = new Problema();
        problema.main(input);
    }

	@Test
	void UnaCarta() {
	    List<String> input = Arrays.asList("1", "1", "Pikachu");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
	@Test
	void NoTensCartes() {
	    List<String> input = Arrays.asList("1", "0");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
	@Test
	void MoltsNoTensCartes() {
	    List<String> input = Arrays.asList("10", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
	@Test
	void DiferentsCasosDeProva_UnaCarta() {
	    List<String> input = Arrays.asList("5", "1", "Pikachu", "1", "Charmander", "1", "Charizard", "1", "Bulbasaur", "1", "Geodude");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
	@Test
	void DiferentsCasosDeProva_UnaCarta_i_Repetit() {
	    List<String> input = Arrays.asList("6", "1", "Pikachu", "1", "Charmander", "1", "Charizard", "1", "Bulbasaur", "1", "Geodude", "3", "Geodude", "Jigglypuff", "Geodude");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
	@Test
	void DiferentsCasosDeProva_MoltsUnaCarta() {
	    List<String> input = Arrays.asList("5", "3", "Pikachu", "Charizard", "Bulbasaur", "3", "Charmander", "Jigglypuff", "Geodude", "3", "Charizard", "Bulbasaur", "Geodude", "3", "Bulbasaur", "Pikachu", "Charizard", "3", "Geodude", "Jigglypuff", "Psyduck");
	    Problema problema = new Problema();
	    problema.main(input);
	}
	
    @Test
    void NoRepetit() {
        List<String> input = Arrays.asList("1", "3", "Pikachu", "Charizard", "Bulbasaur");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void Repetit() {
        List<String> input = Arrays.asList("1", "3", "Geodude", "Jigglypuff", "Geodude");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void RepetitMateixaQuantitat() {
        List<String> input = Arrays.asList("1", "5", "Bulbasaur", "Charizard", "Pikachu", "Bulbasaur", "Charizard");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void Repetit_i_RepetitMateixaQuantitat() {
        List<String> input = Arrays.asList("1", "7", "Geodude", "Jigglypuff", "Jigglypuff", "Jigglypuff", "Geodude", "Psyduck", "Psyduck");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void MoltsRepetitsMateixaQuantitat() {
        List<String> input = Arrays.asList("1", "10", "Pikachu", "Pikachu", "Charizard", "Charizard", "Bulbasaur", "Bulbasaur", "Geodude", "Geodude", "Jigglypuff", "Jigglypuff");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void MoltsRepetit() {
        List<String> input = Arrays.asList("1", "10", "Bulbasaur", "Charizard", "Pikachu", "Bulbasaur", "Charizard", "Pikachu", "Pikachu", "Geodude", "Geodude", "Geodude");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void DiferentsCasosDeProva_Repetit() {
        List<String> input = Arrays.asList("2", "3", "Geodude", "Jigglypuff", "Geodude", "4", "Pikachu", "Charmander", "Charmander", "Geodude");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void DiferentsCasosDeProva_MoltsRepetit() {
        List<String> input = Arrays.asList("2", "10", "Pikachu", "Pikachu", "Charizard", "Charizard", "Bulbasaur", "Bulbasaur", "Geodude", "Geodude", "Jigglypuff", "Jigglypuff", "10", "Geodude", "Geodude", "Charmander", "Charmander", "Jigglypuff", "Jigglypuff", "Pikachu", "Pikachu", "Charizard", "Charizard");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void DiferentsCasosDeProva_RepetitsMateixaQuantitat() {
        List<String> input = Arrays.asList("2", "5", "Bulbasaur", "Charizard", "Pikachu", "Bulbasaur", "Charizard", "5", "Geodude", "Jigglypuff", "Pikachu", "Geodude", "Jigglypuff");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void DiferentsCasosDeProva_MoltsRepetit_i_MoltsRepetitMateixaQuantitat() {
        List<String> input = Arrays.asList("2", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Bulbasaur", "Meowth", "Meowth", "Meowth", "Meowth", "Charmander", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Jigglypuff", "Jigglypuff", "Psyduck", "Psyduck", "Snorlax", "Snorlax");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void CasDeProvaMix1() {
        List<String> input = Arrays.asList("5", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Bulbasaur", "Meowth", "Meowth", "Meowth", "Meowth", "Charmander", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Jigglypuff", "Jigglypuff", "Psyduck", "Psyduck", "Snorlax", "Snorlax", "10", "Charmander", "Charmander", "Eevee", "Eevee", "Jigglypuff", "Jigglypuff", "Snorlax", "Snorlax", "Pikachu", "Pikachu", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Charmander", "Meowth", "Meowth", "Skuntank", "Skuntank", "Charmander", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Charmander", "Meowth", "Meowth", "Geodude", "Geodude", "Charmander");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void CasDeProvaMix2() {
        List<String> input = Arrays.asList("5", "10", "Gengar", "Gengar", "Machop", "Machop", "Machop", "Onix", "Onix", "Onix", "Onix", "Vulpix", "10", "Gengar", "Gengar", "Machop", "Machop", "Clefairy", "Clefairy", "Poliwag", "Poliwag", "Gyarados", "Gyarados", "10", "Vulpix", "Vulpix", "Oddish", "Oddish", "Clefairy", "Clefairy", "Gyarados", "Gyarados", "Gengar", "Gengar", "10", "Gengar", "Gengar", "Machop", "Machop", "Vulpix", "Onix", "Onix", "Magikarp", "Magikarp", "Vulpix", "10", "Gengar", "Gengar", "Machop", "Machop", "Vulpix", "Onix", "Onix", "Diglett", "Diglett", "Vulpix");
        Problema problema = new Problema();
        problema.main(input);
    }
    
    @Test
    void GranMixCasDeProva() {
        List<String> input = Arrays.asList("7", "5", "Bulbasaur", "Charizard", "Pikachu", "Bulbasaur", "Charizard", "10", "Pikachu", "Pikachu", "Bulbasaur", "Bulbasaur", "Bulbasaur", "Meowth", "Meowth", "Meowth", "Meowth", "Charmander", "10", "Lapras", "Lapras", "Growlithe", "Growlithe", "Growlithe", "Cubone", "Cubone", "Cubone", "Cubone", "Pidgey", "10", "Lapras", "Lapras", "Growlithe", "Growlithe", "Kadabra", "Kadabra", "Abra", "Abra", "Machoke", "Machoke", "10", "Pidgey", "Pidgey", "Bellsprout", "Bellsprout", "Kadabra", "Kadabra", "Machoke", "Machoke", "Lapras", "Lapras", "10", "Lapras", "Lapras", "Growlithe", "Growlithe", "Pidgey", "Cubone", "Cubone", "Rattata", "Rattata", "Pidgey", "10", "Lapras", "Lapras", "Growlithe", "Growlithe", "Pidgey", "Cubone", "Cubone", "Sandshrew", "Sandshrew", "Pidgey", "10", "Golem", "Golem", "Arcanine", "Arcanine", "Arcanine", "Marowak", "Marowak", "Marowak", "Marowak", "Pidgeotto", "10", "Golem", "Golem", "Arcanine", "Arcanine", "Alakazam", "Alakazam", "Kadabra", "Kadabra", "Machamp", "Machamp", "10", "Pidgeotto", "Pidgeotto", "Weepinbell", "Weepinbell", "Alakazam", "Alakazam", "Machamp", "Machamp", "Golem", "Golem", "10", "Golem", "Golem", "Arcanine", "Arcanine", "Pidgeotto", "Marowak", "Marowak", "Raticate", "Raticate", "Pidgeotto", "10", "Golem", "Golem", "Arcanine", "Arcanine", "Pidgeotto", "Marowak", "Marowak", "Sandslash", "Sandslash", "Pidgeotto");
        Problema problema = new Problema();
        problema.main(input);
    }

    
}