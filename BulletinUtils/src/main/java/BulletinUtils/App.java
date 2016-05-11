package BulletinUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        if (args == null || args.length == 0) {
            CommandLineAnalizer.printUsage();
            System.exit(0);
        }
        CommandLineAnalizer cm = new CommandLineAnalizer(args);
        if (cm.isPrintUsage()) {
            CommandLineAnalizer.printUsage();
            System.exit(0);
        }
        
    }
}
