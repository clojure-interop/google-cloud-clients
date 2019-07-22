(ns com.google.cloud.spanner.SpannerOptions
  "Options for the Cloud Spanner service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner SpannerOptions]))

(defn *get-default-instance
  "Returns default instance of SpannerOptions.

  returns: `com.google.cloud.spanner.SpannerOptions`"
  (^com.google.cloud.spanner.SpannerOptions []
    (SpannerOptions/getDefaultInstance )))

(defn *new-builder
  "returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder []
    (SpannerOptions/newBuilder )))

(defn *get-default-grpc-transport-options
  "returns: `com.google.cloud.grpc.GrpcTransportOptions`"
  (^com.google.cloud.grpc.GrpcTransportOptions []
    (SpannerOptions/getDefaultGrpcTransportOptions )))

(defn get-partitioned-dml-timeout
  "returns: `org.threeten.bp.Duration`"
  (^org.threeten.bp.Duration [^SpannerOptions this]
    (-> this (.getPartitionedDmlTimeout))))

(defn get-scopes
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^SpannerOptions this]
    (-> this (.getScopes))))

(defn get-spanner-stub-settings
  "returns: `com.google.cloud.spanner.v1.stub.SpannerStubSettings`"
  (^com.google.cloud.spanner.v1.stub.SpannerStubSettings [^SpannerOptions this]
    (-> this (.getSpannerStubSettings))))

(defn get-session-pool-options
  "returns: `com.google.cloud.spanner.SessionPoolOptions`"
  (^com.google.cloud.spanner.SessionPoolOptions [^SpannerOptions this]
    (-> this (.getSessionPoolOptions))))

(defn get-interceptor-provider
  "returns: `com.google.api.gax.grpc.GrpcInterceptorProvider`"
  (^com.google.api.gax.grpc.GrpcInterceptorProvider [^SpannerOptions this]
    (-> this (.getInterceptorProvider))))

(defn get-channel-configurator
  "returns: `com.google.api.core.ApiFunction<io.grpc.ManagedChannelBuilder,io.grpc.ManagedChannelBuilder>`"
  (^com.google.api.core.ApiFunction [^SpannerOptions this]
    (-> this (.getChannelConfigurator))))

(defn get-prefetch-chunks
  "returns: `int`"
  (^Integer [^SpannerOptions this]
    (-> this (.getPrefetchChunks))))

(defn get-endpoint
  "returns: `java.lang.String`"
  (^java.lang.String [^SpannerOptions this]
    (-> this (.getEndpoint))))

(defn get-session-labels
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^SpannerOptions this]
    (-> this (.getSessionLabels))))

(defn get-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider [^SpannerOptions this]
    (-> this (.getChannelProvider))))

(defn get-num-channels
  "returns: `int`"
  (^Integer [^SpannerOptions this]
    (-> this (.getNumChannels))))

(defn get-instance-admin-stub-settings
  "returns: `com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings`"
  (^com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings [^SpannerOptions this]
    (-> this (.getInstanceAdminStubSettings))))

(defn get-database-admin-stub-settings
  "returns: `com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings`"
  (^com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings [^SpannerOptions this]
    (-> this (.getDatabaseAdminStubSettings))))

(defn to-builder
  "returns: `com.google.cloud.spanner.SpannerOptions$Builder`"
  (^com.google.cloud.spanner.SpannerOptions$Builder [^SpannerOptions this]
    (-> this (.toBuilder))))

