(ns com.google.cloud.pubsub.v1.OpenCensusUtil$OpenCensusMessageReceiver
  "Wrapper class for MessageReceiver that decodes any received trace and tag contexts and
  puts them in scope."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 OpenCensusUtil$OpenCensusMessageReceiver]))

(defn ->open-census-message-receiver
  "Constructor.

  receiver - `com.google.cloud.pubsub.v1.MessageReceiver`"
  (^OpenCensusUtil$OpenCensusMessageReceiver [^com.google.cloud.pubsub.v1.MessageReceiver receiver]
    (new OpenCensusUtil$OpenCensusMessageReceiver receiver)))

(defn receive-message
  "Description copied from interface: MessageReceiver

  message - `com.google.pubsub.v1.PubsubMessage`
  consumer - `com.google.cloud.pubsub.v1.AckReplyConsumer`"
  ([^OpenCensusUtil$OpenCensusMessageReceiver this ^com.google.pubsub.v1.PubsubMessage message ^com.google.cloud.pubsub.v1.AckReplyConsumer consumer]
    (-> this (.receiveMessage message consumer))))

