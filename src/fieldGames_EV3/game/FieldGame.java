/**
 * 
 */
package fieldGames_EV3.game;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;

import fieldGames_EV3.graphics.Circle;
import fieldGames_EV3.graphics.EV3PrintableForm;
import fieldGames_EV3.graphics.Mark;
import fieldGames_EV3.graphics.Polygon;

public abstract class FieldGame {
	
	protected GameField gameField;
	protected EnumMap<PlayerEnumeration, EV3PrintableForm> playerTokenMapping = new EnumMap<>(PlayerEnumeration.class);
	
	protected abstract void initPlayerFormMapping(int numberOfPlayers);
	
	public GameField getGameField() {
		return this.gameField;
	}
	
	public EnumMap<PlayerEnumeration, EV3PrintableForm> getPlayersWithToken() {
		return this.playerTokenMapping;
	}
}
