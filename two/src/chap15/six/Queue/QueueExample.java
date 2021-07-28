package chap15.six.Queue;

import java.util.LinkedList;
import java.util.Queue;




public class QueueExample {

	public static void main(String[] args) {
		Queue<Message>messagesQueue =new LinkedList<Message>();
		
		messagesQueue.offer(new Message("sendMail","홍길동"));
		messagesQueue.offer(new Message("sendSMS","신용권"));
		messagesQueue.offer(new Message("sendMail","홍두께"));
		
		while (!messagesQueue.isEmpty()) {
			Message message = MessageQueue.poll()
		}
ddd

	}

}
