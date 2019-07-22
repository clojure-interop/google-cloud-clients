(ns com.google.cloud.pubsub.v1.Subscriber
  "A Cloud Pub/Sub subscriber that is
  associated with a specific subscription at creation.

  A Subscriber allows you to provide an implementation of a receiver to which messages are going to be delivered as soon as they are received by the
  subscriber. The delivered messages then can be acked or nacked at will as they get processed by the receiver. Nacking a messages
  implies a later redelivery of such message.

  The subscriber handles the ack management, by automatically extending the ack deadline while
  the message is being processed, to then issue the ack or nack of such message when the processing
  is done (see Subscriber.Builder.setMaxAckExtensionPeriod(Duration)). Note: message
  redelivery is still possible.

  It also provides customizable options that control:


    Ack deadline extension: such as the amount of time ahead to trigger the extension of
        message acknowledgement expiration.
    Flow control: such as the maximum outstanding messages or maximum outstanding bytes to keep
        in memory before the receiver either ack or nack them.


  Subscriber will use the credentials set on the channel, which uses application default
  credentials through GoogleCredentials.getApplicationDefault() by default.

  Subscriber is implemented using Guava's
  Service and provides the same methods. See Guava documentation for more
  details."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 Subscriber]))

(defn *new-builder
  "Constructs a new Subscriber.Builder.

  subscription - Cloud Pub/Sub subscription to bind the subscriber to - `com.google.pubsub.v1.ProjectSubscriptionName`
  receiver - an implementation of MessageReceiver used to process the received messages - `com.google.cloud.pubsub.v1.MessageReceiver`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^com.google.pubsub.v1.ProjectSubscriptionName subscription ^com.google.cloud.pubsub.v1.MessageReceiver receiver]
    (Subscriber/newBuilder subscription receiver)))

(defn get-subscription-name-string
  "Subscription which the subscriber is subscribed to.

  returns: `java.lang.String`"
  (^java.lang.String [^Subscriber this]
    (-> this (.getSubscriptionNameString))))

(defn get-flow-control-settings
  "The flow control settings the Subscriber is configured with.

  returns: `com.google.api.gax.batching.FlowControlSettings`"
  (^com.google.api.gax.batching.FlowControlSettings [^Subscriber this]
    (-> this (.getFlowControlSettings))))

(defn start-async
  "Initiates service startup and returns immediately.

   Example of receiving a specific number of messages.



   Subscriber subscriber = Subscriber.newBuilder(subscription, receiver).build();
   subscriber.addListener(new Subscriber.Listener() {
     public void failed(Subscriber.State from, Throwable failure) {
       // Handle error.
     }
   }, executor);
   subscriber.startAsync();

   // Wait for a stop signal.
   // In a server, this might be a signal to stop serving.
   // In this example, the signal is just a dummy Future.
   //
   // By default, Subscriber uses daemon threads (see
   // https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html).
   // Consequently, once other threads have terminated, Subscriber will not stop the JVM from
   // exiting.
   // If the Subscriber should simply run forever, either use the setExecutorProvider method in
   // Subscriber.Builder
   // to use non-daemon threads or run
   //   for (;;) {
   //     Thread.sleep(Long.MAX_VALUE);
   //   }
   // at the end of main() to previent the main thread from exiting.
   done.get();
   subscriber.stopAsync().awaitTerminated();

  returns: `com.google.api.core.ApiService`"
  (^com.google.api.core.ApiService [^Subscriber this]
    (-> this (.startAsync))))

