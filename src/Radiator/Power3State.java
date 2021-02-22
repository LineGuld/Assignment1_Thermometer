public class Power3State implements RadiatorState
{
  private static final int POWER = 3;
  private final Thread t;

  public Power3State(Radiator radiator)
  {
    t = new Thread(() -> {
      try
      {
        Thread.sleep(10000);
        radiator.setCurrentState(new Power2State());
      }
      catch (InterruptedException ignored)
      {}
    });

    t.setDaemon(true);
    t.start();
  }

  @Override public void turnUp(Radiator radiator)
  {
    //Do nothing
  }

  @Override public void turnDown(Radiator radiator)
  {
    t.interrupt();
    radiator.setCurrentState(new Power2State());
  }

  @Override public int getPower()
  {
    return POWER;
  }
}
