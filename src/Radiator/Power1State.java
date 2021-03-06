package Radiator;

public class Power1State implements RadiatorState
{
  private static final int POWER = 1;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setCurrentState(new Power2State());
  }

  @Override public void turnDown(Radiator radiator)
  {
    radiator.setCurrentState(new OffState());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
