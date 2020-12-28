package may.huakai.design.activeobj;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class SleepCommand implements Command {

    private Command wakeupCommand = null;
    private ActiveObjectEngie engie = null;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean started = false;

    public SleepCommand(long sleepTime, ActiveObjectEngie engie, Command wakeupCommand) {
        this.sleepTime = sleepTime;
        this.engie = engie;
        this.wakeupCommand = wakeupCommand;
    }

    @Override
    public void execute() {
        long currentTime = System.currentTimeMillis();
        if (!started) {
            started = true;
            startTime = currentTime;
            engie.addCommand(this);
        } else if ((currentTime - startTime) < sleepTime) {
            engie.addCommand(this);
        } else {
            engie.addCommand(wakeupCommand);
        }
    }
}
