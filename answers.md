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



