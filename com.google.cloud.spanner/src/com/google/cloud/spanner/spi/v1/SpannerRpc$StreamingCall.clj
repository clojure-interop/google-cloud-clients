(ns com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall
  "Handle for cancellation of a streaming read or query call."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerRpc$StreamingCall]))

(defn request
  "Requests more messages from the stream. We disable the auto flow control mechanisam in grpc,
   so we need to request messages ourself. This gives us more control over how much buffer we
   maintain in the client. Grpc will request 1 initial message automatically so we don't need to
   call this at the beginning. After that it should be called whenever there is a flow control
   window available based on the flow control setting configured by the client. Currently we do
   not have any flow control so this is called automatically when a message is received.

  num-messages - `int`"
  ([^SpannerRpc$StreamingCall this ^Integer num-messages]
    (-> this (.request num-messages))))

(defn cancel
  "Cancels the call.

  message - a message to use in the final status of any underlying RPC - `java.lang.String`"
  ([^SpannerRpc$StreamingCall this ^java.lang.String message]
    (-> this (.cancel message))))

