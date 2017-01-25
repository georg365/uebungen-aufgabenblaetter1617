package aufgabenblatt4;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	
	private int speed = 5;
	private Grid<Actor> grid;
    private Location location;
    private int direction;
    private Color color;
	
    
	public Car(){
		setColor(Color.GREEN);
		setDirection(Location.EAST);		
	}
	
	@Override
	public void act(){		
		for(int i=0; i<speed; i++){
			preview();
			move();
		}              
    }

	
	
	public void preview() {
		Location loc = getLocation();
		Class<? extends Location> klasse;
		for (int i = 0; i<speed; i++){
			Location next = loc.getAdjacentLocation(getDirection());
			loc = next;
			klasse = next.getClass();
			
		}
		
		Location next1 = loc.getAdjacentLocation(getDirection());
		Location next2 = next1.getAdjacentLocation(getDirection());
		Location next3 = next2.getAdjacentLocation(getDirection());
				
	}

	
	public int getSpeed() {
		return speed;
	}

	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	

	
	
	public boolean canMove(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }

	public void move(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location next1 = next.getAdjacentLocation(getDirection());
        if (gr.isValid(next1))
            moveTo(next1);
        else
        	removeSelfFromGrid();
	}
	
        
        
    
	

}
