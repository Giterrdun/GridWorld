Part 1
----------------------------------------------
1. no sometimes it takes a step to switch directions.
2.the bug's north
3. it turns.
4. a flower 
5.the bug turns right
6.It makes a 45 degree turn
7.no
8. It has the color of the bug and after time its color turns darker.
9. no it behaves like an edge.
10.no

Exercises
1.
0 -> North
45 -> NorthEast
90-> East
135-> SouthEast
180 -> South
225 -> SouthWest
270 -> West
315 -> NorthWest
360 -> North

2. I can move the bug in the x and y direction; I can move the bug as far as the grid allows; If i try to move the bug outside the grid I get an error.

3.void setColor(java.awt.Color)

4.The bug is gone

Part 2
------------------------------------------------
1. The role of the variable is say how many  steps the box bug will take.

2.The role of the instance variable steps is to count how many steps the bug has taken.

3. To turn 90degrees.

4.Because the BoxBug class is a child of the Bug class where it does have a move method.

5.No, because you set the length.

6.No, because there is only one direction to turn.

7.After the box bug turns.


1. The CircleBug instead of making 90 degree turns makes 45 degree turns.

5. to add another boxBug actor to the grid I would need to create a new box bug object and reference it. Then place it into the grid.

Part 3
----------------------------------------------
Do You Know?

1.loc1.getRow();
2.false
3.(4,4)
4.135
5.It uses the direction you give it.

1.getNieghbors();getEMptyAdjacentLocations();
2.isValid(Location (10,10));
3.The implementation of these methods might be found in child classes of Grid.
4.No, because Arrays have a fixed length and there could be a lot of objects.

1.Color,position,direction
2.0(North),color of the actor
3.Because Actors needed to be more that just a reference type.
4.No,No,NO, the actor is gone and can't place itself in.
5. Turn twice or set direction to 90 more than where it is at.

1.if (gr ==null) return false;
2.return (neighbor ==null) || (neighbor instanceof Flower) ;
3.isValid() to know if the actor is within the grid.
4.getAdjacentLocation() to know the actors adjacent location.
5.getGrid(),getLocation(),getDirection(), to know the position and direction of the actor.
6.A turn 90 degree method is used instead.
7.yes because it is used to find the next location.
8.Because the dropping flower method, although it is used the same by every bug, is an action done by that certain bug.
9.No 
10.Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc);
11.4

Group Activity

1.
a)It will jump next step.
b)move then turn right.
c)turn right.
d)move and remove the other bug.
e)move and remove the jumper.
f)Test if a rock or flower is diagonal to it.
2.
a)extends Bug class.
b)similar to the boxBug in which is goes a certain length.
c) No we are not passing it anything, the move twice feature can be implemented inside the JumperBug class.
d)Act method
e)canJump
f)Making a runner wit rocks or flowers in its path.
3.


Part 4
----------------------------------------------
1.act(),getActors(),processActors(),getMoveLocations(),selectMoveLocation,makeMove()
2.act, getActors, processActors,getMoveLocations,SelectMoveLocations, makeMove
3.yes It needs to overide to be able to do its own thing.
4.It could eat, change color, or make it move.
5.getMoveLocations, gets a list of empty adjacent locations to the critter; selectMoveLocation,randomly chooses one of these locations;makeMove,moves to that location.
6.Because critter extend actor and by default it uses its constructor.

1.Because it does overrids the processActors and makeMove methods which get called by the act method.
2.Because it first changes the direction of the critter and then calls super.makeMove to run the method normally.
3.Keep track of its current location and then when it makeMove drop a flower.
4.because ChameloneCritter does not overide it.
5.The Actor class
6.getGrid method.

1.It does not need to override it.
2.It eats neighboring actors that are infront, to its right, and left.
3.to return valid adjacent locations.
4.(4,4),(4,3),(4,5)
5.they both do not turn in the direction they are moving to. A crabcritter only moves to its left or its right.
6.if loc in makeMove is its current location.
7.Because critters don't eat each other.



