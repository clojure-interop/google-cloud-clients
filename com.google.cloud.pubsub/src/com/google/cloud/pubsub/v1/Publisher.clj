(ns com.google.cloud.pubsub.v1.Publisher
  "A Cloud Pub/Sub publisher, that is
  associated with a specific topic at creation.

  A Publisher provides built-in capabilities to automatically handle batching of
  messages, controlling memory utilization, and retrying API calls on transient errors.

  With customizable options that control:


    Message batching: such as number of messages or max batch byte size.
    Retries: such as the maximum duration of retries for a failing batch of messages.


  Publisher will use the credentials set on the channel, which uses application default
  credentials through GoogleCredentials.getApplicationDefault() by default."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 Publisher]))

(defn *get-api-max-request-element-count
  "The maximum number of messages in one request. Defined by the API.

  returns: `long`"
  (^Long []
    (Publisher/getApiMaxRequestElementCount )))

(defn *get-api-max-request-bytes
  "The maximum size of one request. Defined by the API.

  returns: `long`"
  (^Long []
    (Publisher/getApiMaxRequestBytes )))

(defn *new-builder
  "Constructs a new Publisher.Builder using the given topic.

   Example of creating a Publisher.



   String projectName = \"my_project\";
   String topicName = \"my_topic\";
   ProjectTopicName topic = ProjectTopicName.create(projectName, topicName);
   Publisher publisher = Publisher.newBuilder(topic).build();
   try {
     // ...
   } finally {
     // When finished with the publisher, make sure to shutdown to free up resources.
     publisher.shutdown();
     publisher.awaitTermination(1, TimeUnit.MINUTES);
   }

  topic-name - `com.google.pubsub.v1.TopicName`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^com.google.pubsub.v1.TopicName topic-name]
    (Publisher/newBuilder topic-name)))

(defn get-topic-name
  "Topic which the publisher publishes to.

  returns: `com.google.pubsub.v1.TopicName`"
  (^com.google.pubsub.v1.TopicName [^Publisher this]
    (-> this (.getTopicName))))

(defn get-topic-name-string
  "Topic which the publisher publishes to.

  returns: `java.lang.String`"
  (^java.lang.String [^Publisher this]
    (-> this (.getTopicNameString))))

(defn publish
  "Schedules the publishing of a message. The publishing of the message may occur immediately or
   be delayed based on the publisher batching options.

   Example of publishing a message.



   String message = \"my_message\";
   ByteString data = ByteString.copyFromUtf8(message);
   PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();
   ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);
   ApiFutures.addCallback(messageIdFuture, new ApiFutureCallback<String>() {
     public void onSuccess(String messageId) {
       System.out.println(\"published with message id: \"  messageId);
     }

     public void onFailure(Throwable t) {
       System.out.println(\"failed to publish: \"  t);
     }
   });

  message - the message to publish. - `com.google.pubsub.v1.PubsubMessage`

  returns: the message ID wrapped in a future. - `com.google.api.core.ApiFuture<java.lang.String>`"
  (^com.google.api.core.ApiFuture [^Publisher this ^com.google.pubsub.v1.PubsubMessage message]
    (-> this (.publish message))))

(defn resume-publish
  "There may be non-recoverable problems with a request for an ordering key. In that case, all
   subsequent requests will fail until this method is called. If the key is not currently paused,
   calling this method will be a no-op.

  key - The key for which to resume publishing. - `java.lang.String`

  returns: `(value="Ordering is not yet fully supported and requires special project enablements.")  void`"
  ([^Publisher this ^java.lang.String key]
    (-> this (.resumePublish key))))

(defn publish-all-outstanding
  "Publish any outstanding batches if non-empty. This method sends buffered messages, but does not
   wait for the send operations to complete. To wait for messages to send, call get on the
   futures returned from publish."
  ([^Publisher this]
    (-> this (.publishAllOutstanding))))

(defn get-batching-settings
  "The batching settings configured on this Publisher.

  returns: `com.google.api.gax.batching.BatchingSettings`"
  (^com.google.api.gax.batching.BatchingSettings [^Publisher this]
    (-> this (.getBatchingSettings))))

(defn shutdown
  "Schedules immediate publishing of any outstanding messages and waits until all are processed.

   Sends remaining outstanding messages and prevents future calls to publish. This method
   should be invoked prior to deleting the Publisher object in order to ensure that no
   pending messages are lost."
  ([^Publisher this]
    (-> this (.shutdown))))

(defn await-termination
  "Wait for all work has completed execution after a shutdown() request, or the timeout
   occurs, or the current thread is interrupted.

   Call this method to make sure all resources are freed properly.

  duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^Publisher this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

