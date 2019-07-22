(ns com.google.cloud.monitoring.v3.NotificationChannelServiceSettings$Builder
  "Builder for NotificationChannelServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 NotificationChannelServiceSettings$Builder]))

(defn delete-notification-channel-settings
  "Returns the builder for the settings used for calls to deleteNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteNotificationChannelRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.deleteNotificationChannelSettings))))

(defn create-notification-channel-settings
  "Returns the builder for the settings used for calls to createNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.createNotificationChannelSettings))))

(defn get-notification-channel-descriptor-settings
  "Returns the builder for the settings used for calls to getNotificationChannelDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,com.google.monitoring.v3.NotificationChannelDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.getNotificationChannelDescriptorSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceSettings$Builder [^NotificationChannelServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-notification-channel-descriptors-settings
  "Returns the builder for the settings used for calls to listNotificationChannelDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.listNotificationChannelDescriptorsSettings))))

(defn update-notification-channel-settings
  "Returns the builder for the settings used for calls to updateNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.UpdateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.updateNotificationChannelSettings))))

(defn list-notification-channels-settings
  "Returns the builder for the settings used for calls to listNotificationChannels.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.monitoring.v3.ListNotificationChannelsResponse,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.listNotificationChannelsSettings))))

(defn get-notification-channel-settings
  "Returns the builder for the settings used for calls to getNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.getNotificationChannelSettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceSettings [^NotificationChannelServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder [^NotificationChannelServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

