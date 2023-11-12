package es.iesjandula.pokemon_game;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author David Martinez
 *
 */
public class Launcher
{
	/** Attribute logger */
	private static final Logger logger = LogManager.getLogger();
	/**
	 * Method main
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		//---USING NIMBUS LOOK AND FEELS JAVA SWING---
		try
		{
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (Exception exception)
		{
			String errorInfo = "Nimbus not loaded";
			logger.info(errorInfo,exception);
			// If Nimbus is not available, you can set the GUI to another look and feel (DEFAULT).
			try
			{
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			}
			catch (ClassNotFoundException exceptionOther)
			{
				String errorOther = "Class Not Found Exception";
				logger.error(errorOther,exception);
			}
			catch (InstantiationException exceptionOther)
			{
				String errorOther = "Class Not Found Exception";
				logger.error(errorOther,exception);
			}
			catch (IllegalAccessException exceptionOther)
			{
				String errorOther = "Class Not Found Exception";
				logger.error(errorOther,exception);
			}
			catch (UnsupportedLookAndFeelException exceptionOther)
			{
				String errorOther = "Class Not Found Exception";
				logger.error(errorOther,exception);
			}
		}
		// ---CREATE A NEW LAUNCHER OBJECT----
		Launcher launcher = new Launcher();

		// ---LAUNCH THE RUN METHOD----
		launcher.run(args);
	}

	/**
	 * Method run
	 *
	 * @param args
	 */
	private void run(String[] args)
	{

		// ---CREATE AND SET VISIBLE THE GAME INTRO----
		PokemonGameIntro gameIntro = new PokemonGameIntro();
		gameIntro.setVisible(true);
	}
}
