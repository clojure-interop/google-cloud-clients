(ns com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings
  "Settings class to configure an instance of NotificationChannelServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getNotificationChannelDescriptor to 30 seconds:



  NotificationChannelServiceStubSettings.Builder notificationChannelServiceSettingsBuilder =
      NotificationChannelServiceStubSettings.newBuilder();
  notificationChannelServiceSettingsBuilder.getNotificationChannelDescriptorSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NotificationChannelServiceStubSettings notificationChannelServiceSettings = notificationChannelServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub NotificationChannelServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NotificationChannelServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NotificationChannelServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NotificationChannelServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NotificationChannelServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (NotificationChannelServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NotificationChannelServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NotificationChannelServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NotificationChannelServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder []
    (NotificationChannelServiceStubSettings/newBuilder )))

(defn delete-notification-channel-settings
  "Returns the object with the settings used for calls to deleteNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteNotificationChannelRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.deleteNotificationChannelSettings))))

(defn create-notification-channel-settings
  "Returns the object with the settings used for calls to createNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.createNotificationChannelSettings))))

(defn get-notification-channel-descriptor-settings
  "Returns the object with the settings used for calls to getNotificationChannelDescriptor.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,com.google.monitoring.v3.NotificationChannelDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.getNotificationChannelDescriptorSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStub`

  throws: java.io.IOException"
  ([^NotificationChannelServiceStubSettings this]
    (-> this (.createStub))))

(defn list-notification-channel-descriptors-settings
  "Returns the object with the settings used for calls to listNotificationChannelDescriptors.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.listNotificationChannelDescriptorsSettings))))

(defn update-notification-channel-settings
  "Returns the object with the settings used for calls to updateNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.UpdateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.updateNotificationChannelSettings))))

(defn list-notification-channels-settings
  "Returns the object with the settings used for calls to listNotificationChannels.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.monitoring.v3.ListNotificationChannelsResponse,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.listNotificationChannelsSettings))))

(defn get-notification-channel-settings
  "Returns the object with the settings used for calls to getNotificationChannel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NotificationChannelServiceStubSettings this]
    (-> this (.getNotificationChannelSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStubSettings$Builder [^NotificationChannelServiceStubSettings this]
    (-> this (.toBuilder))))

