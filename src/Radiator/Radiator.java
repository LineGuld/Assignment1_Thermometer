package Radiator;

public class Radiator
{
  private RadiatorState currentState = new OffState();

  public void turnUp()
  {
    currentState.turnUp(this);
  }

  public void turnDown()
  {
    currentState.turnDown(this);
  }

  public int getPower()
  {
    return currentState.getPower();
  }

  void setCurrentState(RadiatorState state)
  {
    //TODO: FirePropertyEvent("State", old state, new state)
    currentState = state;
  }
}
