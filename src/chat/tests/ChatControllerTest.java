package chat.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.controller.ChatbotController;
import chat.model.Chatbot;
import chat.view.ChatFrame;

public class ChatControllerTest
{
	private ChatbotController testController;

	@Before
	public void setUp() throws Exception
	{
		testController = new ChatbotController();
	}

	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}

	@Test
	public void testChatController()
	{
		assertNotNull("GUI Frame not installed",testController.getBaseFrame());
		assertTrue("Incorrect display data type", testController.getBaseFrame() instanceof ChatFrame);
		assertNotNull("Chatbot not initialized", testController.getChatbot());
		assertTrue("Incorrect data type", testController.getChatbot() instanceof Chatbot);
	}

}
