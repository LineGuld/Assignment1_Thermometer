public class OffState implements RadiatorState
{
  private static final int POWER = 0;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setCurrentState(new Power1State());
  }

  @Override public void turnDown(Radiator radiator)
  {
    //Do nothing
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
