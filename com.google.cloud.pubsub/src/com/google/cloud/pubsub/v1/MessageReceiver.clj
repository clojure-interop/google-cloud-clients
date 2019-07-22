(ns com.google.cloud.pubsub.v1.MessageReceiver
  "This interface can be implemented by users of Subscriber to receive messages."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 MessageReceiver]))

(defn receive-message
  "Called when a message is received by the subscriber. The implementation must arrange for AckReplyConsumer.ack() or AckReplyConsumer.nack() to be called after processing the
   message.
   SNIPPET receiveMessage



   // This {@code MessageReceiver} passes all messages to a {@link BlockingQueue}. This method can
   // be called concurrently from multiple threads, so it is important that the queue be
   // thread-safe.
   //
   // This example is for illustration. Implementations may directly process messages instead of
   // sending them to queues.
   MessageReceiver receiver =
       new MessageReceiver() {
         public void receiveMessage(final PubsubMessage message, final AckReplyConsumer consumer) {
           if (blockingQueue.offer(message)) {
             consumer.ack();
           } else {
             consumer.nack();
           }
         }
       };

   SNIPPET receiveMessage

  message - `com.google.pubsub.v1.PubsubMessage`
  consumer - `com.google.cloud.pubsub.v1.AckReplyConsumer`"
  ([^MessageReceiver this ^com.google.pubsub.v1.PubsubMessage message ^com.google.cloud.pubsub.v1.AckReplyConsumer consumer]
    (-> this (.receiveMessage message consumer))))

