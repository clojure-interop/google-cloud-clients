(ns com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStub
  "Base stub class for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub NotificationChannelServiceStub]))

(defn ->notification-channel-service-stub
  "Constructor."
  (^NotificationChannelServiceStub []
    (new NotificationChannelServiceStub )))

(defn list-notification-channel-descriptors-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.listNotificationChannelDescriptorsPagedCallable))))

(defn list-notification-channels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.listNotificationChannelsPagedCallable))))

(defn get-notification-channel-descriptor-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,com.google.monitoring.v3.NotificationChannelDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.getNotificationChannelDescriptorCallable))))

(defn list-notification-channels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.monitoring.v3.ListNotificationChannelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.listNotificationChannelsCallable))))

(defn get-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.getNotificationChannelCallable))))

(defn delete-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteNotificationChannelRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.deleteNotificationChannelCallable))))

(defn close
  ""
  ([^NotificationChannelServiceStub this]
    (-> this (.close))))

(defn list-notification-channel-descriptors-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.listNotificationChannelDescriptorsCallable))))

(defn create-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.createNotificationChannelCallable))))

(defn update-notification-channel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceStub this]
    (-> this (.updateNotificationChannelCallable))))

