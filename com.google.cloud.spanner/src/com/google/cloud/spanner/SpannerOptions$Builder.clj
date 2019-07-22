(ns com.google.cloud.spanner.SpannerOptions$Builder
  "Builder for SpannerOptions instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SpannerOptions$Builder]))

(defn get-database-admin-stub-settings-builder
  "Returns the DatabaseAdminStubSettings.Builder that will be used to build the SpannerRpc. Use this to set custom RetrySettings for individual gRPC methods.

   The library will automatically use the defaults defined in DatabaseAdminStubSettings if no custom settings are set. The defaults are the same as the
   defaults that are used by DatabaseAdminSettings, and are generated from the file spanner_admin_database_gapic.yaml.
   Retries are configured for idempotent methods but not for non-idempotent methods.

   You can set the same RetrySettings for all unary methods by calling this:



   builder
       .getDatabaseAdminStubSettingsBuilder()
       .applyToAllUnaryMethods(
           new ApiFunction<UnaryCallSettings.Builder<?, ?>, Void>() {
             public Void apply(Builder<?, ?> input) {
               input.setRetrySettings(retrySettings);
               return null;
             }
           });

  returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder`"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder [^SpannerOptions$Builder this]
    (-> this (.getDatabaseAdminStubSettingsBuilder))))

(defn set-session-pool-option
  "Sets the options for managing the session pool. If not specified then the default SessionPoolOptions is used.

  session-pool-options - `com.google.cloud.spanner.SessionPoolOptions`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.cloud.spanner.SessionPoolOptions session-pool-options]
    (-> this (.setSessionPoolOption session-pool-options))))

(defn get-spanner-stub-settings-builder
  "Returns the SpannerStubSettings.Builder that will be used to build the SpannerRpc. Use this to set custom RetrySettings for individual gRPC methods.

   The library will automatically use the defaults defined in SpannerStubSettings if
   no custom settings are set. The defaults are the same as the defaults that are used by SpannerSettings, and are generated from the file spanner_gapic.yaml.
   Retries are configured for idempotent methods but not for non-idempotent methods.

   You can set the same RetrySettings for all unary methods by calling this:



   builder
       .getSpannerStubSettingsBuilder()
       .applyToAllUnaryMethods(
           new ApiFunction<UnaryCallSettings.Builder<?, ?>, Void>() {
             public Void apply(Builder<?, ?> input) {
               input.setRetrySettings(retrySettings);
               return null;
             }
           });

  returns: `com.google.cloud.spanner.v1.stub.SpannerStubSettings$Builder`"
  (^com.google.cloud.spanner.v1.stub.SpannerStubSettings$Builder [^SpannerOptions$Builder this]
    (-> this (.getSpannerStubSettingsBuilder))))

(defn set-channel-provider
  "Sets the ChannelProvider. GapicSpannerRpc would create a default one if none
   is provided.

  channel-provider - `com.google.api.gax.rpc.TransportChannelProvider`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.api.gax.rpc.TransportChannelProvider channel-provider]
    (-> this (.setChannelProvider channel-provider))))

(defn set-interceptor-provider
  "Sets the GrpcInterceptorProvider. GapicSpannerRpc would create a default one
   if none is provided.

  interceptor-provider - `com.google.api.gax.grpc.GrpcInterceptorProvider`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.api.gax.grpc.GrpcInterceptorProvider interceptor-provider]
    (-> this (.setInterceptorProvider interceptor-provider))))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn set-num-channels
  "Sets the number of gRPC channels to use. By default 4 channels are created per SpannerOptions.

  num-channels - `int`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^Integer num-channels]
    (-> this (.setNumChannels num-channels))))

(defn set-prefetch-chunks
  "Specifying this will allow the client to prefetch up to prefetchChunks PartialResultSet chunks for each read and query. The data size of each chunk depends on the
   server implementation but a good rule of thumb is that each chunk will be up to 1 MiB. Larger
   values reduce the likelihood of blocking while consuming results at the cost of greater
   memory consumption. prefetchChunks should be greater than 0. To get good performance
   choose a value that is large enough to allow buffering of chunks for an entire row. Apart
   from the buffered chunks, there can be at most one more row buffered in the client. This can
   be overriden on a per read/query basis by Options.prefetchChunks(). If unspecified,
   we will use a default value (currently 4).

  prefetch-chunks - `int`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^Integer prefetch-chunks]
    (-> this (.setPrefetchChunks prefetch-chunks))))

(defn build
  "returns: `com.google.cloud.spanner.SpannerOptions`"
  (^com.google.cloud.spanner.SpannerOptions [^SpannerOptions$Builder this]
    (-> this (.build))))

(defn get-instance-admin-stub-settings-builder
  "Returns the InstanceAdminStubSettings.Builder that will be used to build the SpannerRpc. Use this to set custom RetrySettings for individual gRPC methods.

   The library will automatically use the defaults defined in InstanceAdminStubSettings if no custom settings are set. The defaults are the same as the
   defaults that are used by InstanceAdminSettings, and are generated from the file spanner_admin_instance_gapic.yaml.
   Retries are configured for idempotent methods but not for non-idempotent methods.

   You can set the same RetrySettings for all unary methods by calling this:



   builder
       .getInstanceAdminStubSettingsBuilder()
       .applyToAllUnaryMethods(
           new ApiFunction<UnaryCallSettings.Builder<?, ?>, Void>() {
             public Void apply(Builder<?, ?> input) {
               input.setRetrySettings(retrySettings);
               return null;
             }
           });

  returns: `com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder`"
  (^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder [^SpannerOptions$Builder this]
    (-> this (.getInstanceAdminStubSettingsBuilder))))

(defn set-session-labels
  "Sets the labels to add to all Sessions created in this client.

  session-labels - Map from label key to label value. Label key and value cannot be null. For more information on valid syntax see api docs . - `java.util.Map`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^java.util.Map session-labels]
    (-> this (.setSessionLabels session-labels))))

(defn set-channel-configurator
  "Sets an ApiFunction that will be used to configure the transport channel. This will
   only be used if no custom TransportChannelProvider has been set.

  channel-configurator - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.api.core.ApiFunction channel-configurator]
    (-> this (.setChannelConfigurator channel-configurator))))

(defn set-partitioned-dml-timeout
  "Sets a timeout specifically for Partitioned DML statements executed through DatabaseClient.executePartitionedUpdate(Statement). The default is 2 hours.

  timeout - `org.threeten.bp.Duration`

  returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^org.threeten.bp.Duration timeout]
    (-> this (.setPartitionedDmlTimeout timeout))))

(defn set-retry-settings
  "SpannerOptions.Builder does not support global retry settings, as it creates three
   different gRPC clients: Spanner, DatabaseAdminClient and InstanceAdminClient. Instead of calling this method, you should set specific RetrySettings for each of the underlying gRPC clients by calling respectively getSpannerStubSettingsBuilder(), getDatabaseAdminStubSettingsBuilder() or getInstanceAdminStubSettingsBuilder().

  retry-settings - `com.google.api.gax.retrying.RetrySettings`

  returns: the builder - `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions$Builder this ^com.google.api.gax.retrying.RetrySettings retry-settings]
    (-> this (.setRetrySettings retry-settings))))

