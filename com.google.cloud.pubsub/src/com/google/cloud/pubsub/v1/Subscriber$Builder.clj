(ns com.google.cloud.pubsub.v1.Subscriber$Builder
  "Builder of Subscribers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 Subscriber$Builder]))

(defn set-parallel-pull-count
  "Sets the number of pullers used to pull messages from the subscription. Defaults to one.

  parallel-pull-count - `int`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^Integer parallel-pull-count]
    (-> this (.setParallelPullCount parallel-pull-count))))

(defn set-credentials-provider
  "CredentialsProvider to use to create Credentials to authenticate calls.

  credentials-provider - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn set-channel-provider
  "ChannelProvider to use to create Channels, which must point at Cloud Pub/Sub
   endpoint.

   For performance, this client benefits from having multiple channels open at once. Users
   are encouraged to provide instances of ChannelProvider that creates new channels
   instead of returning pre-initialized ones.

  channel-provider - `com.google.api.gax.rpc.TransportChannelProvider`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.rpc.TransportChannelProvider channel-provider]
    (-> this (.setChannelProvider channel-provider))))

(defn set-system-executor-provider
  "Gives the ability to set a custom executor for managing lease extensions. If none is provided
   a shared one will be used by all Subscriber instances.

  executor-provider - `com.google.api.gax.core.ExecutorProvider`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.core.ExecutorProvider executor-provider]
    (-> this (.setSystemExecutorProvider executor-provider))))

(defn build
  "returns: `com.google.cloud.pubsub.v1.Subscriber`"
  (^com.google.cloud.pubsub.v1.Subscriber [^Subscriber$Builder this]
    (-> this (.build))))

(defn set-max-ack-extension-period
  "Set the maximum period a message ack deadline will be extended. Defaults to one hour.

   It is recommended to set this value to a reasonable upper bound of the subscriber time to
   process any message. This maximum period avoids messages to be locked by a subscriber
   in cases when the ack reply is lost.

   A zero duration effectively disables auto deadline extensions.

  max-ack-extension-period - `org.threeten.bp.Duration`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^org.threeten.bp.Duration max-ack-extension-period]
    (-> this (.setMaxAckExtensionPeriod max-ack-extension-period))))

(defn set-flow-control-settings
  "Sets the flow control settings.

   In the example below, the Subscriber will make sure that


     there are at most ten thousand outstanding messages, and
     the combined size of outstanding messages does not exceed 1GB.


   \"Outstanding messages\" here means the messages that have already been given to MessageReceiver but not yet acked() or nacked().



   FlowControlSettings flowControlSettings =
    FlowControlSettings.newBuilder()
        .setMaxOutstandingElementCount(10_000L)
        .setMaxOutstandingRequestBytes(1_000_000_000L)
        .build();
   Subscriber subscriber =
       Subscriber.newBuilder(subscriptionName, receiver)
           .setFlowControlSettings(flowControlSettings)
           .build();

  flow-control-settings - `com.google.api.gax.batching.FlowControlSettings`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.batching.FlowControlSettings flow-control-settings]
    (-> this (.setFlowControlSettings flow-control-settings))))

(defn set-executor-provider
  "Gives the ability to set a custom executor. ExecutorProvider.getExecutor() will be
   called parallelPullCount times.

  executor-provider - `com.google.api.gax.core.ExecutorProvider`

  returns: `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.core.ExecutorProvider executor-provider]
    (-> this (.setExecutorProvider executor-provider))))

(defn set-header-provider
  "Sets the static header provider. The header provider will be called during client
   construction only once. The headers returned by the provider will be cached and supplied as
   is for each request issued by the constructed client. Some reserved headers can be overridden
   (e.g. Content-Type) or merged with the default value (e.g. User-Agent) by the underlying
   transport layer.

  header-provider - the header provider - `com.google.api.gax.rpc.HeaderProvider`

  returns: the builder - `com.google.cloud.pubsub.v1.Subscriber$Builder`"
  (^com.google.cloud.pubsub.v1.Subscriber$Builder [^Subscriber$Builder this ^com.google.api.gax.rpc.HeaderProvider header-provider]
    (-> this (.setHeaderProvider header-provider))))

