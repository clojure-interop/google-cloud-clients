(ns com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceStub
  "gRPC stub implementation for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GrpcNotificationChannelServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcNotificationChannelServiceStub/create client-context callable-factory))
  (^com.google.cloud.monitoring.v3.stub.GrpcNotificationChannelServiceStub [^com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings settings]
    (GrpcNotificationChannelServiceStub/create settings)))

(defn list-notification-channel-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.listNotificationChannelDescriptorsPagedCallable))))

(defn list-notification-channels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.listNotificationChannelsPagedCallable))))

(defn get-notification-channel-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,com.google.monitoring.v3.NotificationChannelDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.getNotificationChannelDescriptorCallable))))

(defn list-notification-channels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.monitoring.v3.ListNotificationChannelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.listNotificationChannelsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcNotificationChannelServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcNotificationChannelServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcNotificationChannelServiceStub this]
    (-> this (.shutdown))))

(defn get-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.getNotificationChannelCallable))))

(defn delete-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteNotificationChannelRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.deleteNotificationChannelCallable))))

(defn close
  ""
  ([^GrpcNotificationChannelServiceStub this]
    (-> this (.close))))

(defn list-notification-channel-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.listNotificationChannelDescriptorsCallable))))

(defn create-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.createNotificationChannelCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcNotificationChannelServiceStub this]
    (-> this (.isTerminated))))

(defn update-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcNotificationChannelServiceStub this]
    (-> this (.updateNotificationChannelCallable))))

(defn shutdown-now
  ""
  ([^GrpcNotificationChannelServiceStub this]
    (-> this (.shutdownNow))))

