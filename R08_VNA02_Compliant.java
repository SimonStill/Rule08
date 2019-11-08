/******************************************************************************
 *  Rule08 - VNA02
 *  Compliant
 ******************************************************************************/

final class Flag {
  private boolean flag = true;
 
  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }
 
  public synchronized boolean getFlag() {
    return flag;
  }
}


