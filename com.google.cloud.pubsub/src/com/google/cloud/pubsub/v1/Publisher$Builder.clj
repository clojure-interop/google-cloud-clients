(ns com.google.cloud.pubsub.v1.Publisher$Builder
  "A builder of Publishers."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 Publisher$Builder]))

(defn set-enable-message-ordering
  "Sets the message ordering option.

  enable-message-ordering - `boolean`

  returns: `(value="Ordering is not yet fully supported and requires special project enablements.")  com.google.cloud.pubsub.v1.Publisher$Builder`"
  ([^Publisher$Builder this ^Boolean enable-message-ordering]
    (-> this (.setEnableMessageOrdering enable-message-ordering))))

(defn set-credentials-provider
  "CredentialsProvider to use to create Credentials to authenticate calls.

  credentials-provider - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn set-channel-provider
  "ChannelProvider to use to create Channels, which must point at Cloud Pub/Sub
   endpoint.

   For performance, this client benefits from having multiple underlying connections. See
   InstantiatingGrpcChannelProvider.Builder.setPoolSize(int).

  channel-provider - `com.google.api.gax.rpc.TransportChannelProvider`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.rpc.TransportChannelProvider channel-provider]
    (-> this (.setChannelProvider channel-provider))))

(defn build
  "returns: `com.google.cloud.pubsub.v1.Publisher`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.Publisher [^Publisher$Builder this]
    (-> this (.build))))

(defn set-batching-settings
  "batching-settings - `com.google.api.gax.batching.BatchingSettings`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.batching.BatchingSettings batching-settings]
    (-> this (.setBatchingSettings batching-settings))))

(defn set-executor-provider
  "Gives the ability to set a custom executor to be used by the library.

  executor-provider - `com.google.api.gax.core.ExecutorProvider`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.core.ExecutorProvider executor-provider]
    (-> this (.setExecutorProvider executor-provider))))

(defn set-transform
  "Gives the ability to set an ApiFunction that will transform the PubsubMessage
   before it is sent

  message-transform - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.core.ApiFunction message-transform]
    (-> this (.setTransform message-transform))))

(defn set-retry-settings
  "Configures the Publisher's retry parameters.

  retry-settings - `com.google.api.gax.retrying.RetrySettings`

  returns: `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.retrying.RetrySettings retry-settings]
    (-> this (.setRetrySettings retry-settings))))

(defn set-header-provider
  "Sets the static header provider. The header provider will be called during client
   construction only once. The headers returned by the provider will be cached and supplied as
   is for each request issued by the constructed client. Some reserved headers can be overridden
   (e.g. Content-Type) or merged with the default value (e.g. User-Agent) by the underlying
   transport layer.

  header-provider - the header provider - `com.google.api.gax.rpc.HeaderProvider`

  returns: the builder - `com.google.cloud.pubsub.v1.Publisher$Builder`"
  (^com.google.cloud.pubsub.v1.Publisher$Builder [^Publisher$Builder this ^com.google.api.gax.rpc.HeaderProvider header-provider]
    (-> this (.setHeaderProvider header-provider))))

