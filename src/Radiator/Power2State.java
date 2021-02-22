public class Power2State implements RadiatorState
{
  private static final int POWER = 2;

  @Override public void turnUp(Radiator radiator)
  {
    radiator.setCurrentState(new Power3State(radiator));
  }

  @Override public void turnDown(Radiator radiator)
  {
    radiator.setCurrentState(new Power1State());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
