(ns com.google.cloud.pubsub.v1.AckReplyConsumer
  "Accepts a reply, sending it to the service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 AckReplyConsumer]))

(defn ack
  "Acknowledges that the message has been successfully processed. The service will not send the
   message again."
  ([^AckReplyConsumer this]
    (-> this (.ack))))

(defn nack
  "Signals that the message has not been successfully processed. The service should resend the
   message."
  ([^AckReplyConsumer this]
    (-> this (.nack))))

